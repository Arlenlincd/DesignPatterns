package creation.abstract_factory.factories;

import creation.abstract_factory.buttons.Button;
import creation.abstract_factory.checkboxes.Checkbox;

/**
 * @ClassName: GUIFactory
 * @Description: 抽象所有产品类型
 * @Author: arlin
 * @Date: 2021/6/27
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
