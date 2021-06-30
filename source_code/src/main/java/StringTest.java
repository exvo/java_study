/**
 * 测试string不可变
 */
public class StringTest {

    private String str = "good";
    private char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        System.out.println(stringTest.str);
        System.out.println(stringTest.ch);
        stringTest.changeStr(stringTest.str, stringTest.ch);
        System.out.println(stringTest.str);
        System.out.println(stringTest.ch);
    }

    public void changeStr(String str, char[] ch) {
        str = "change good";
        ch[0] = 'h';
    }

    /**
     * 输出
     * good
     * abc
     * good
     * hbc
     * String类的两个主要成员变量，其中value指向的是一个字符串数组，字符串中的字符就是用这个value变量存储起来的，并且用final修饰，也就是说value一旦赋予初始值之后，value指向的地址就不能再改变了。
     * 虽然value指向的数组是可以改变的，但是String也没有提供相应的方法让我们去修改value指向的数组的元素。
     * 然而在StringBuilder中是提供了响应的方法让我们去修改value指向的数组的元素，这也是StringBuilder的字符串序列可变的原因。
     */

}
