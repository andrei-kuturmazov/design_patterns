package factory_pattern;

import patterns.implementation.factory.WebButton;
import patterns.interfaces.factory.Button;
import patterns.interfaces.factory.Dialog;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WebButton();
    }
}
