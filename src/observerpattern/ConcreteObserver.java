package observerpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 9:18
 * @description 观察者类
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(Object arg) {
        System.out.println("ConcreteObserver: " + arg.toString());
    }
}
