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
        MiClasePrueba mcpObjeto = new MiClasePrueba();
        mcpObjeto.imprimirMensaje();
        System.out.println(mcpObjeto.sNom);
        
        MiClasePrueba2.imprimirMensaje();
        MiClasePrueba2.sNom ="Sergio";
        System.out.println(MiClasePrueba2.sNom);
        
        
    }
    
}
class MiClasePrueba{
    public String sNom = "Sergio";
    public void imprimirMensaje(){
        System.out.println("Hola mundo!");
    }
}
class MiClasePrueba2{
    public static String sNom = "Sergio";
    public static void imprimirMensaje(){
        System.out.println("Hola mundo!!");
    }
}
