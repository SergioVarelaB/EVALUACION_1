
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
        int cont=0;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("cuantos datos se desean imprimir");
        int size = scanner.nextInt();
        System.out.println("introdusca "+ size + " valores numericos");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("dato numero " + i );
            arr[i] = scanner.nextInt();
        }
        System.out.println("introdusca el numero que se repite");
        int find= scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if(arr[i]==find){
                System.out.println("el valor esta en la posicion "+ (i+1));
                flag = false;
                cont++;
            }
        }
        if(flag==true){
            System.out.println("no se encotro el num");
        }
        System.out.println("el valor se repite "+cont+" veces");
    }
    
}
