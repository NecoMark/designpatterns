package observerpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 9:04
 * @description
 */
public class Client {
    public static void main(String[] args) {
        ConcreteObservable observableClass = new ConcreteObservable();
        ConcreteObserver observerClass = new ConcreteObserver();
        observableClass.addObserver(observerClass);
        observableClass.doSomething();
    }
}
