/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilanodo.s;

/**
 *
 * @author Duoc
 */
public class ListaNodos {
    
    private Nodo cima;

    public ListaNodos() {
        cima = null;
    }

    public ListaNodos(Object dato) {
        cima = new Nodo(dato);
    }
    //insertar
    public void insertar(Object dato){
        Nodo nuevo;
        nuevo = new Nodo(dato);
        nuevo.setEnlace(cima);
        
    }
        
    
    public boolean pilaVacia(){
        return cima == null;
    }
    
    public Object quitar(){
        if(pilaVacia()){
            System.out.println("Pila vacia");
            return null;
        }
        
        Nodo aux = cima;
        cima = aux.getEnlace();
        return aux.getDato();
        
    }
    
    public Object cimaPila(){
        if(pilaVacia()){
            System.out.println("Pila vacia");
            return null;
        }
       return cima.getDato();
    }
    
    public String escribirPila(){
        if(pilaVacia()){
            System.out.println("No se puede listar, pila vacía");
            return "";
        }
        String palabra ="";
        Nodo nTemp = cima;
        while(nTemp != null){
            palabra += ","+nTemp.toString()+" \n";
            nTemp = nTemp.getEnlace();//RETROCEDER
        }
        return palabra;                                      
    }
    
    
    
}
