
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
        String sNom;
        int iEdad;
        double dSalario;
        
        Scanner sScanner =new Scanner(System.in);
        
        System.out.println("¿Cual es tu nombre?");
        sNom=sScanner.next();
        System.out.println("¿Cual es tu edad?");
        iEdad=sScanner.nextInt();
        System.out.println("¿Cual es tu salario?");
        dSalario=sScanner.nextDouble();
        
        hacerAlgo(sNom, iEdad, dSalario);
    }
    public static void hacerAlgo(String sNombre, int iEdad, double dSalario){
        System.out.println(sNombre+" "+iEdad+" "+dSalario);
    }
}
