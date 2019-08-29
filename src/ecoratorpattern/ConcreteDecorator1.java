package ecoratorpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 20:18
 * @description 装饰器实现类
 */
public class ConcreteDecorator1 extends AbstractDecorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    @Override
    public void operate() {
        System.out.println("concreteDecorator1");
        this.component.operate();
    }
}
