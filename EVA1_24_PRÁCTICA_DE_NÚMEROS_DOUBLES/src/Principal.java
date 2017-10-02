/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author savb2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //big oh (4N^2)
        double matriz[][] = new double[5][5];
        double matriz2[][] = new double[5][5];
        double mResult[][]=new double[5][5];
        //Llenamos las primeras 2 matrices 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= (int) (double) (((Math.random())*10)+1);
                matriz2[i][j]= (int) (double) (((Math.random())*10)+1);
                mResult[i][j]=(matriz[i][j]*matriz2[i][j]); 
            }
        }
        //imprimimos
        System.out.println("Matriz 1");
        for (double[] x : matriz) {
            for (double i : x) {
               System.out.print("["+i+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Matriz 2");
        for (double[] x : matriz2) {
            for (double i : x) {
               System.out.print("["+i+"]");
            }
            System.out.println("");
        }
        //multiplicamos e imprimimos
        System.out.println("");
        System.out.println("la multiplicacion de matrices es:");
        for (double[] x : mResult) {
            for (double i : x) {
               System.out.print("["+i+"]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
