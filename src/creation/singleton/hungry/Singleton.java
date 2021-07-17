package creation.singleton.hungry;

/**
 * @ClassName: Singleton
 * @Description: 饿汉式
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
