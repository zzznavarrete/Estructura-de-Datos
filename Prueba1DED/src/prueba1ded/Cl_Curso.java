/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba1ded;

/**
 *
 * @author Duoc
 */
public class Cl_Curso {
    //ARRAY 3 CIUDADES 
    
    private String nombre;
    private int duracion;
    private int precio;
    private int cupos;
    private String[] ciudades = new String[3];;

    public Cl_Curso(String nombre, int duracion, int precio, int cupos, String[] ciudades) {
        setNombre(nombre);
        setDuracion(duracion);
        setPrecio(precio);
        setCupos(cupos);
        this.ciudades = ciudades;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }

    public String[] getCiudades() {
        return ciudades;
    }

    public void setCiudades(String[] ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "Cl_Curso{" + "nombre=" + nombre + ", duracion=" + duracion + ", precio=" + precio + ", cupos=" + cupos + ", ciudades=" + ciudades + '}';
    }

  

   
  
   public void mostrarDatos(){
       
   
        System.out.println("------------------");
        System.out.println("Nombre del curso: "+getNombre());
        System.out.println("Duración: "+getDuracion());
        System.out.println("Precio: $"+getPrecio());
        System.out.println("Cupos: "+getCupos());
        for (int i = 0; i < ciudades.length; i++) {
            
            System.out.println("Ciudades: " + ciudades[i]+" ,");
        }
        System.out.println("-------------------");
        
    }
    
    
    
    
}
