import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorService extends Remote {
    
    public double addition(int i, int n) throws RemoteException;
    
    public double subtraction(int i, int n) throws RemoteException;
    
    public double multiplication(int i, int n) throws RemoteException;
    
    public double division(int i, int n) throws RemoteException;
}
