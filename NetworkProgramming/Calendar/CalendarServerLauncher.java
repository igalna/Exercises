import java.rmi.Remote;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.registry.Registry;

public class CalendarServerLauncher {
    
    public static void main(String[] args) throws MalformedURLException,
                                                  RemoteException {
        
        CalendarServerLauncher csl = new CalendarServerLauncher();
        csl.launch();
    }
    
    private void launch() throws MalformedURLException,
                                 RemoteException {
        System.setProperty("java.security.policy", "security.policy");
        
        try {
            Registry registry = LocateRegistry.createRegistry(37);
            registry.rebind("calendarServer", new CalendarServer());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
