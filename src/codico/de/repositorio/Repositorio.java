/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codico.de.repositorio;

import java.util.Scanner;

public class Repositorio {
   
   Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ESTUDIANTE");
    
    estudiante e= new estudiante("default",0,0,"default");
    e.ingreso_datospersonales();
    e.ingreso_datocadena();
    e.ingreso_datonumerico();
    e.muestrodatos();
    
        System.out.println("");
        System.out.println("");
        System.out.println("DEPORTISTAS");
        
    deportista d= new deportista("default",0,0,"default");
    d.ingreso_datospersonales();
    d.ingreso_datocadena();
    d.ingreso_datonumerico();
    d.muestrodatos();
    
        
    }
  
}