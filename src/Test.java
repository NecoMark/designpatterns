import javax.management.modelmbean.XMLParseException;
import javax.xml.xpath.XPathException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.nio.*;
import java.util.concurrent.TimeUnit;

/**
 * @author: ljyang
 * @date: 2019/6/17 11:08
 * @description
 */
public class Test {
    public static void main(String[] args) {
        TParent tChild1 = new TChild1();
        System.out.println(null instanceof TChild1);
    }
}

class TParent{}

class TChild1 extends TParent{}

class TChild2 extends TParent{}



class Temp {
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}



class Parent<T>{
    T t;
    public Parent(T t) {
        this.t = t;
    }
    public Class<T> getType(){
        return (Class<T>)t.getClass();
    }
    public void test(T t){
        System.out.println(t.getClass());
    }

    public void ets() throws XPathException{}

}

/*
* 父类是泛型类，子类如果保留父类的泛型，子类泛型必须保留父类泛型，子类可以新增泛型
*
* */

class Child<T,U,V> extends Parent<T>{
    public Child(T t) {
        super(t);
    }

    @Override
    public void test(T t) {
        super.test(t);
    }

    @Override
    public void ets() {
        //子类抛出的异常为父类异常类型或其子类，也可不抛异常，不能抛出其他异常
    }
}

/*
* 不保留父类泛型，父类泛型按需实现， 子类可以是泛型类，也可以不是泛型类
*
* */

class Child2<U,V> extends Parent<Integer>{
    public Child2(Integer integer) {
        super(integer);
    }
}

/*
*父类有多个泛型，子类可以部分保留，并且子类可以新增泛型
* */

class GrandChild<T, U, S,P> extends Child<T, U, String>{
    public GrandChild(T t) {
        super(t);
    }
}

/*
*子类可以将父类泛型擦除，在子类中使用父类泛型的类型时，类型必须指定为Object
 */

class Child3<U,V> extends Parent{
    public Child3(Object o) {
        super(o);
    }

    @Override
    public void test(Object o) {
        super.test(o);
    }
}
/*
 * 子类【重写方法】的参数类型 --> 随父类而定
 *     子类新增的方法 --> 参数类型随子类而定
 * 子类中使用父类的【属性】 --> 随父类而定
 *     子类使用自己的属性 --> 随子类而定
 */