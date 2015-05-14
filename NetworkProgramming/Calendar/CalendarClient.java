import java.rmi.Remote;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.registry.Registry;

public class CalendarClient {
    
    private Registry registry;
    private CalendarService cs;
    
    public static void main(String[] args) {
        
        CalendarClient cc = new CalendarClient();
        cc.launch();
    }
    
    private void launch() {
        
        try {
            registry = LocateRegistry.getRegistry("localhost", 37);
            cs = (CalendarService)registry.lookup("calendarServer");
            System.out.println(cs.getCalendar());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        } catch (NotBoundException ex) {
            ex.printStackTrace();
        }
    }
}
