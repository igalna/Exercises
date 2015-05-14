import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorServer extends UnicastRemoteObject implements CalculatorService {

    public CalculatorServer() throws RemoteException {
    
    }
    
    @Override
    public double addition(int i, int n) {
        return (double) (i + n);
    }
    
    @Override
    public double subtraction(int i, int n) {
        return (double) (i - n);
    }
    
    @Override
    public double multiplication(int i, int n) {
        return (double) (i * n);
    }
    
    @Override
    public double division(int i, int n) {
        return (double) (i / n);
    }
}
