package com.company.design.decorator;

public class Audi implements ICar {
    private int price;

    public Audi(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void showPrice() {
        System.out.println("아우디의 가격은 " + price + "원 입니다.");
    }
}
