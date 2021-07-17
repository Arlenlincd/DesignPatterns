package Behavior.state.states;

import Behavior.state.ui.Player;

/**
 * @ClassName: 通用状态接口
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/6/28
 */
public abstract class State {
    Player player;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     */
    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}