/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import Controlador.Inmobiliaria;
/**
 *
 * @author Bernarda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Duenio d1 = new Duenio("19563184-3", "CABIX");
        Vivienda v1 = new Vivienda(1722, "High Bridge", d1);
        Inmobiliaria i1 = new Inmobiliaria();
        
        Sucursal s1 = new Sucursal(1, "HOLI", "LA FLOWER ", 2);
        System.out.println(s1.agregarViviendas(v1));
        System.out.println(s1.buscarVivienda(1722));
        System.out.println(i1.agregarSucursal(s1));
        System.out.println(i1.buscarSucursal(1));
        i1.listar();
        
        
        
    }
    
}
