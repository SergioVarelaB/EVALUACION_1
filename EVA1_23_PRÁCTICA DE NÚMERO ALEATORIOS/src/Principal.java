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
        //Big oh(3N^2)
        int matriz[][] = new int[5][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= (int) (((Math.random())*100)+1);
                //matriCop[j][i] = matriz[j][i];
            }
    
        }
        for (int[] x : matriz) {
            for (int i : x) {
               System.out.print("["+i+"]");
            }
            System.out.println("");
        }
        System.out.println("   ");
        
        //copia
       int maCop[][]= new int[5][5];
        int z, a= 0;
        for (int i = 4; i >= 0; i--) {
            z=0;
            for (int j = 4; j >=0; j--) {
                maCop[a][z]=matriz[i][j];
                z++;
            }
            a++;
        }
        for (int[] is : maCop) {
            for (int i : is) {
                System.out.print("["+i+"]");
            }
            System.out.println("");
        }
    
    }

}
