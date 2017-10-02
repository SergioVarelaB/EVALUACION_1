
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Varela 16550457
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Big O(N)
         Scanner sc = new Scanner(System.in);
        int size = 352600000 ;
        int arr[]= new int[size];
        for (int i = 0; i < size; i++) {
            //System.out.println("cual es el dato?");
            arr[i]= (int)(Math.random()*100)+1;
        }
    }
}
