package ecoratorpattern;

/**
 * @author: ljyang
 *
 * @date: 2019/6/11 20:15
 * @description 装饰器抽象类
 */
public abstract class AbstractDecorator implements Component {
    protected Component component;
    public AbstractDecorator(Component component) {
        this.component = component;
    }
    @Override
    public abstract void operate();
}
