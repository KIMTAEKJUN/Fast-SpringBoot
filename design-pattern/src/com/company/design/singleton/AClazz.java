package com.company.design.singleton;

public class AClazz {
    private SocketClient socketClient;

    public AClazz() {
         this.socketClient = SocketClient.getInstance();
        // socketClient = new SocketClient();
    }

    public SocketClient getSocketClient() {
        return socketClient;
    }

    public void setSocketClient(SocketClient socketClient) {
        this.socketClient = socketClient;
    }
}
