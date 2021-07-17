package creation.abstract_factory.app;

import creation.abstract_factory.buttons.Button;
import creation.abstract_factory.checkboxes.Checkbox;
import creation.abstract_factory.factories.GUIFactory;

/**
 * @ClassName: Application
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}