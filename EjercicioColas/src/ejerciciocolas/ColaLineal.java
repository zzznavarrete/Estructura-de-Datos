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
public class ColaLineal {


    private int TamMax = 49;
    private int frente;
    private int fin;
    private Object[] listaCola;

    public Object[] getListaCola() {
        return listaCola;
    }

    public int getFrente() {
        return frente;
    }

    public int getFin() {
        return fin;
    }

    public ColaLineal() {
        frente = 0;
        fin = 0;
        listaCola = new Object[TamMax];
    }

    public ColaLineal(int tamaño) {
        frente = 0;
        fin = 0;
        TamMax = tamaño;
        listaCola = new Object[TamMax];
    }

    public ColaLineal(Object[] listaCola, int frente, int fin) {
        this.listaCola = listaCola;
        this.frente = frente;
        this.fin = fin;
    }

    //metodos fin y llena 
    public boolean colaVacia() {
        return frente == fin;

    }

    public boolean colaLlena() {
        return fin == TamMax - 1;
    }

    //metodos encolar y desencolar
    public void encolar(Object obj) {
        if (!colaLlena()) {
            listaCola[fin] = obj;
            fin++;
        } else {
            System.out.println("Cola Llena!!");
        }
    }

    public Object desencolar() {
        if (!colaVacia()) {
            Object elemento = listaCola[frente];
            frente++;
            return elemento;
        } else {
            //System.out.println("Cola Vacia!!");
            return null;
        }
    }

    public Object mostrarFrente() {
        return (!colaVacia() ? listaCola[frente] : null);
    }

    public void mostrarCola() {
        if (!colaVacia()) {
            for (int i = frente; i < fin; i++) {
                System.out.println("Dato: " + listaCola[i]);
            }
        } else {
            System.out.println("Cola Vacia!!");
        }
    }

}