import java.rmi.Remote;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.registry.Registry;

public class EchoServerLauncher {

    public static void main(String[] args) throws MalformedURLException,
                                                  RemoteException {
        
        EchoServerLauncher esl = new EchoServerLauncher();
        esl.launch();
    
    }
    private void launch() throws MalformedURLException,
                                 RemoteException {
        System.setProperty("java.security.policy", "security.policy");
        
        /* if (System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }  */
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("echoServer", new EchoServer());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
