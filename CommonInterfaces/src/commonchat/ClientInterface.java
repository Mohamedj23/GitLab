package commonchat;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Abdelrhman
 */

public interface ClientInterface extends Remote {

    //public void receive(String receivedMessage,byte []image) throws RemoteException;
    public void receive(String receivedMessage) throws RemoteException;
    public void receive(Message receivedMessage,boolean sameClientFlag) throws RemoteException;
}
