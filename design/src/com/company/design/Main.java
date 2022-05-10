package com.company.design;

import com.company.design.aop.AopBrowser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /* AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동일한가 ?");
        System.out.println(aClient.equals(bClient));

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V cleanerAdapter = new SocketAdapter(cleaner);
        connect(cleanerAdapter);

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);

        Browser browser = new Browser("www.naver.com");
        browser.show();

        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
        browser.show();
        browser.show();
        browser.show();
        browser.show(); */

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();

        IBrowser aopBrowser = new AopBrowser("www.naver.com",
            // 앞뒤로 실행시킬 method -> Runnable을 lambda로 표현
            ()->{
                System.out.println("before");
                start.set(System.currentTimeMillis());
            },

            ()->{
                // 현재 시간
                long now = System.currentTimeMillis();
                // 현재 시간 - 이전 시간
                end.set(now - start.get());
            }
        );
        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }

    // 콘센트
    /* public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    } */
}
