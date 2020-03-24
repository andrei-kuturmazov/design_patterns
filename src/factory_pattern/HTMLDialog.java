package factory_pattern;

import patterns.implementation.factory.HTMLButton;
import patterns.interfaces.factory.Button;
import patterns.interfaces.factory.Dialog;

public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
