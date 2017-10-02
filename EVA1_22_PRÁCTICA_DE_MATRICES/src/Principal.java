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
        // big oh (2N^2)
        //hacer matriz identidad
        int matriz[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(i==j){
                    matriz[i][j]= 1;
                }
                else{
                    matriz[i][j]= 0;
                }
            }
        }
        //imprimir matriz
        for (int[] x : matriz) {
            for (int i : x) {
               System.out.print("["+i+"]");
            }
            System.out.println("");
        }
    }
}
