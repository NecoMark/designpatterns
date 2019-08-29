package observerpattern;
import java.util.LinkedList;

/**
 * @author: ljyang
 * @date: 2019/6/11 9:11
 * @description 被观察者类
 */

public class ConcreteObservable implements Observable {
    private LinkedList<Observer> observerList = new LinkedList<>();

    public void doSomething(){
        notifyObservers("doSomething");
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void delObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer: observerList){
            observer.update(context);
        }

    }
}
