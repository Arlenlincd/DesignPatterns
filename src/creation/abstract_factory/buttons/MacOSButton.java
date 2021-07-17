package creation.abstract_factory.buttons;

/**
 * @ClassName: MacOSButton
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}