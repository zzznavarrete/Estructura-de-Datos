
package DED;


public class Arbol {
    protected NodoArbol raiz;

    public Arbol() {
        raiz=null;
    }

    public Arbol(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
    public boolean esVacio(){
        return raiz==null;
    }
    public static NodoArbol nuevoArbol(NodoArbol izq,Object dato, NodoArbol der){
        return  new NodoArbol(izq, dato, der);
    }
    public void preOrden(NodoArbol r){
        if(r!=null){
            r.vista();
            preOrden(r.getIzqo());
            preOrden(r.getDer());
        }
    }
    public void inOrden(NodoArbol r){
        if(r!=null){
            inOrden(r.getIzqo());
            r.vista();
            inOrden(r.getDer());
        }
    }
    public void postOrden(NodoArbol r){
        if(r!=null){
            postOrden(r.getIzqo());            
            postOrden(r.getDer());
            r.vista();
        }
    }
    public int numNodos(NodoArbol raiz){
        if(raiz==null){
            return 0;
        }else{
            return 1+numNodos(raiz.getIzqo())+numNodos(raiz.getDer());
        }
        
    }
    
    
    public void insertarNodoArbolDerecha(Object dato){
        raiz = insertarBuscadorNodoArbol(raiz, dato);
    }

    public NodoArbol insertarBuscadorNodoArbol(NodoArbol raizSub, Object dato) {
        if(raizSub == null){
            raizSub = new NodoArbol(dato);
        }else{
            NodoArbol dr;
            dr = insertarBuscadorNodoArbol(raizSub.getDer(), dato);
            raizSub.setDer(dr);
        }
        
        return raizSub;
        
    }
    
    public NodoArbol insertarBuscadorOrdenFactura(NodoArbol raizSub, Object dato){
        if(raizSub == null){
            raizSub = new NodoArbol(dato);
        } else if(dato < (Integer)raizSub.getDato()){
            NodoArbol iz;
            iz = insertarBuscadorOrdenFactura(raizSub.getIzqo(), dato);
            raizSub.setIzqo(iz);
        }else if (dato > (Integer)raizSub.getDato()){
            NodoArbol dr;
            dr= insertarBuscardorOrdenFactura(raizSub.getDer(), dato);
            raizSub.setDer(dr);
        }else{
            System.out.println("Nodo duplicado");
        }
        return raizSub;
        
    }
    
    
    
}
