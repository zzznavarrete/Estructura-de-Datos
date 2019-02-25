/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba2dedrepetida;

import java.text.ParseException;

/**
 *
 * @author Duoc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Cl_Proveedor prov = new Cl_Proveedor();
        
        prov.encolarMensaje();
        
        System.out.println("------------------------");
        prov.desencolarMensajes();
        
        
        
        
    }
    
}
