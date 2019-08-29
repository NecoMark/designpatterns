package singletonpattern;

/**
 * @author: ljyang
 * @date: 2019/6/17 10:55
 * @description 懒汉式双重锁
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;

    private Singleton2() {
    }
    public static Singleton2 getInstance(){
        if (INSTANCE == null){
            synchronized (Singleton2.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }
}
