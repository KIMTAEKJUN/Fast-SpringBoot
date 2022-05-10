package com.company.design.adapter;

// Adapter Pattern는 호환성이 없는 기존 클래스의 인터페이스를 변환하여 재사용 할 수 있도록 한다.
// 흔히 돼지코라고 불리는 변환기를 예로 들 수 있다.
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
