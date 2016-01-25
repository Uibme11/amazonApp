
import ffxapplication.ButtonActions;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author AvaL
 */
public class Screen2Controller implements Initializable {

    @FXML
    private Label label;
    
    @FXML
    public Button closeButton;
    
    @FXML
    public TextField jobName;
    
    @FXML
    public TextField emailAddress;
    
    @FXML
    private void handleButtonActionNext(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen3.fxml", event);  
    }
    
    @FXML
    private void handleButtonActionBack(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen1.fxml", event);  
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}