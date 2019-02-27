/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatura;

/**
 *
 * @author Usuario DAM 1
 */
public class Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int C;
        int F;
        
        for(C = 0; C <=300 ; C = C+20){
            F = ( C * 9/5) * + 32;
            System.out.println(C+ "\t" +F);
        }
    }
    
}
