package construction.bridge.remotes;

/**
 * @ClassName: Remote
 * @Description: 所有远程控制器的通用接口
 * @Author: arlin
 * @Date: 2021/6/27
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
