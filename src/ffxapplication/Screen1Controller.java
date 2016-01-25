/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffxapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author AvaL
 */
public class Screen1Controller implements Initializable {

    @FXML
    private Label label;
    
    @FXML
    public Button closeButton;
    
    @FXML
    public TextField jobName;
    
    @FXML
    public TextField emailAddress;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen2.fxml", event); 
    }
    
    @FXML
    private void handleButtonActionNext2(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen3.fxml", event);  
    }
    
    @FXML
    private void handleButtonActionBack2(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen1.fxml", event);  
    }
    
    @FXML
    private void handleButtonActionNext3(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen4.fxml", event);  
    }
    
    @FXML
    private void handleButtonActionBack3(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen2.fxml", event);  
    }
    
    @FXML
    private void handleButtonActionNext4(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen5.fxml", event);  
    }
    
    @FXML
    private void handleButtonActionBack4(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen3.fxml", event);  
    }
    
    @FXML
    private void handleButtonActionHome(ActionEvent event) throws IOException {
        ButtonActions buttonActions = new ButtonActions();
        buttonActions.nextScreen("Screen1.fxml", event);  
    }
    
    @FXML
    private void handleButtonActionExit(ActionEvent event) throws IOException {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close(); 
    }
    
    public void initialize(URL url, ResourceBundle rb) {
    }
}
