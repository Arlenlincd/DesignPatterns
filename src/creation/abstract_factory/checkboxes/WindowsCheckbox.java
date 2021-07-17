package creation.abstract_factory.checkboxes;

/**
 * @ClassName: WindowsCheckbox
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}