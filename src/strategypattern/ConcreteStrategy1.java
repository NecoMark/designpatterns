package strategypattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 10:25
 * @description 策略接口的实现1
 */
public class ConcreteStrategy1 implements Strategy{
    @Override
    public void operate() {
        System.out.println("concrete strategy 1");
    }
}
