package creation.factory_method;

import creation.factory_method.factory.Dialog;
import creation.factory_method.factory.HtmlDialog;
import creation.factory_method.factory.WindowsDialog;

/**
 * 工厂方法是一种创建型设计模式， 解决了在不指定具体类的情况下创建产品对象的问题。
 *
 * 工厂方法定义了一个方法， 且必须使用该方法代替通过直接调用构造函数来创建对象 （ new操作符） 的方式。
 * 子类可重写该方法来更改将被创建的对象所属类。
 */
/**
 * @ClassName: Demo
 * @Description: 生成跨平台的 GUI 元素
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
