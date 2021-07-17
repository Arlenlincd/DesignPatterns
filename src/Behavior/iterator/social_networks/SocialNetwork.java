package Behavior.iterator.social_networks;

import Behavior.iterator.iterators.ProfileIterator;

/**
 * @ClassName: SocialNetwork
 * @Description: 定义通用的社交网络接口
 * @Author: arlin
 * @Date: 2021/6/28
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
