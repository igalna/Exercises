import java.rmi.Remote;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.registry.Registry;

public class CalculatorClient {
    
    private Registry registry;
    private CalculatorService cs;
    
    public static void main(String[] args) {
        CalculatorClient cc = new CalculatorClient();
        cc.launch();
    }
    
    private void launch() {
        
        try {
            registry = LocateRegistry.getRegistry("localhost", 50);
            cs = (CalculatorService)registry.lookup("calculatorServer");
            System.out.println(cs.addition(10, 10));
            System.out.println(cs.subtraction(20, 5));
            System.out.println(cs.multiplication(10, 10));
            System.out.println(cs.division(10, 5));
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }
}
