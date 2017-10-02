
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
        //Big O(N^2)
        //llenar el arreglo con numeros random
        Scanner sc = new Scanner(System.in);
        int media=0,moda=0;
        double varianza=0.0,dE;
        System.out.println("cuantas edades se van a capturar?");
        int many = sc.nextInt();
        int arrayAges[] =new int[many];
            for (int i = 0; i < many; i++) {
            System.out.println("ingrese la edad:");
            arrayAges[i]=sc.nextInt();
            media += arrayAges[i] ;
        }//media y varianza
        media = media/many;
        for (int i = 0; i < many; i++) {
            varianza+=Math.pow((arrayAges[i] - media),2);
        }
        dE = Math.sqrt(varianza / many);
        //moda    
        int arrVeces[] = new int[many];
        for (int i = 0; i < many; i++) {
            int veces = 0;
            for (int j = 0; j < many; j++) {
                if(arrayAges[i]==arrayAges[j]){
                    veces++;
                }
            }
            if (veces==1) { arrVeces[i]=0;break;}
            arrVeces[i]=veces;
        }
        for (int i = 0; i < arrVeces.length; i++) {
            if(arrVeces[i]>moda){moda=arrayAges[i];}
        }
        //imprimir
        System.out.println("la media es: "+media);
        System.out.println("la Desviacion Estandar es: "+ dE);
        System.out.println("la moda es : "+ moda );
    }
}