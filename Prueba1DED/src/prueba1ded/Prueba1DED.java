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
public class Prueba1DED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Test();

    }

    private static void Test() {
        //agregando
        Lista capacitacion = new Lista();
        Cl_Curso curso1 = new Cl_Curso("Atención de Clientes 1", 5, 190000, 15, new String[]{"Santiago"});
        Cl_Curso curso2 = new Cl_Curso("Contabilidad Básica 3", 7, 258000, 30, new String[]{"Santiago", "La Serena"});
        Cl_Curso curso3 = new Cl_Curso("Capacitación Laboral 1", 5, 185700, 15, new String[]{"Santiago"});
        Cl_Curso curso4 = new Cl_Curso("Office 2", 8, 155000, 30, new String[]{"Rancagua", "Chillán", "La Serena"});
        Cl_Curso curso5 = new Cl_Curso("Contabilidad Básica 2", 5, 258000, 15, new String[]{"Valparaíso", "Viña del Mar"});
        Cl_Curso curso6 = new Cl_Curso("Atención de Clientes 1", 3, 255000, 20, new String[]{"La Serena", "Valparaíso", "Viña del mar"});
        Cl_Curso curso7 = new Cl_Curso("Office 1", 3, 375000, 10, new String[]{"Temuco", "Chillán", "Pto.Montt"});
        Cl_Curso curso8 = new Cl_Curso("Contabilidad Básica 1", 5, 350000, 30, new String[]{"Iquique", "Arica"});

        capacitacion.insertarCabezaLista(curso1);
        capacitacion.insertarCabezaLista(curso2);
        capacitacion.insertarCabezaLista(curso3);
        capacitacion.insertarCabezaLista(curso4);
        capacitacion.insertarCabezaLista(curso5);
        capacitacion.insertarCabezaLista(curso6);
        capacitacion.insertarCabezaLista(curso7);
        capacitacion.insertarCabezaLista(curso8);

        capacitacion.Listar();
        System.out.println("Promedio de valores: $" + capacitacion.promedioPrecios());
        System.out.println("*************************************************");
        capacitacion.obtenerMenores();
        System.out.println("*************************************************");
        capacitacion.menores3sem();
        System.out.println("*************************************************");
        capacitacion.gananciaTotal();
        System.out.println("*************************************************");
        System.out.println("CURSOS DICTADOS EN LA CIUDAD DE LA SERENA: ");
        capacitacion.soloSerena();
        
        
        
    }

}
