package com.company.design.observer;

// Observer Pattern는 변화가 일어 났을 때, 미리 등록된 다른 클래스에 통보해주는 패턴을 구현한 것이다.
public interface IButtonListener {
    void clientEvent(String event);
}
