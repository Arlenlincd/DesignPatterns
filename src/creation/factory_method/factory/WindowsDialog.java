package creation.factory_method.factory;

import creation.factory_method.buttons.Button;
import creation.factory_method.buttons.WindowsButton;

/**
 * @ClassName: WindowsDialog
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
