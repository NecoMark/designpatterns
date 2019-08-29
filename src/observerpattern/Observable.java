package observerpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 9:06
 * @description 被观察者接口
 */
public interface Observable {
    void addObserver(Observer observer);
    void delObserver(Observer observer);
    void notifyObservers(String context);
}
