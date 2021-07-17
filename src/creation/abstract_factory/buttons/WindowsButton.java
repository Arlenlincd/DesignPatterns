package creation.abstract_factory.buttons;

/**
 * @ClassName: WindowsButton
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
