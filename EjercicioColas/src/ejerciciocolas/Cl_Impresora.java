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
public class Cl_Impresora {
    
    private int codigo;
    private String documento;
    private int paginas;
    private String[] usuarios = new String[3];

    public Cl_Impresora() {
    }

    public Cl_Impresora(int codigo, String documento, int paginas, String[] usuarios) {
        this.codigo = codigo;
        this.documento = documento;
        this.paginas = paginas;
        this.usuarios = usuarios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String[] usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Cl_Impresora{" + "codigo=" + codigo + ", documento=" +
                documento + ", paginas=" + paginas 
                + ", usuarios=" + mostrarUsuarios() + '}';
    }
    
    
     public String mostrarUsuarios(){
         String palabras="";
         for (int i = 0; i < 3; i++) {
             if(usuarios[i]!=null){
                 palabras +=""+usuarios[i];
             }
         }
         return palabras;
     }
    
     
     public int contarUsuarios(){
         int cantU=0;
         for (int i = 0; i < usuarios.length; i++) {
             if(usuarios[i] != null){
                 cantU ++;
             }
         }
         return cantU;
     }
     
    public int cantPaginas(){
        int cantidad=0;
        
        cantidad = getPaginas()*contarUsuarios();
        
        return cantidad;
    }
     
    
    
     
    
}
