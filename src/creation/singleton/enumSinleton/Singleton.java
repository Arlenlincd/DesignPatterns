package creation.singleton.enumSinleton;

/**
 * @ClassName: Singleton
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/27
 */
public enum Singleton {
    instance;
    private Singleton() {}
    public void doSomething() {
        System.out.println("doSomething");
    }
}
