package strategypattern;

/**
 * @author: ljyang
 * @date: 2019/6/11 10:32
 * @description
 */
public class Client {
    public static void main(String[] args) {
        int a = 1;
        Context context;
        if (a == 1){
            context = new Context(new ConcreteStrategy1());
        }else{
            context = new Context(new ConcreteStrategy2());
        }
        context.operate();
        String sstr = "123abc";
        char ch = sstr.charAt(0);
        int p = ch;
        System.out.println(p);
        int t = Integer.valueOf(String.valueOf(ch));
        System.out.println(t);
        System.out.println(ch);
        System.out.println(sstr.substring(0,1));

        char[] chars = {'a', 'b'};
        System.out.println(Math.floor(Math.sqrt(10)));

        String str1 = "hellorrrrrrrrrrrrrrrrrrrrrrrrrrgrfdssfsafsfsfsafsfsafsfsafsafsfsfsfsfsfsfsafsfsafsafsafsaffsfsfsfsfsafdsfsfsfsfsfsfsafsafsaffrewrrwwrewrwwrwrwrwrwrwrwrwrwrewrwrwrwrwrwerrewrewrewrewrwrwrwrewrwqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqfsfsfsfffdsfsfsfssfdsfsfsfsfsfdsfsfsfsfdsfsfsfsfdsfssfsfdsfsfdsfsfsfsfsdsfdsfsfsfdfdsfsfsfsfsfsfsfsfsfs";
        String str2 = "hellorrrrrrrrrrrrrrrrrrrrrrrrrrgrfdssfsafsfsfsafsfsafsfsafsafsfsfsfsfsfsfsafsfsafsafsafsaffsfsfsfsfsafdsfsfsfsfsfsfsafsafsaffrewrrwwrewrwwrwrwrwrwrwrwrwrwrewrwrwrwrwrwerrewrewrewrewrwrwrwrewrwqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqfsfsfsfffdsfsfsfssfdsfsfsfsfsfdsfsfsfsfdsfsfsfsfdsfssfsfdsfsfdsfsfsfsfsdsfdsfsfsfdfdsfsfsfsfsfsfsfsfsfs";

        Integer int1 = new Integer(10);
        Integer int2 = new Integer(10);

        int int3 = 1000;
        int int4 = 1000;
        System.out.println(int3 == int4);

    }
}
