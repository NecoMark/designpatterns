package ecoratorpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 20:38
 * @description
 */
public class ConcreteDecorator2 extends AbstractDecorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        System.out.println("concreteDecorator2");
        super.component.operate();
    }
}
