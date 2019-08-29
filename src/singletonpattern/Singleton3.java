package singletonpattern;

/**
 * @author: ljyang
 * @date: 2019/6/17 10:58
 * @description 内部类 依赖于classLoader机制
 */
public class Singleton3 {
    private static class SingleHandler{
        private static Singleton3 INSTANCE = new Singleton3();
    }
    private Singleton3(){

    }

    public static Singleton3 getInstance(){
        return SingleHandler.INSTANCE;
    }
}
