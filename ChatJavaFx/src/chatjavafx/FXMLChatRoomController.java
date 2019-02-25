package chatjavafx;

/*Esraa Imports Block*/


/*Mohamed Imports Block*/


public class FXMLChatRoomController extends UnicastRemoteObject implements Initializable, ClientInterface  {
    /**
     * Initializes the controller class.
     */
    @FXML
            TextField msgArea;
    @FXML
            ImageView userImage;
    @FXML
            VBox chatArea;
    @FXML
            Label userName;
    @FXML
    private ScrollPane scrollPane;
    
     /*Esraa Declaration Block */

     /*Mohamed Declaration Block */


    /*Esraa Methods*/

    public FXMLChatRoomController() throws RemoteException {
        
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    /*Mohamed Methods*/
    public void setUserData(User loginUser)
    {
    
    }
    

    @Override
    public void receive(Message receivedMessage, boolean sameClientFlag) throws RemoteException {
        
    }
    
}
