package strategypattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 10:28
 * @description 策略封装类
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void operate(){
        strategy.operate();
    }
}
