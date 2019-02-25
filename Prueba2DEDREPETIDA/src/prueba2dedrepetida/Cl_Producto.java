/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba2dedrepetida;

/**
 *
 * @author Duoc
 */
public class Cl_Producto {
    
    
    private int codProducto;
    private int cantidad;

    public Cl_Producto() {
    }

    public Cl_Producto(int producto, int cantidad) {
        this.codProducto = producto;
        this.cantidad = cantidad;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cl_Producto{" + "producto=" + codProducto + ", cantidad=" + cantidad + '}';
    }
    
     
    
}
