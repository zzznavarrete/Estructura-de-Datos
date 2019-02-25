/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciocolas;

/**
 *
 * @author Duoc
 */
public class EjercicioColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cetecom  cet = new Cetecom();
        
        
        cet.agregarImpresion(new Cl_Impresora(1, "pene", 500, new String[]{"Nicolás", "Vicente"}));
        
        System.out.println(cet.sumarPaginas());
        System.out.println(cet.cantResmas());
        System.out.println(cet.cantTinta());
        
        
        
    }
    
}
