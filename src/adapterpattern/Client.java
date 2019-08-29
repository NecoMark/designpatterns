package adapterpattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 19:35
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Target adapter = new Adapter();
        adapter.execute();
    }
}
