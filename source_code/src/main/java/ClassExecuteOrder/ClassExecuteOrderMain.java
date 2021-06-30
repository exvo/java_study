package ClassExecuteOrder;

public class ClassExecuteOrderMain {
    
    public static void main(String[] args) {
        // 父类静态代码块>子类静态代码块>父类成员>父类非静态代码块>父类构造方法>子类成员>子类非静态代码块>子类构造方法
        new A();
    }

}
