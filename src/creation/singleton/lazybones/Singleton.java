package creation.singleton.lazybones;

/**
 * @ClassName: Singleton
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class Singleton {

    private static Singleton instance;

    Singleton() {}

    private static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
