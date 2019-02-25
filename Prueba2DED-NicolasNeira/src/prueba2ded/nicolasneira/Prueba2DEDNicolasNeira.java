/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba2ded.nicolasneira;

import java.text.ParseException;

/**
 *
 * @author Duoc
 */
public class Prueba2DEDNicolasNeira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        Cl_Automotora automot = new Cl_Automotora();
        Pila p = new Pila();
        Pila p2 = new Pila();
        Pila p3 = new Pila();
        Pila p4 = new Pila();
        
        //TIPO MANTENCION 1
        p.Apilar(new Cl_Mantencion("Llantass", 210000));
        p.Apilar(new Cl_Mantencion("Aceite", 10000));
        p.Apilar(new Cl_Mantencion("Vidrios", 5000));
        
        //TIPO MANTENCION 2
        p2.Apilar(new Cl_Mantencion("Neumaticos", 40000));
        
        //TIPO MANTENCION 3
        p3.Apilar(new Cl_Mantencion("Llantass", 210000));
        p3.Apilar(new Cl_Mantencion("Aceite", 10000));
        p3.Apilar(new Cl_Mantencion("Vidrios", 5000));
        p3.Apilar(new Cl_Mantencion("Neumaticos", 40000));
        p3.Apilar(new Cl_Mantencion("Bujias", 5000));
        //TIPO MANTENCION 4
        p4.Apilar(new Cl_Mantencion("Llantass", 210000));
        p4.Apilar(new Cl_Mantencion("Aceite", 10000));
        
        //CREANDO AUTOS
        Cl_Auto auto1 = new Cl_Auto(1, p);
        Cl_Auto auto2 = new Cl_Auto(2, p2);
        Cl_Auto auto3 = new Cl_Auto(3, p3);
        Cl_Auto auto4 = new Cl_Auto(4, p4);
        Cl_Auto auto5 = new Cl_Auto(5, p);
        Cl_Auto auto6 = new Cl_Auto(6, p2);
        Cl_Auto auto7 = new Cl_Auto(7, p3);
        Cl_Auto auto8 = new Cl_Auto(8, p4);
        Cl_Auto auto9 = new Cl_Auto(9, p);
        Cl_Auto auto10 = new Cl_Auto(10, p2);
        Cl_Auto auto11 = new Cl_Auto(11, p3);
        Cl_Auto auto12 = new Cl_Auto(12, p4);
        Cl_Auto auto13 = new Cl_Auto(13, p);
        Cl_Auto auto14 = new Cl_Auto(14, p2);
        Cl_Auto auto15 = new Cl_Auto(15, p3);
        Cl_Auto auto16 = new Cl_Auto(16, p4);
        Cl_Auto auto17 = new Cl_Auto(17, p);
        Cl_Auto auto18 = new Cl_Auto(18, p2);
        Cl_Auto auto19 = new Cl_Auto(19, p3);
       
        
        //ENCOLANDO AUTOS
        
        automot.AgregarCliente(auto1);
        automot.AgregarCliente(auto2);
        automot.AgregarCliente(auto3);
        automot.AgregarCliente(auto4);
        automot.AgregarCliente(auto5);
        automot.AgregarCliente(auto6);
        automot.AgregarCliente(auto7);
        automot.AgregarCliente(auto8);
        automot.AgregarCliente(auto9);
        automot.AgregarCliente(auto10);
        automot.AgregarCliente(auto11);
        automot.AgregarCliente(auto12);
        automot.AgregarCliente(auto13);
        automot.AgregarCliente(auto14);
        automot.AgregarCliente(auto15);
        automot.AgregarCliente(auto16);
        automot.AgregarCliente(auto17);
        automot.AgregarCliente(auto18);
        automot.AgregarCliente(auto19);
        
        
        
        
        
       
        
       
        
       
        
                
                
        automot.test();
        
    }
    
}
