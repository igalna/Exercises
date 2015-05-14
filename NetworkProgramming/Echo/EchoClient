import java.rmi.Remote;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.registry.Registry;


public class EchoClient {

    private EchoService es;
    private Registry registry;
    
    public static void main(String[] args) {
        
        EchoClient ec = new EchoClient();
        ec.launch();
    }
    
    public void launch() {
    
        try {
            registry = LocateRegistry.getRegistry("localhost", 1099);
            es = (EchoService)registry.lookup("echoServer");
            es.echo("This is to be echoed");
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }
}
