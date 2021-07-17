package creation.singleton.lazybones;

/**
 * @ClassName: SingletonDoubleCheck
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public class SingletonDoubleCheck {

    private static volatile SingletonDoubleCheck instance;

    SingletonDoubleCheck() {}

    public static SingletonDoubleCheck getInstance() {
        if(instance == null) {
            synchronized(SingletonDoubleCheck.class) {
                if(instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }

}
