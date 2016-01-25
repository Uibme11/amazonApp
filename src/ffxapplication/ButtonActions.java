/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffxapplication;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author AvaL
 */
public class ButtonActions {
    public void nextScreen(String fxmlDoc, ActionEvent event) throws IOException  {
        Parent screen2Parent = FXMLLoader.load(getClass().getResource(fxmlDoc));
        Scene screen2Scene = new Scene(screen2Parent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        //appStage.hide();
        appStage.setScene(screen2Scene);
        appStage.show();
    } 
}
