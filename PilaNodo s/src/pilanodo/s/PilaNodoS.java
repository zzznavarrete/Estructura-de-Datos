/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilanodo.s;

import java.util.Stack;

/**
 *
 * @author Duoc
 */
public class PilaNodoS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ListaNodos ln = new ListaNodos();
        Stack<String> lista = new Stack<>();
        lista.push("O1");
        lista.push("O2");
        lista.push("O3");
        
        
        System.out.println("Listado: "+ lista.peek());
        
        
    }
    
}
