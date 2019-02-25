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
public class Vivienda {
    
    private int numero;
    private String direccion;
    private Duenio duenio;

    public Vivienda() {
        numero = 1;
        direccion = "";
        duenio = new Duenio();
    }

    public Vivienda(int numero, String direccion, Duenio duenio) {
        setNumero(numero);
        setDireccion(direccion);
        setDuenio(duenio);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero > 0){
        this.numero = numero;
        }else{
            throw new IllegalArgumentException("debe ser mayor a 0");
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "numero=" + numero + ", direccion=" + direccion + ", duenio=" + duenio + '}';
    }
    
    
    
    
    
}
