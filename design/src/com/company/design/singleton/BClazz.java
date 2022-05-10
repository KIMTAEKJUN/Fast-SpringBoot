package com.company.design.singleton;

public class BClazz {
    private SocketClient socketClient;

    public BClazz() {
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
