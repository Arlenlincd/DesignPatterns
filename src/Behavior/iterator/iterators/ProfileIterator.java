package Behavior.iterator.iterators;

import Behavior.iterator.profile.Profile;

/**
 * @ClassName: ProfileIterator
 * @Description: 定义档案接口
 * @Author: arlin
 * @Date: 2021/6/28
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
