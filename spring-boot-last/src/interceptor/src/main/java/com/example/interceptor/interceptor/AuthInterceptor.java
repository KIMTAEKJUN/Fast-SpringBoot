package com.example.interceptor.interceptor;

import com.example.interceptor.annotation.Auth;
import com.example.interceptor.exception.AuthException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;
import org.springframework.web.util.UriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;

@Slf4j
@Component
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();

        URI uri = UriComponentsBuilder.fromUriString(request.getRequestURI())
                .query(request.getQueryString())
                .build()
                .toUri();

        log.info("Request Url : {}", url);
        boolean hasAnnotation = checkAnnotation(handler, Auth.class);
        log.info("Has Annotation : {}", hasAnnotation);

        // 나의 서버는 모두 public으로 동작을 하는데
        // 단! Auth 권한을 가진 요청에 대해서는 세션, 쿠키 . . .
        if (hasAnnotation) {
            // 권한체크
            String query = uri.getQuery();
            log.info("Query : {}", query);
            if (query.equals("name=steve")) {
                return true;
            }
            throw new AuthException();
        }
        return true;
    }

    private boolean checkAnnotation(Object handler, Class clazz) {
        // Resource - javascript, html . . .
        if (handler instanceof ResourceHttpRequestHandler) {
            return true;
        }

        // Annotation check
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        if (null != handlerMethod.getMethodAnnotation(clazz) || null != handlerMethod.getBeanType().getAnnotation(clazz)) {
            // Auth Annotation 이 있을 때 true
            return true;
        }
        return false;
    }
}
