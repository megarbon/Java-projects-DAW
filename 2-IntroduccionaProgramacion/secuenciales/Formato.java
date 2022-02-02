package secuenciales;

import java.text.*;
/**
 *
 * @author codesitio.com
 */
public class Formato {
 
   static public void main(String[] args) {
       
        //Patr�n que da formato a la salida
        String patron = "###.##";
        
        //Creamos un objeto DecimalFormat
        DecimalFormat objDF = new DecimalFormat (patron);
        
        //le a�adimos el n�mero que queremos presentar con formato
        String cadena = objDF.format (9999999.99);
        
        //Lo presentamos en pantalla
        System.out.println (cadena);
        
        cadena = objDF.format (9.99);
        
        //Lo presentamos en pantalla
        System.out.println (cadena);
   }   
}
