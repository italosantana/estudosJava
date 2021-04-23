/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploolamundo;

/**
 *
 * @author Italo
 */
public class LocaisGlobais {
 static int variavel=10;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.out.println(variavel);
        if(variavel==10){
            int variavel=30;
            System.out.println(variavel);
        }
        System.out.println(variavel);
    }
}
