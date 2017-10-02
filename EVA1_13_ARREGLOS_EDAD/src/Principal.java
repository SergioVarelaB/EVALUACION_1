
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio varela 16550457
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Big O(2N)
        //Preguntar cuantas edades
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Cuantas edades se van a capturar?");
        int iCant = sCaptu.nextInt();//cantidad a capturar
        //inicializar arreglo
        int aiEdades[] = new int[iCant];
        //capturar
        for (int i = 0; i < iCant; i++) {
            System.out.println("Introduce la edad: ");
            aiEdades[i]=sCaptu.nextInt();
        }
        //calcular el promedio
        int iAcum = 0;
        for (int iVal : aiEdades) {
            iAcum = iAcum + iVal;
        }
        double dProm = iAcum/iCant;
        System.out.println("El promedio es: "+ dProm);
    }
    
}
