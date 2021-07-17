package creation.abstract_factory.checkboxes;

/**
 * @ClassName: MacOSCheckbox
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}