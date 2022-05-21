package com.company.design.aop;

import com.company.design.proxy.Html;
import com.company.design.proxy.IBrowser;

// Aop Pattern는 Proxy Pattern을 활용하고, 특정한 method라든지 특정한 기능의 앞뒤로 내가 원하는 기능을 할 수 있다.
// 흩어져있는 공통된 기능들을 하나로 묶어줄 수 있다.
public class AopBrowser implements IBrowser {
    // Runnable : Thread의 인터페이스화 된 형태이다.
    // Java에서는 다중상속이 불가능하여 Thread를 상속 받지 못하는 경우 implements로 Runnable을 받아 구현하여 처리 할 수 있다.
    private String url;
    private Html html;
    private Runnable before;
    private Runnable after;

    public AopBrowser(String url, Runnable before, Runnable after) {
        this.url = url;
        this.before = before;
        this.after = after;
    }

    @Override
    public Html show() throws InterruptedException {
        before.run();
        if (html == null) {
            this.html = new Html(url);
            System.out.println("AopBrowser html loading from : " + url);
            Thread.sleep(1500);
        }
        after.run();
        System.out.println("AopBrowser html cache : " + url);
        return html;
    }
}

