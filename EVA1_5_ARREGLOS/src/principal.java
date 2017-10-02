
/**
 *
 * @authoer Sergio varela 16550457
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Big O(2N)
        int aiMisNume[] = new int[10];
        for(int i=0; i<10; i++){
            aiMisNume[i]= (int)(Math.random()*10)+1;
        }
        //for each
        for(int x : aiMisNume){//int x; for(int i =0; 
            System.out.print("x= "+ x+" ");
        }
        System.out.println("");
        //Multiples arreglos
        int[] aiArreglo1, aiArreglo2, aiArreglo3;
        aiArreglo1 = new int[3];
        aiArreglo2 = new int[10];
        aiArreglo3 = new int[100];
        
        //Arreglo y variables
        int aiArre[], iVar, iVar2;
        aiArre = new int[10];
        iVar = 10;
        iVar= 30;
        
    }
    
    
}
