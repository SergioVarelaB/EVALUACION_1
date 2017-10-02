
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
        //Big O(N)
        String asMeses[]= {"Enero","Febrero","Marzo",
                           "Abril", "mayo","Junio",
                           "julio","Agosto","Septiembre",
                           "Octubre","Noviembre","Diciembre"};
        //Dias
        int aiDias[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    //solicitar el mes de usuario
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("Numero de mes(1-12)");
        int iMes = sCaptu.nextInt();
        System.out.println("el mes es: "+ asMeses[iMes-1]+ " y tiene: "+aiDias[iMes-1]+ "dias");
        
            }
}
