package patterns.implementation.factory;

import patterns.interfaces.factory.Button;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering new HTML button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("OnClick method result");
    }
}
