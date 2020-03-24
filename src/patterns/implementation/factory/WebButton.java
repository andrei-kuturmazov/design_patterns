package patterns.implementation.factory;

import patterns.interfaces.factory.Button;

public class WebButton implements Button {
    @Override
    public void render() {
        System.out.println("Hello, world!");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("How are U today?");
    }
}
