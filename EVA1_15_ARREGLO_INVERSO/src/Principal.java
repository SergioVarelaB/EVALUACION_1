
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
        //Big O(4N)
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos datos se desean imprimir");
        int noAr = scanner.nextInt();
        System.out.println("introdusca "+ noAr+ " valores numericos");
        int arr[] = new int[noAr];
        for (int i = 0; i < noAr; i++) {
            System.out.println("dato numero " + i );
            arr[i] = scanner.nextInt();
            //System.out.println(arr[i]);
        }
        int arrInv[]= new int[noAr];
        int j = 0;
        for (int i = noAr-1; i >= 0; i--) {
            arrInv[j] = arr[i];
            j++;
            
                    
        }
        System.out.println("Original");
        for (int b : arr) {
            System.out.print(b+" ");
            
        }
        
        System.out.println("");
        System.out.println("Copia");
        for (int b : arrInv) {
            System.out.print(b+" ");
            
        }
    }
    
}
