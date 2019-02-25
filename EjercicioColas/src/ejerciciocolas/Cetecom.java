/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciocolas;

/**
 *
 * @author Duoc< 1.- Permitir el ingreso de un max de 15 doc. <- LISTO 
 * 2.-
 * totalizar el número de paginas <-LISTO
 * 3.-Determinar el número de resmas a  ocupar(500 pg). <- LISTO
 *
 * 4.- Calcular el número de tintas (1 cartucho 200 imp.) <- Listo 
 * 5.- Usuario que más imprimió 
 * 6.- Cantidad de paginas y documentos de un usuario
 * 7.- Presentar en pesos el valor de una copia en particular(20 pesos) >
 */
public class Cetecom {

    private ColaLineal impresionesCetecom;

    public Cetecom() {
        impresionesCetecom = new ColaLineal(15);
    }

    public void agregarImpresion(Cl_Impresora imp) {
        impresionesCetecom.encolar(imp);
    }

    public int sumarPaginas() {

        ColaLineal colTemp = new ColaLineal(impresionesCetecom.getListaCola(), impresionesCetecom.getFrente(), impresionesCetecom.getFin());
        Object dato = colTemp.desencolar();
        int suma = 0;
        int us = 0;
        while (dato != null) {
            Cl_Impresora imp = (Cl_Impresora) dato;
            us = imp.contarUsuarios();
            suma = suma + (imp.getPaginas() * us);
            dato = colTemp.desencolar();
        }

        return suma;

    }

    
    public int cantResmas(){
        int cantResmas =0;
        int res =500;
        for (int i = 0; i < sumarPaginas(); i++) {
            if(sumarPaginas()> res*i){
            cantResmas ++;
        } 
        }
       
        
        return cantResmas;
    }
    
    
     public int cantTinta(){
        int canTin =0;
        int tin =200;
        for (int i = 0; i < sumarPaginas(); i++) {
            if(sumarPaginas()> tin*i){
            canTin ++;
        } 
        }
       
        
        return canTin;
    }

    
}
