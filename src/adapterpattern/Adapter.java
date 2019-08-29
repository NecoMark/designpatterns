package adapterpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 19:35
 * @description 适配器角色将Adaptee转换为Target
 */
public class Adapter extends ConcreteAdaptee implements Target{
    @Override
    public void execute() {
        this.adapteeExecute();
    }
}
