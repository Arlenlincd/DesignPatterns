package creation.singleton.hungry;

/**
 * @ClassName: Singleton2
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Singleton2 {

    private static Singleton instance = null;
    static {
        instance = new Singleton();
    }

    private Singleton2() {};

    public static Singleton getInstance() {
        return instance;
    }
}
