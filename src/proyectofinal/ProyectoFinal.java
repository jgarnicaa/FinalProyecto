/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Interfaz.ControlIng;
import Interfaz.Ingresar;
import Interfaz.Menu;
import Interfaz.VistaB;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author jgarn
 */
public class ProyectoFinal extends Application {

    public static void main(String []args){
    Application.launch(args);
    proyectofinal.Tienda store = new proyectofinal.Tienda("Pepita");
    /**
     * De aqui en adelante es una muestra de como almacena la idea es hacer un acrivo en agregar productos que contenga todo, y en el main se hace una función lectora que lee ese archivo y lo agrega a el programa de tienda 
     */
    
    }

    @Override
    public void start(Stage stage) throws Exception {
        Singleton singleton=Singleton.getSingleton();
        singleton.setStage(stage);
        ControlIng controlador=new ControlIng();
        VistaB vista =controlador.getVentana();
        stage.setScene(vista.getScene());
        stage.show();
    }
    
}
