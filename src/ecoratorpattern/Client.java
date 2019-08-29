package ecoratorpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 20:28
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        concreteComponent = new ConcreteDecorator1(concreteComponent);
        concreteComponent = new ConcreteDecorator2(concreteComponent);
        concreteComponent.operate();

    }
}
