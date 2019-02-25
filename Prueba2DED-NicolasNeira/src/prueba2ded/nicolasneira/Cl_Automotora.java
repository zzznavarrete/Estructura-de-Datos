/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba2ded.nicolasneira;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Duoc
 */
public class Cl_Automotora {
    
    private Date horaInicio ;
    private Date horaCierre;
    private int largo=49;
    private Date horaActual;
    
   
    private ColaLineal colaAutos;

   
    
    
    public Cl_Automotora() throws ParseException {
        colaAutos = new ColaLineal(largo);
        SimpleDateFormat fmt=new SimpleDateFormat("hh:mm:ss");        
        horaInicio =  fmt.parse("06:00:00");      
        horaCierre = fmt.parse("10:00:00");
        
    }

    public void AgregarCliente(Cl_Auto cli) {
        colaAutos.Encolar(cli);
    }

     
   public void test() {
       
        Calendar cal = Calendar.getInstance();
        Date horaLlegada = new Date();
        Random rnd = new Random();
        SimpleDateFormat ftm = new SimpleDateFormat("hh:mm:ss");
        cal.setTime(horaInicio);
        Cl_Auto cTemp = null;
        
        int min = 0;
        int i =0;
        int total=0;
        int masDos=0;
        
        do{
            i++;
            
           
            cTemp = (Cl_Auto) colaAutos.Desencolar();
            if(cTemp!=null)
                    if(cTemp.TotalDinero() > 200000){
                        masDos++;
                    }
                total+=cTemp.TotalDinero();
            
            
            
            horaLlegada = cal.getTime();
            int minutos = (int) (rnd.nextDouble() * 2 + 3);
            int minutosAtencion = (int)(10+((rnd.nextDouble()*5+0)));
            
            min = (minutos+minutosAtencion);
            cal.add(Calendar.MINUTE, min);
            
            horaActual = cal.getTime();
            
            System.out.println("");
            System.out.println("Hora llegada: "+ ftm.format(horaLlegada)  );
            System.out.println( "Minutos en llegar: " + minutos + " Minutos en atenderse "+ minutosAtencion);
            System.out.println("Auto: "+(int)cTemp.getId()+  "Total dinero : $"+ cTemp.TotalDinero());
            
            
            
        } while (horaActual.before(horaCierre));
            
            
        
        
            int totalTotal = total/i;
        
            System.out.println("----------------------------------------");
            System.out.println("Se atendieron un total de "+i+" autos");
            
            System.out.println("Fueron notificado:" +masDos+" propietarios por superar los $200.000");
            System.out.println("Promedio de pago"+ totalTotal);
            
            
        }

        
        
    
   
   
   
   //retorna el total de las mantenciones
   public int totalDinero() {
        int total = 0;
        Cl_Auto cTemp = null;
        do {
            cTemp = (Cl_Auto) colaAutos.Desencolar();
            if(cTemp!=null)
                total+=cTemp.TotalDinero();
            
        } while (cTemp != null);
        return total;
    }

    
    
}
