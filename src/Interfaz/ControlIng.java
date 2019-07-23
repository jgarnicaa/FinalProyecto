/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import proyectofinal.Admin;
import proyectofinal.Singleton;

/**
 *
 * @author jgarn
 */
public class ControlIng {
    private Ingresar ventana;
    private Admin admin=new Admin();
    public ControlIng() throws FileNotFoundException {
        this.ventana = new Ingresar();
        this.ventana.getIng().setOnAction(new EventoIng());
    }
    private class EventoIng implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
         String usuario=ventana.getU().getText();
         String contraseña=ventana.getC().getText();       
         CompararUsu();
         Singleton singleton= Singleton.getSingleton();
         Stage stage=singleton.getStage();
         stage.setTitle("Menu");
         ControlMenu controlador = null;
            try {
                controlador = new ControlMenu();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ControlIng.class.getName()).log(Level.SEVERE, null, ex);
            }
         VistaB vistamenu=controlador.getVentana();
         stage.setScene(vistamenu.getScene());
         stage.show();
        }
    
    }
    public Ingresar getVentana() {
        return ventana;
    }
    
    public void CompararUsu(){
   
    }//completar
}
