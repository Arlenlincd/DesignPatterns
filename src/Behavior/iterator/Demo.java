package Behavior.iterator;

import Behavior.iterator.profile.Profile;
import Behavior.iterator.social_networks.Facebook;
import Behavior.iterator.social_networks.LinkedIn;
import Behavior.iterator.social_networks.SocialNetwork;
import Behavior.iterator.spammer.SocialSpammer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 迭代器是一种行为设计模式， 让你能在不暴露复杂数据结构内部细节的情况下遍历其中所有的元素。
 * 1、当集合背后为复杂的数据结构， 且你希望对客户端隐藏其复杂性时 （出于使用便利性或安全性的考虑）， 可以使用迭代器模式。
 * 2、使用该模式可以减少程序中重复的遍历代码。
 * 2、如果你希望代码能够遍历不同的甚至是无法预知的数据结构， 可以使用迭代器模式。
 */
/**
 * @ClassName: Demo
 * @Description: 迭代访问社交网络档案
 * @Author: arlin
 * @Date: 2021/6/28
 */
public class Demo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        } else {
            network = new Facebook(createTestProfiles());
        }

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("anna.smith@bing.com",
                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
        spammer.sendSpamToCoworkers("anna.smith@bing.com",
                "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}
