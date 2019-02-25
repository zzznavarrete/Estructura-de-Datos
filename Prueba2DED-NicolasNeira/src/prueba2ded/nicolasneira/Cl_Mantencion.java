/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba2ded.nicolasneira;

import java.util.Date;

/**
 *
 * @author Duoc
 */
public class Cl_Mantencion {
    
    private String mantencion;
    private int precio;
   

    public Cl_Mantencion(String mantencion, int precio) {
        this.mantencion = mantencion;
        this.precio = precio;
       
    }

    public String getMantencion() {
        return mantencion;
    }

    public void setMantencion(String mantencion) {
        this.mantencion = mantencion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        
        this.precio = precio;
    }

    
    @Override
    public String toString() {
        return "Cl_Mantencion{" + "mantencion=" + mantencion + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
    
}
