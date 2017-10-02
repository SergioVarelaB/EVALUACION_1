
import java.util.Scanner;


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
        //Big O(2N)
        Scanner scanner = new Scanner(System.in);
        System.out.println("de cuantos datos se desea el arreglo?");//tamaño del arreglo
        int size = scanner.nextInt();
        System.out.println("introduzca "+ size + " valores numericos");
        int arr[] = new int[size];//creamos arreglo y lo llenamos
        for (int i = 0; i < size; i++) {
            System.out.println("dato numero " + (i+1) );
            arr[i] = scanner.nextInt();
        }//se toma como valor mayor y menor la primera posicion del arreglo
        int may = arr[0];
        int men = arr[0];
        for (int i = 0; i < size; i++) {//comparamos con los demas datos del arreglo
            if(arr[i]> may){
                may=arr[i];
            }
            if(arr[i] < men){
                men=arr[i];
            }
    }
        System.out.println("el valor menor es: "+men);
        System.out.println("el valor mayor es: "+may);
    }
}
