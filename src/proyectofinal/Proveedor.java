/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.ArrayList;

/**
 *  Clase proveedor que extiende la clase identidad
 * @author sljim
 */
public class Proveedor extends Identidad{
    
//-------------------------------------------- 
// Atributos
//--------------------------------------------
    
/**
 * Lista con todos los productos que se le compran al proveedor 
 */
private ArrayList<Producto> Productos;
    
    
//-------------------------------------------- 
// Constructor
//--------------------------------------------    

/**
 * Constructos para el proveedor 
 * @param Nombre Nombre del proveedor
 * @param ID Telefono del proveedor
 * @param Costo Dinero que se le debe al proveedor
 * @param Productos Lista de productos que le compro al proveedor, se usará más adelante para hacer pedidos
 */
public Proveedor( String Nombre, int ID, Double Costo )
{
    super(Nombre, ID, Costo);
    this.Productos = Productos;    
    Productos = new ArrayList<>();
}
    
//-------------------------------------------- 
// Metodos
//--------------------------------------------

/**
 * 
 */
public ArrayList<Producto> darProducto( )
{
    return Productos;
}

/**
 * Cambia el nombre del proveedor
 * @param NombreNuevo el nuevo nombre del proveedor
 */
public void cambiarNombre( String NombreNuevo )
{
    setNombre(NombreNuevo);
}

/**
 * Cambia el telefono del proveedor
 * @param TelefonoNuevo el nuevo telefono del proveedor
 */
public void cambiaTelefono(int TelefonoNuevo)
{
    setID(TelefonoNuevo);
}

/**
 * Método para pagar la deuda con el proveedor
 * @param pPago Valor que se va a abonar a la deuda
 * @return Deuda restante
 */
public Double pagarDeuda(Double pPago)
{
    setCosto((getCosto()-pPago));
    return getCosto();
}

/**
 * Método para agregar a la deuda con el proveedor
 * @param ValorEndeudar dinero que va a agregar a la deuda
 * @return Valor final de la deuda
 */
public Double endeudarse(Double ValorEndeudar)
{
    setCosto((getCosto()+ValorEndeudar));
    return getCosto();
}

/**
 * Agrega productos a la lista de los productos del proveedor 
 * @param pProducto producto que se va a agregar
 */
 public void agregarProducto( Producto pProducto )
 {
     Productos.add(pProducto);
 }
 
 /**
  * Elimina un rpoducto de la lista del proveedor 
  * @param ID numero que identifica el porducto que quiere eliminar
  */
 public boolean eliminarProducto( int ID )
 {
     
     boolean exito = false;
     
     if(!Productos.isEmpty())
     {
         for( Producto p : Productos)
     {
         
         if(p.getID() == ID)
         {
             Productos.remove(p);
             exito = true;
             
         }
         
     }
     }
     
     return exito;
 }
 
 /**
  * Método para buscar un producto 
  * @param ID Número de identificación del producto
  * @return el producto ue se buscó
  */
 public Producto buscarProducto( int ID )
 {
     Producto Buscado = null;
     
     for(Producto p : Productos )
     {
       if(ID == p.getID())
       {
           Buscado=p;
       }
     }
     
     return Buscado;
 }
 
}
