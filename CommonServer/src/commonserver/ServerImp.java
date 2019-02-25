package commonserver;

/*Esraa Imports*/


/* Mohamed Imports*/


public class ServerImp extends UnicastRemoteObject implements ServerInterface{

    static ArrayList<ClientInterface> clientList; 
    
    public ServerImp() throws RemoteException
    {
        super();
        clientList=new ArrayList<>(); 
    }


   /*Mohamed Methods*/
   
    @Override
    public void register(ClientInterface clientInterface) throws RemoteException {
    }

    @Override
    public void unregister(ClientInterface clientInterface) throws RemoteException {

    }

    /*Esraa Methods*/

    @Override
    public void broadCast(String message) throws RemoteException {
    }
    
    @Override
    public void broadCastMsg(Message message, ClientInterface clientRef) {
       
    }
    
    
}
