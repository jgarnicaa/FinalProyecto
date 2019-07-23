/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 * Representa un producto de la tienda, hereda de la clase Identidad
 * @author sljim
 */
public class Producto extends Identidad
{
    
   //-------------------------------------------- 
   // Atributos
   //--------------------------------------------

    /**
     * Contiene el precio al cual lo compran los clientes
     */
    private Double Precio;
    
    /**
     * Cantidad de producto
     */ 
    private int Cantidad; 
    
    /**
     * Unidades Vendidas del producto
     */
   private int UnidadesVendidas;
   
   //-------------------------------------------- 
   // Constructor 
   //--------------------------------------------
   
   /**
    * Constructor de la clase producto
    * @param pNombre nombre del producto, nombre debe ser distinto de null
    * @param pID codigo unico del producto
    * @param pCosto dinero necesario para adquirir el producto de un proveedor
    * @param pPrecio dinero que debe entregar un cliente a la tienda para adquirir el producto
    * @param pCantidad cantidad del producto en inventario de la tienda
    */
   public Producto( String pNombre, int pID, Double pCosto, Double pPrecio, int pCantidad )
   {
       super(pNombre,pID,pCosto);
       Precio = pPrecio;
       Cantidad = pCantidad;
       UnidadesVendidas = 0;
   }

   //-------------------------------------------- 
   // Metodos 
   //--------------------------------------------
   
   /**
    * Modifica el precio del producto
    */
   public void cambiarPrecio( Double pPrecio )
   {
       Precio = pPrecio;
   }
   
   /**
    * Precio del producto
    * @return precio del producto
    */
    public Double getPrecio() {
        return Precio;
    }

    /**
     * Cantidad del producto en inventario
     * @return cantidad inventariada del producto
     */
    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    /**
     * Cantidad de unidades vendidas 
     * @return cantidad de unidades vendidas
     */
    public int getUnidadesVendidas() {
        return UnidadesVendidas;
    }

    /**
     * Modifica las unidades vendidas
     * @param UnidadesVendidas cantidad de unidades vendidas
     */
    public void setUnidadesVendidas(int UnidadesVendidas) {
        this.UnidadesVendidas = UnidadesVendidas;
    }
   
   
   
}
