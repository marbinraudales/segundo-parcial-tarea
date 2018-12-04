/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codico.de.repositorio;

import java.util.Scanner;

public class estudiante extends persona {

   
  Scanner s = new Scanner(System.in);

    public estudiante(String datocadena, int datonumerico, int edad, String nombre) {
        super(datocadena, datonumerico, edad, nombre);
    }

   
 

   
    public void ingreso_datocadena() {
        
        //aqui hago referencia a la variable dato cadena como el nombre de la carrera del estudiante
        System.out.println("Ingrese que carrera estudia: ");
        setDatocadena(s.nextLine());
    }

   
    public void ingreso_datonumerico() {
        System.out.println("Ingrese cuantas asignaturas tiene aprovadas: ");
        setDatonumerico(s.nextInt());
    }
     public void ingreso_datospersonales()
    {
        System.out.println("Ingrese su nombre: ");
        setNombre( s.nextLine());
        System.out.println("Ingrese su edad: ");
        setEdad(s.nextInt());
       
        
    }


 
    public void muestrodatos() {
        System.out.println("Nombre:-----------------"+getNombre());
        System.out.println("Edad:------------------ "+getEdad());
        System.out.println("Carrera:----------------"+getDatocadena());
        System.out.println("Asignaturas aprovadas:--"+getDatonumerico());
    }
}

    
   
   
        


