package com.company.design.singleton;

// Singleton Pattern은 어떠한 클래스(객체)가 유일하게 1개만 존재 할 때 사용한다.
public class SocketClient {
    private static SocketClient socketClient = null;

    // Singleton Pattern은 디폴트 생성자를 private 막아야 함
    private SocketClient() {}

    // static method를 통해서 getInstance method를 제공해 줘야 함
    public static SocketClient getInstance() {
        // socketClient가 null인 경우
        if (socketClient == null) {
            // 새로 생성함
            socketClient = new SocketClient();
        }
        // 아닌 경우 가지고 있는 socketClient를 return 함
        return socketClient;
    }

    public void connect() {
        System.out.println("connect");
    }
}
