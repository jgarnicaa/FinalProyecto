/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *Clase que representa un empleado de la tienda, hereda de la clase indentidad
 * @author sljim
 */
public class Empleado extends Identidad
{
   //-------------------------------------------- 
   // Atributos 
   //--------------------------------------------
    
    /**
     * Atributo de las horas que trabaja un empleado
     */
    private int HorasTrabajadas;
    
    /**
     * Contraseña del empleado para ingresar al sistema 
     */
    private String Password;
    /**
     * Contiene el valor que se le debe pagar al empleado
     */
    private Double Pago;
    
   //-------------------------------------------- 
   // Constructor
   //--------------------------------------------
    
   /**
    * Constructor de la clase Empleado
    * @param pNombre Nombre del empleado
    * @param pID Identificación del empleado
    * @param pCosto Dinero que se le debe al empleado por las horas
    * @param pFechaContratado Horas que el empleado trabajó
    * @param pPassword Contraseña del empleado para ingresar al sistema
    * @param pPago Dinero que se le debe pagar, incluye 5mil pesos de transoporte por dia
    */
   public Empleado( String pNombre, int pID, Double pCosto, int FechaContratado, String pPassword, Double pPago)
   {
       super(pNombre, pID, pCosto);
       HorasTrabajadas=FechaContratado;
       Password=pPassword;
       Pago=pPago;
   }

   //-------------------------------------------- 
   // Metodos
   //--------------------------------------------
   
    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public Double getPago() {
        return Pago;
    }

    public void setPago(Double Pago) {
        this.Pago = Pago;
    }
   
   
   
}
