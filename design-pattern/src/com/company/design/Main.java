package com.company.design;

import com.company.design.strategy.*;

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
        browser.show();

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

        ICar audi = new Audi(1000);
        audi.showPrice();

        // a3
        ICar audi3 = new A3(audi, "A3");
        audi3.showPrice();

        // a4
        ICar audi4 = new A4(audi, "A4");
        audi4.showPrice();

        // a5
        ICar audi5 = new A5(audi, "A5");
        audi5.showPrice();

        Button btn = new Button("버튼");
        btn.addListener(new IButtonListener() {
            @Override
            public void clientEvent(String event) {
                System.out.println(event);
            }
        });
        btn.click("메세지 전달1");
        btn.click("메세지 전달2");
        btn.click("메세지 전달3");
        btn.click("메세지 전달4");

        Ftp ftpClient = new Ftp("www.foo.co.kr", 22, "/home/etc");
        ftpClient.connect();
        ftpClient.moveDirectory();

        Writer writer = new Writer("text.tmp");
        writer.fileConnect();
        writer.fileWrite();

        Reader reader = new Reader("text.tmp");
        reader.fileConnect();
        reader.fileRead();

        SftpClient sftpClient = new SftpClient("www.foo.co.kr", 22, "/home/etc", "text.tmp");
        sftpClient.connect();

        sftpClient.write();
        sftpClient.read();

        sftpClient.disConnect(); */

        Encoder encoder = new Encoder();

        // Base64
        EncodingStrategy base64 = new Base64Strategy();

        // Normal
        EncodingStrategy normal = new NormalStrategy();

        String message = "Hello Java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStrategy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);
    }

    // 콘센트
    /* public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    } */
}
