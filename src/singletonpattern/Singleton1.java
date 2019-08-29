package singletonpattern;

/**
 * @author: ljyang
 * @date: 2019/6/17 10:52
 * @description 饿汉式，在类加载时创建单例模式
 */
public class Singleton1 {
    private static Singleton1 INSTANCE = new Singleton1();
    private Singleton1(){

    }

    public Singleton1 getInstance(){
        return Singleton1.INSTANCE;
    }
}
