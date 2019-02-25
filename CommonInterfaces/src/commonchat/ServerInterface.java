package commonchat;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Abdelrhman
 */

public interface ServerInterface extends Remote {

    public void register(ClientInterface clientInterface) throws RemoteException;

    public void unregister(ClientInterface clientInterface) throws RemoteException;

    //public void broadCast(String message,byte[]image) throws RemoteException;
    public void broadCast(String message) throws RemoteException;

    public void broadCastMsg(Message message, ClientInterface clientRef) throws RemoteException;

    
}
