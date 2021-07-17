package Behavior.mediator.components;

import Behavior.mediator.mediator.Mediator;

/**
 * @ClassName: Component
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
