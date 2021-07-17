package creation.singleton.staticInner;

/**
 * @ClassName: Singleton
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Singleton {

    Singleton() {}

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
