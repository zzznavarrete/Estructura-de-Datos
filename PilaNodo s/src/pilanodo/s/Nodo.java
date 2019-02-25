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
public class Nodo {
    
    private Nodo enlace;
    private Object dato;

    public Nodo() {
        enlace = null;
    }

    public Nodo(Object dato) {
        this.dato = dato;
        enlace = null;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato=" + dato + '}';
    }

   
    
    
    
    
    
    
    
    
}
