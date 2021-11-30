/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotextoboton;

import campotextoboton.CampoTextoBoton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author chris
 */
public class AppUsoTextoBotonController implements Initializable {
    
    @FXML
    private Label texto;
    @FXML
    private CampoTextoBoton campoTextoBoton1;
    @FXML
    private CampoTextoBoton campoTextoBoton2;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("inicializando view");
    }    

    @FXML
    private void mostrarTexto1(ActionEvent event) {
        texto.setText("Se ha grabado: " + campoTextoBoton1.getText());
    }

    @FXML
    private void mostrarTexto2(ActionEvent event) {
        texto.setText("Se ha grabado: " + campoTextoBoton2.getText());
    }
   
}
