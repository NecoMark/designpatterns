package strategypattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 10:30
 * @description 策略接口的实现2
 */
public class ConcreteStrategy2 implements Strategy{

    @Override
    public void operate() {
        System.out.println("stragegy 2");
    }
}
