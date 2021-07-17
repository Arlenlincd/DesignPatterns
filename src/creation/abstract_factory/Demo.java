package creation.abstract_factory;

import creation.abstract_factory.app.Application;
import creation.abstract_factory.factories.GUIFactory;
import creation.abstract_factory.factories.MacOSFactory;
import creation.abstract_factory.factories.WindowsFactory;

/**
 * 抽象工厂是一种创建型设计模式， 它能创建一系列相关的对象， 而无需指定其具体类。
 */
/**
 * @ClassName: Demo
 * @Description: 跨平台 GUI 组件系列及其创建方式
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
