package Behavior.strategy.strategies;

/**
 * @ClassName: PayStrategy
 * @Description: 通用的方法接口
 * @Author: arlin
 * @Date: 2021/6/27
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
