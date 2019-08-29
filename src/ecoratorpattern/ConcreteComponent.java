package ecoratorpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 20:17
 * @description 被装饰接口的实现类
 */
public class ConcreteComponent implements Component {
    @Override
    public void operate() {
        System.out.println("concreteComponent");
    }
}
