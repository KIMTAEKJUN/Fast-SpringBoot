package com.company.design.adapter;

public class SocketAdapter implements Electronic110V {
    // 자기 자신이 연결시켜줘야 할 220V를 가지고 있어야 함
    private Electronic220V electronic220V;

    // 디폴트 생성자에서 220V에 해당하는 제품을 받을 거임
    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
