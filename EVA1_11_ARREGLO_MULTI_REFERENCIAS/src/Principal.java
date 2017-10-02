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
        //Big O(2N^3)
        int aiArray3D[][][] = new int[10][2][7];
        
        //System.out.println(aiArray3D.length);
        //System.out.println(aiArray3D[0].length);
        //System.out.println(aiArray3D[0][0].length);
        
        for (int i = 0; i < aiArray3D.length; i++) {
            for (int j = 0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    aiArray3D[i][j][k] = (int)(Math.random() * 100) + 1;
                }
            }
        }
        //IMPRIMIR
        for (int i = 0; i < aiArray3D.length; i++) {
            for (int j = 0; j < aiArray3D[i].length; j++) {
                for (int k = 0; k < aiArray3D[i][j].length; k++) {
                    System.out.println(aiArray3D[i][j][k]);
                }
            }
        }
    }
    
}
