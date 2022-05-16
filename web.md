# 웹 개발 개론

### 웹 이란 무엇인가?
> (World Wide Web, WWW, W3C)는 인터넷에 연결된 컴퓨터를 통해 사람들이 정보를 공유할 수 있는 전 세계적인 정보 공간을 말한다.  
> <br>
> Web의 용도는 다양하게 나눌 수 있습니다.  
> <br>
> Web Site (웹사이트)  
> google, naver, daum, facebook 등 HTML로 구성된 여러 사이트들  
> <br>
> API (Application Programming Interface) ⭐️ Web Service ⭐️  
> Kakao Open API, Google Open API, Naver Open API 등  
> <br>
> User Interface  
> Chrome, Safari, Explorer, Smart Watch, IP TV 등

<br>

### 웹의 기본 3가지 요소
> URI (Uniform Resource Identifier : 리소스 식별자)  
> 특정 사이트, 특정 쇼핑 목록, 동영상 목록 → 모든 정보에 접근 할 수 있는 정보  
> <br>
> HTTP (HyperText Transfer Protocol : 어플리케이션 컨트롤)  
> GET, POST, PUT, DELETE, OPTIONS, HEAD, TRACE, CONNECT  
> <br>
> HTML (HyperText Markup Language : 하이퍼미디어 포맷)  
> XML을 바탕으로한 범용 문서 포맷 → 이를 이용하여 Chrome, Safari, Explorer에서 사용자가 알아보기 쉬운 형태로 표현

<br>

# REST API

### REST (Representational State Transfer : 자원의 상태 전달) - 네트워크 아키텍처
> 1. Client, Server : 클라이언트와 서버가 서로 독립적으로 분리되어 있어야 한다. <br><br>
> 3. Stateless : 요청에 대해서 클라이언트의 상태를 서버에 저장하지 않는다. <br><br>
> 4. Cache : 클라이언트는 서버의 응답을 Cache(임시저장) 할 수 있어야 한다. 
   → <br> 클라이언트가 Cache를 통해서 응답을 재사용할 수 있어야 하며, 이를 통해서 서버의 부하를 낮춘다. <br><br>
> 5. 계층화 (Layered System) : 서버와 클라이언트 사이에, 방화벽, 게이트웨이, Proxy 등 <br> 다양한 계층 형태로 구성이 가능해야 하며, 이를 확장 할 수 있어야 한다. <br><br>
> 6. 인터페이스 일관성 : 인터페이스의 일관성을 지키고, 아키텍처를 단순화시켜 작은 단위로 분리하여, <br> 클라이언트, 서버가 독립적으로 개선 될 수 있어야 한다. <br><br>
     다음의 인터페이스 일관성이 잘 지켜졌는지에 따라, REST를 잘 사용했는지 판단을 할 수 있다.  
     1. 자원의 식별  
     2. 메세지를 통한 리소스 조작  
     3. 자기 서술적 메세지  
     4. 애플리케이션 상태에 대한 엔진으로써 하이퍼미디어 <br><br>
> 7. Code on Demand (Optional) : 자바 애플릿, 자바스크립트, 플래시 등 특정한 기능을 <br> 서버로 부터 클라이언트가 전달받아 코드를 실행 할 수 있어야 한다.

### 다음의 인터페이스 일관성이 잘 지켜졌는지에 따라, REST를 잘 사용했는지 판단을 할 수 있다.