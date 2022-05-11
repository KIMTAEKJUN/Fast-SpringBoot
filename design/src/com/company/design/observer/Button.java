package com.company.design.observer;

public class Button {
    private String name;
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }
    public void click(String message) {
        buttonListener.clientEvent(message);
    }

    public void addListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
