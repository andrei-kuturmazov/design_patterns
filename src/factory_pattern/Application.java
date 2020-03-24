package factory_pattern;

import patterns.interfaces.factory.Dialog;

public class Application {
    private static Dialog dialog;

    public static void main(String... args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WebDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.render();
    }

}
