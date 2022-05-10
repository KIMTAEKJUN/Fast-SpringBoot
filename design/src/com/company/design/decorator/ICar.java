package com.company.design.decorator;

// Decorator Pattern은 기존 뼈대(클래스)는 유지하되, 이후 필요한 형태로 꾸밀 때 사용한다.
public interface ICar {
    int getPrice();
    void showPrice();
}
