package adapterpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 19:40
 * @description 被转换角色实现类
 */
public class ConcreteAdaptee implements Adaptee {
    @Override
    public void adapteeExecute() {
        System.out.println("adapteeExecute");
    }
}
