package creation.abstract_factory.factories;

import creation.abstract_factory.buttons.Button;
import creation.abstract_factory.buttons.WindowsButton;
import creation.abstract_factory.checkboxes.Checkbox;
import creation.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * @ClassName: WindowsFactory
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
