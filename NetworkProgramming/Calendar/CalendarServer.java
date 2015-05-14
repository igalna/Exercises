import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Date;

public class CalendarServer extends UnicastRemoteObject implements CalendarService {

    public CalendarServer() throws RemoteException {
        
    }
    
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        System.out.println(d);
        
    }
    
    @Override
    public Date getCalendar() {
        Calendar c = Calendar.getInstance();
        Date d = c.getTime();
        return d;
    }
}
