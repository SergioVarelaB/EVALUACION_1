
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
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el numero");
        int primo = sc.nextInt();
        int residuo;
        for (int i = 2; i < primo; i++) {
            residuo = primo%i;
            if(residuo == 0){
                System.out.println("no es primo");
                break;
            }
        }
        int raiz = (int)(Math.sqrt(primo));
        for (int i = 2; i < raiz; i++) {
            if(primo%i==0){
                System.out.println("no es primo");
                break;
            }
        }
        
    }
    
}
