package ClassExecuteOrder;

public class P {

    static {
        System.out.println("P -> 静态代码块");
    }

    {
        System.out.println("P -> 非静态代码块");
    }

    public void doThing() {
        System.out.println("P -> 成员方法");
    }

    public P() {
        System.out.println("P -> 构造方法");
    }
}
