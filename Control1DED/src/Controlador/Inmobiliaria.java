/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Datos.Sucursal;
import java.util.ArrayList;

/**
 *
 * @author Bernarda
 */
public class Inmobiliaria {
    
    ArrayList <Sucursal> sucursal = new ArrayList<>();
    
    
    
    public boolean agregarSucursal(Object entrada){
        Sucursal s = (Sucursal) entrada;
        int cont =0;
        for (Sucursal item : sucursal) {
            if(item.getCodigo() == s.getCodigo()){
                cont++;
            }
        }
        
        if(cont >1){
            System.out.println("Sucursal ya existente, no se puede agregar");
            return false;
        }else{
            System.out.println("Agregada!");
            sucursal.add(s);
            return true;
        }
        
        
          
    }
    
    
    public boolean buscarSucursal(int cod){
        for (Sucursal item : sucursal) {
            if(item.getCodigo() == cod){
                return true;
            }
        }
        return false;
    }
    
    
    public void listar(){
        for (Sucursal item : sucursal) {
            System.out.println(item.toString());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
