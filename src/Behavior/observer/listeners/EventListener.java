package Behavior.observer.listeners;

import java.io.File;

/**
 * @ClassName: EventListener
 * @Description: 通用观察者接口
 * @Author: arlin
 * @Date: 2021/6/28
 */
public interface EventListener {
    void update(String eventType, File file);
}