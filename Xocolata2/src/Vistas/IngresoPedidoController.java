/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Clases.Pedidos;
import Clases.Productos;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Enrique
 */
public class IngresoPedidoController implements Initializable {

    @FXML
    private TextField tCodigoPedido;
    @FXML
    private TextField tSubtotal;
    @FXML
    private TextField tImpuesto;
    @FXML
    private TextField tEnvioEEUU;
    @FXML
    private TextField tTotalDolares;
    @FXML
    private TextField tTipoCambio;
    @FXML
    private TextField tCantidadProductos;
    
    private Stage dialogStage;
    private boolean okClicked = false;
    private String fechac;
       
    @FXML
    private void bAceptarAction(ActionEvent event) {
        ///Acción de boton Aceptar
        ///Implementar Ingreso de pedido
        System.out.println("Boton Aceptar");
    }

    @FXML
    private void bCancelarAction(ActionEvent event) {
        ///Acción de boton Cancelar
        System.out.println("Boton Cancelar");
    }
    
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    
    public boolean isOkClicked() {
        return okClicked;
    }
    
    private Pedidos crearPedido()
    {
        DecimalFormat formato = new DecimalFormat("0.00");
        Pedidos pedido = new Pedidos();
        
        pedido.setCodigo(tCodigoPedido.getText());
        pedido.setFecha(fechac);
        pedido.setSubtotal(Double.parseDouble(formato.format(((Double.parseDouble(tSubtotal.getText()))))));
        pedido.setImpuesto(Double.parseDouble(formato.format(((Double.parseDouble(tImpuesto.getText()))))));
        ///seguir implementando
        return pedido;
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Calendar fecha = new GregorianCalendar();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int mes = fecha.get(Calendar.MONTH)+1;
        int año = fecha.get(Calendar.YEAR);
        fechac = Integer.toString(año)+"-"+Integer.toString(mes)+"-"+Integer.toString(dia);
    }    

    
    
}
