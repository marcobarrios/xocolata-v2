/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import xocolata2.MainPrincipal;


/**
 * FXML Controller class
 *
 * @author Enrique
 */
public class PrincipalController implements Initializable {

    private MainPrincipal main;
    
    @FXML
    private void handleMenuItemProducto(ActionEvent event) {
        main.mostrarVentanaIngresoPedidos();
    }
    
    private void mensaje()
    {
        System.out.println("Menu Item Producto");
        
    }
    
    @FXML
    private void handleMenuItemProducto2(ActionEvent event) {
        mensaje();
        mensaje();
        mensaje();
        System.out.println("Menu Item Producto 2");
    }
    
    public void setMainApp(MainPrincipal mainApp){
        this.main = mainApp;

        // Add observable list data to the table
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
    
}
