/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba2dedrepetida;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Duoc
 */
public class Cl_Proveedor {

    private ColaLineal colaMensajes;
    private ColaLineal colaMensajesTemp;
    private Date horaInicio;
    private Date horaActual;
    private Date horaActual2;
    private Date horaCierre;
    private int totalCola = 0;
    private int totalDesenCola = 0;

    public Cl_Proveedor() throws ParseException {
        colaMensajes = new ColaLineal();
        SimpleDateFormat fmt = new SimpleDateFormat("hh:mm:ss");
        horaInicio = fmt.parse("01:00:00");
        horaCierre = fmt.parse("05:00:00");
    }

    public void encolarMensaje() {
        Calendar cal = Calendar.getInstance();
        Random rnd = new Random();
        SimpleDateFormat ftm = new SimpleDateFormat("hh:mm:ss");
        cal.setTime(horaInicio);
        Cl_Mensaje cTemp = null;

        do {

            Pila p = new Pila();

            for (int i = 0; i < 5; i++) {
                int codProducto = (int) (rnd.nextDouble() * 6530 + 11530);
                int cantProductos = (int) (rnd.nextDouble() * 900 + 1);

                p.Apilar(new Cl_Producto(codProducto, cantProductos));
            }

            int codProveedor = (int) (rnd.nextDouble() * 999 + 1);

            cTemp = new Cl_Mensaje(codProveedor, p);
           
            colaMensajes.Encolar(cTemp);

            int minutos = 3;
            cal.add(Calendar.MINUTE, minutos);

            horaActual = cal.getTime();

            totalCola++;
            
            
            System.out.println("Hora: " +ftm.format(horaActual) );

        } while (horaActual.before(horaCierre));

        System.out.println("Total mensajes encolados :" + totalCola);
    }

    public void desencolarMensajes() {

        Calendar cal = Calendar.getInstance();
        Random rnd = new Random();
        SimpleDateFormat ftm = new SimpleDateFormat("hh:mm:ss");
        cal.setTime(horaInicio);
        Cl_Mensaje mTemp = null;
        colaMensajesTemp = new ColaLineal(colaMensajes.getFrent(), colaMensajes.getFin(), colaMensajes.getLista());
        int totalisimo = 0;
        int contadorNotificados = 0;
        do {
            int minutos = (int) (rnd.nextDouble() * 6 + 10);
            cal.add(Calendar.MINUTE, minutos);

            horaActual2 = cal.getTime();

            mTemp = (Cl_Mensaje) colaMensajesTemp.Desencolar();

            int promedioMen = mTemp.promedioProductos();
            int totalProdMensaje = mTemp.totalProductos();
            boolean notificado = false;

            if (promedioMen < 550) {
                contadorNotificados++;
                notificado = true;
            }

            System.out.println("");
            System.out.println("Hora: " + ftm.format(horaActual2));
            System.out.println("Mensaje: " + mTemp.toString());
            System.out.println("Total productos: " + totalProdMensaje);
            System.out.println("Notificado por promedio menor a 550: " + notificado);

            totalDesenCola++;

            totalisimo = totalisimo +totalProdMensaje;

        } while (horaActual2.before(horaCierre));

        int promedioTotal = (totalisimo / totalDesenCola);

        System.out.println("*****************************************************");
        System.out.println("Mensajes notificados: " + totalDesenCola);
        System.out.println("Cantidad proveedores sin notificar: " + (totalCola - totalDesenCola));
        System.out.println("Cantidad TOTAL de productos: " + totalisimo);
        System.out.println("Cantidad de proveedores notificados por promedio menor a 550: " + contadorNotificados);
        System.out.println("Promedio TOTAL de productos enviados: " + promedioTotal);
    }

}
