/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2ded.nicolasneira;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Duoc
 */
public class Cl_Auto {

    private int id;
    

    private Pila mantenciones;

    public Cl_Auto() {
    }

    public Cl_Auto(int id, Pila mantenciones) {
        this.id = id;
        
        this.mantenciones = mantenciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Pila getMantenciones() {
        return mantenciones;
    }

    public void setMantenciones(Pila mantenciones) {
        this.mantenciones = mantenciones;
    }

    @Override
    public String toString() {
        
        return "Cl_Auto{" + "id=" + id  + ", mantenciones=" + mantenciones.MostrarPila() + '}';
    }

    public int TotalDinero() {
        int dinero = 0;
        Cl_Mantencion pTemp = null;
        do {
            pTemp = (Cl_Mantencion) mantenciones.desapilar();
            if (pTemp != null) {
                dinero += pTemp.getPrecio();
            }

        } while (pTemp != null);
        return dinero;
    }
    
    public String mostrarMantenciones(){
        return mantenciones.MostrarPila();
    }
    

}
