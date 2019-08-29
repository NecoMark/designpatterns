package adapterpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 19:37
 * @description 目标角色实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void execute() {
        System.out.println("concreteTarget");
    }
}
