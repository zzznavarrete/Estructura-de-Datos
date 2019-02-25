/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2ded.nicolasneira;

/**
 *
 * @author gary
 */
public class ColaLineal {

    private int TamMax = 49;
    private int frente;
    private int fin;
    private Object[] listaCola;

    public int getFrent() {
        return frente;
    }

    public int getFin() {
        return fin;
    }

    public Object[] getLista() {
        return listaCola;
    }

    public ColaLineal() {

        frente = 0;
        fin = 0;
        listaCola = new Object[TamMax];
    }

    public ColaLineal(int tamano) {

        frente = 0;
        fin = 0;
        TamMax = tamano;
        listaCola = new Object[TamMax];
    }

    public ColaLineal(int frente, int fin, Object[] listaCola) {
        this.frente = frente;
        this.fin = fin;
        this.listaCola = listaCola;
    }

    //metodos fin y llena
    public boolean ColaVacia() {
        return frente == fin;
    }

    public boolean ColaLLena() {
        return fin == TamMax - 1;
    }

    //metodos encolar y desencolar
    public void Encolar(Object obj) {

        if (!ColaLLena()) {

            listaCola[fin] = obj;
            fin++;
        } else {
            System.out.println("Cola llena!!");
        }
    }

    public Object Desencolar() {
        if (!ColaVacia()) {
            Object Elemento = listaCola[frente];
            frente++;
            return Elemento;
        } else {
            System.out.println("cola vacia");
            return null;
        }
    }

    public Object MostrarFrente() {
        return (!ColaVacia() ? listaCola[frente] : null);
    }

    public void MostraCola() {
        if (!ColaVacia()) {
            for (int i = frente; i < fin; i++) {
                System.out.println("Dato:" + listaCola[i]);
            }

        } else {
            System.out.println("Cola Vacia!!");
        }
    }
    
    
}
