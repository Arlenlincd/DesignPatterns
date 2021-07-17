package creation.abstract_factory.factories;

import creation.abstract_factory.buttons.Button;
import creation.abstract_factory.buttons.MacOSButton;
import creation.abstract_factory.checkboxes.Checkbox;
import creation.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * @ClassName: MacOSFactory
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}