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
public class Cl_Mensaje {
    
    private int codProveedor;
    
    private Pila productos;

    public Cl_Mensaje() {
        productos = new Pila();
    }

    public Cl_Mensaje(int codProveedor, Pila productos) {
        this.codProveedor = codProveedor;
        this.productos = productos;
    }

    public int getCodProveedor() {
        return codProveedor;
    }

    public void setCodProveedor(int codProveedor) {
        this.codProveedor = codProveedor;
    }

    public Pila getProductos() {
        return productos;
    }

    public void setProductos(Pila productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
       String texto = "Cl_Mensaje{" + "codProveedor=" + codProveedor + ", productos=" + productos.MostrarPila() + '}';
       return texto;
    }
    
    
    public int totalProductos() {
        Pila productosTemp=new Pila(productos.getCima(), productos.getListaPila());
        int totalProductos = 0;
        Cl_Producto pTemp = null;
        do {
            pTemp = (Cl_Producto) productosTemp.desapilar();
            if (pTemp != null) {
                totalProductos += pTemp.getCantidad();
            }

        } while (pTemp != null);
        return totalProductos;
    }
    
    
     public int promedioProductos() {
        Pila productosTemp=new Pila(productos.getCima(), productos.getListaPila());
        int cantProdcutos = 0;
        int promedio = 0;
        int cont = 0;
        Cl_Producto pTemp = null;
        do {
            pTemp = (Cl_Producto) productosTemp.desapilar();
            if (pTemp != null) {
                cantProdcutos += pTemp.getCantidad();
                cont++;
            }
        } while (pTemp != null);
        promedio = cantProdcutos / cont;
        return promedio;
    }
    
    
}
