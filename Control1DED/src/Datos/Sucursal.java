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
public class Sucursal {

    private int codigo;
    private String nombre;
    private String direccion;
    private Vivienda[] vivienda;
    private int capacidadMaxima;
    private static int indice = 0;
    private Nodo primero;

    public Sucursal() {
        primero = null;

    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Sucursal(int codigo, String nombre, String direccion, int capacidadMaxima) {
        setCodigo(codigo);
        setNombre(nombre);
        setDireccion(direccion);
        setCapacidadMaxima(capacidadMaxima);
        vivienda = new Vivienda[capacidadMaxima];
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Vivienda[] getVivienda() {
        return vivienda;
    }

    public void setVivienda(Vivienda[] vivienda) {
        this.vivienda = vivienda;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public static int getIndice() {
        return indice;
    }

    public static void setIndice(int indice) {
        Sucursal.indice = indice;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", vivienda=" + vivienda + ", capacidadMaxima=" + capacidadMaxima + '}';
    }

    //Agregar vivienda
    public boolean agregarViviendas(Object entrada) {
        Vivienda v1 = (Vivienda) entrada;
        
        
            
            
                    vivienda[0] = v1;
                    System.out.println(vivienda[0].toString());
                    return true;
                    
   
        
        
            
    }
    
    
    
    
    public boolean buscarVivienda(int num){
        
        for (int i = 0; i < vivienda.length; i++) {
            if(vivienda[i].getNumero() == num){
                return true;
            }
        }
 
        return false;
    }
    
    
    
}

    
    
    
    
    
    
    
    
    
    

        
       
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

