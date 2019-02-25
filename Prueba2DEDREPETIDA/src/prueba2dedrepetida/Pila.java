/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2dedrepetida;

/**
 *
 * @author gary
 */
public class Pila {

    private int TamMax = 5;
    private int cima;
    private Object[] listaPila;

    public Pila() {
        cima = -1;
        listaPila = new Object[TamMax];
    }

    public Pila(int cima, Object[] listaPila) {
        this.cima = cima;
        this.listaPila = listaPila;
        TamMax=listaPila.length;
    }

    
    public int getCima() {
        return cima;
    }

    public Pila(int tamano) {
        cima = -1;
        TamMax = tamano;
        listaPila = new Object[TamMax];

    }

    public Object[] getListaPila() {
        return listaPila;
    }

    public Pila(Object[] listaPila) {
        this.listaPila = listaPila;
        cima = listaPila.length - 1;
    }

    //metodos
    public boolean PilaVacia() {
        return cima == -1;
    }

    public boolean PilaLLena() {
        return cima == TamMax - 1;
    }

    //metodos apilar y de 
    public void Apilar(Object objeto) {
        if (!PilaLLena()) {
            cima++;
            listaPila[cima] = objeto;
            System.out.println("Apilo:"+objeto);
        }
    }

    public Object desapilar() {

        if (!PilaVacia()) {
            Object aux = listaPila[cima];
            cima--;
            return aux;
        } else {
            //System.out.println("Pia vacia");
            return null;
        }
    }

    public void VaciaPila() {
        if (PilaVacia()) {
            System.out.println("Pila Vacia");
            return;
        }
        for (int i = 0; i < cima; i++) {
            System.out.println("Dato:" + listaPila[i]);
        }
    }

    public Object MostrarCima() {
        if (!PilaVacia()) {
            return listaPila[cima];
        } else {
            System.out.println("Pila Vacia!!");
            return null;
        }
    }
    
    
    public String MostrarPila(){       
        String texto="v";
        if(!PilaVacia()){            
            for (Object object : listaPila) {
                Cl_Producto pTemp=(Cl_Producto)object;
                texto+=pTemp.toString()+",";
            }
        }
        return texto;
    }
    
    
    
}
