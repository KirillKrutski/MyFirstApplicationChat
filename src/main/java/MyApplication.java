import Chat.ServiceStart;
import Chat.ServiceStartImpl;

public class MyApplication{
    public static void main(String[] args) {
        ServiceStart serviceStart = new ServiceStartImpl();

            serviceStart.start(); // application start

    }
}
