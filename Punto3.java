
package com.mycompany.taller;

import javax.swing.JOptionPane;
public class Punto3 {

    
    public static void main(String[] args) {
        int producto=0;
        
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite el primero valor"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor"));
        
        while((B!=0) && (A!=0)){
            producto = producto + A;
            B--;
        }
           JOptionPane.showMessageDialog(null,"El producto entre los dos numeros es: " +producto); 
    }
    
}
