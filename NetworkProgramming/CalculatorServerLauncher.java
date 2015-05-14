import java.rmi.Remote;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.registry.Registry;

public class CalculatorServerLauncher {

    public static void main(String[] args) throws MalformedURLException,
                                                  RemoteException {
    
        CalculatorServerLauncher csl = new CalculatorServerLauncher();
        csl.launch();
    }
    
    private void launch() throws MalformedURLException,
                                 RemoteException {
        System.setProperty("java.security.policy", "security.policy");
        
        try {
            Registry registry = LocateRegistry.createRegistry(50);
            registry.rebind("calculatorServer", new CalculatorServer());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
