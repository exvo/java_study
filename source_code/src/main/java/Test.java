import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

public class Test {

    public static void main(String[] args) {


    }

    // 1：创建远程接口，继承java.rmi.Remote接口
    public interface GreetService extends java.rmi.Remote {
        String sayHello(String name) throws RemoteException;
    }

    // 2：实现远程接口，继承java.rmi.server.UnicastRemoteObject类
    public class GreetServiceImpl extends java.rmi.server.UnicastRemoteObjectimplements GreetService {
        private static final long serialVersionUID = 3434060152387200042L;

        public GreetServiceImpl() throws RemoteException {
            super();
        }

        @Overridepublic
        String sayHello(String name) throws RemoteException {
            return "Hello " + name;
        }
    }

    // 3：生成Stub和Skeleton;
    // 4：执行rmiregistry命令注册服务
    // 5：启动服务
    LocateRegistry.createRegistry(1098);
    Naming.bind("rmi://10.108.1.138:1098/GreetService", new GreetServiceImpl());
    //6.客户端调用
    GreetService greetService = (GreetService) Naming.lookup("rmi://10.108.1.138:1098/GreetService");
    System.out.println(greetService.sayHello("Jobs"));
}



