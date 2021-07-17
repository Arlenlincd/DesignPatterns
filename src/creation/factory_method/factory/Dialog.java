package creation.factory_method.factory;

import creation.factory_method.buttons.Button;

/**
 * @ClassName: Dialog
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
