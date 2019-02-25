/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author Duoc
 */
public class Duenio {

    private String rut;
    private String nombre;

    public Duenio() {
    }

    public Duenio(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        
        if(rut.length()>10){
        this.rut = rut;
        }else{
            throw new IllegalArgumentException("rut largo mínimo 11 carácteres");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Duenio{" + "rut=" + rut + ", nombre=" + nombre + '}';
    }
    
    

    
    
}
