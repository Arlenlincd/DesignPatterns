package creation.factory_method.buttons;

/**
 * @ClassName: HtmlButton
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class HtmlButton implements Button{

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
