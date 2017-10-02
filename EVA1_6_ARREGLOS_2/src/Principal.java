
import java.util.Scanner;
/**
 *
 * @author Sergio Varela 16550457
 */

public class Principal {

    /**
     * @param args the command line arguments
     */
    
    public static final int TAMA_ARRE = 5;
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Big O(4N)
        int aiEdad[];
        aiEdad = new int[TAMA_ARRE];
        Scanner sCaptu = new Scanner(System.in);
        for (int i = 0; i < TAMA_ARRE; i++) {
            System.out.println("Introduce una edad ");
            aiEdad[i] = sCaptu.nextInt();
        }
        //IMPRIMIR
        for(int x : aiEdad){
            System.out.println("Edades: " + x);
        }
        //CREAR DUPLICADO
        int aiCopiaEdad[];
        /*aiCopiaEdad = aiEdad;*/ //NO CREA UN DUPLICADO
        aiCopiaEdad = new int[TAMA_ARRE];
        for (int i = 0; i < TAMA_ARRE; i++) {
            aiCopiaEdad[i] = aiEdad[i];
        }
        for(int x : aiCopiaEdad){
            System.out.println("Copia edad = " + x);
        }
        System.out.println(aiCopiaEdad);
        System.out.println(aiEdad);
    }
    
}
