/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.una.intento;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Noe
 */
public class Intento {
    public static void main(String[] args) {
        
        Scanner entradaDatos = new Scanner(System.in);
        
       
        Obj objeto = new Obj();
        
        System.out.println(objeto.sumar());
        //System.out.println("Ingrese la fecha que desea usar");
       // String fecha1 = entradaDatos.nextLine();
         
        Calendar calendario = new GregorianCalendar();
       Date fecha = new Date();
       
       calendario.setTime(fecha);
       
       String dateAString = calendario.toString();
       
       
       int year = calendario.get(Calendar.YEAR);
       int mes = calendario.get(Calendar.MONTH);
       int dia = calendario.get(Calendar.DATE);
       
        System.out.println("Year ="+ year +"/mes= "+ (mes+1) +"/dia= "+  dia );
         
        int yearnew = 1983;
        
        calendario.set(yearnew, 3, 21);
        
        System.out.println("La fecha es: "+calendario.get(Calendar.DATE)+"/"+calendario.get(Calendar.MONTH)+"/"+calendario.get(Calendar.YEAR));

    }

}

class Obj {
    
    private int x, y, z, total;

    public Obj() {
    }
    
    
    
    
    public Obj(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

 
    public String sumar() {
        x =10;
        y = x;
        z = y;
        total = x + y + z;
        return "El total de la suma es: " + total;
    }
}
