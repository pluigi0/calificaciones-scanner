
package Calificaciones;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SumaCalificaciones {
    public static void main (String [] args) {
        Scanner leer = new Scanner (System.in);
        DecimalFormat formato2 = new DecimalFormat("#.##");

        
        double cali1, cali2, cali3;
        
        double suma;
        
        System.out.println("\t\t\tPrograma que calcula e imprime la suma de 3 calificaciones ");
        
        System.out.println(" Ingrese las 3 calificaciones: "); //obtenemos las 3 calificaciones
        cali1 = leer.nextDouble();
        System.out.println("\n");
        cali2 = leer.nextDouble();
        System.out.println("\n");
        cali3 = leer.nextDouble();
        
        suma = cali1 + cali2 +cali3; //Sumamos las 3 calificaciones
        
        System.out.println("\nLa suma de las 3 calificaciones es: "+formato2.format(suma)); //Se imprime la suma de las calificaciones
        
    }
}
