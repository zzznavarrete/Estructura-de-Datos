/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba1ded;

import java.util.ArrayList;

/**
 *
 * @author Duoc
 */
public class Lista {
   
    
    private Lista l;
    private Nodo primero;
    
    public Lista() {
        l = null;
        primero = null;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    //método agregar
    public void insertarCabezaLista(Object dato) {
        Nodo nuevo = new Nodo(dato); // sin enlace null
        nuevo.setEnlace(primero);
        primero = nuevo;
        System.out.println("Agregado~!");
    }

    //metodo listar Nodos
    public void Listar() {
        Nodo ntemp = getPrimero();
        while (ntemp != null) {
            
            Cl_Curso c = (Cl_Curso) ntemp.getDato();
            c.mostrarDatos();
            ntemp = ntemp.getEnlace();
        }
        System.out.println("Listo!");
    }//<- llave final método

   public int promedioPrecios() {
        Nodo ntemp = getPrimero();
        int x = 0;
        int y = 0;
        while (ntemp != null) {
            Cl_Curso c = (Cl_Curso) ntemp.getDato();
            x += c.getPrecio();
            y += 1;
            ntemp = ntemp.getEnlace();
        }
        
        int promedio = (x/y);
        
        return promedio;
        
    }
    
   public void obtenerMenores(){
        Nodo ntemp = getPrimero();
        int cont =0;
        int x=0;
        while (ntemp != null) {
            Cl_Curso c = (Cl_Curso) ntemp.getDato();
            if(c.getPrecio() < promedioPrecios()){
                cont++;
            }
            x++;
            ntemp = ntemp.getEnlace();
        }
        
        int y = (cont *100)/x;
       System.out.println("Existe un "+y+"% de cursos con precio menor al promedio");
   }
    
    
   
   public void menores3sem(){
        Nodo ntemp = getPrimero();
        int x = 0;
        int y = 0;
        ArrayList<Cl_Curso> lista = new ArrayList<>();
        while (ntemp != null) {
            Cl_Curso c = (Cl_Curso) ntemp.getDato();
            if(c.getDuracion()>3){
                lista.add(c);
            }
            ntemp = ntemp.getEnlace();
        }
        System.out.println("Cursos con más de 3 semanas : ");
        System.out.println("*********************************");
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).mostrarDatos();
       }
        
   }
   
   
   
   
   public void gananciaTotal(){
       
        Nodo ntemp = getPrimero();
        int ganancia = 0;
        while (ntemp != null) {
            Cl_Curso c = (Cl_Curso) ntemp.getDato();
            ganancia = c.getCupos()*c.getPrecio();
            System.out.println("Ganancia total del curso "+c.getNombre()+ ":");
            System.out.println("$"+ganancia);
            ntemp = ntemp.getEnlace();
        }
        
        
        
       
   }
   
   
   
   public void soloSerena(){
       
        Nodo ntemp = getPrimero();
        ArrayList<Cl_Curso> lista = new ArrayList<>();
        
        String[] arr  = new String[3];
        while (ntemp != null) {
            Cl_Curso c = (Cl_Curso) ntemp.getDato();
            arr = c.getCiudades();
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i].equals("La Serena")){
                   lista.add(c);
                }
            }
            ntemp = ntemp.getEnlace();
        }
         for (int i = 0; i < lista.size(); i++) {
            lista.get(i).mostrarDatos();
       }
        
        
   }
   
   
   
   
   
   
   
   
   
   
    
}
