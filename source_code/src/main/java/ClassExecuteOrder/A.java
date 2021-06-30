package ClassExecuteOrder;

public class A extends P {

    static {
        System.out.println("A -> 静态代码块");
    }

    {
        System.out.println("A -> 非静态代码块");
    }

    public void doSomething() {
        System.out.println("A -> 成员方法");
    }

    public A() {
        System.out.println("A -> 构造方法");
    }
}
