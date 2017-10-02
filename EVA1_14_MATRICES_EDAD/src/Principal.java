
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
        //Big O(N^2)
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Cuantos grupos tiene?");
        int iCantG = sCaptu.nextInt();
        int matAl[][] = new int[iCantG][];
        for (int i = 0; i < iCantG; i++) {
            System.out.println("Introduce la cantidad de alumnos: ");
            int cantAl = sCaptu.nextInt();
            matAl[i]= new int[cantAl];
            double prom = 0;
            for (int j = 0; j < cantAl; j++) {
                System.out.println("cuales son sus edades?");
                prom = prom + sCaptu.nextDouble();
            }
            System.out.println("el promedio es: "+ prom/cantAl);

        }
        }
    
}
