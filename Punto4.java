
package com.mycompany.taller;

import javax.swing.JOptionPane;
public class Punto4 {

    
    public static void main(String[] args) {
        
        int N = Integer.parseInt(JOptionPane.showInputDialog("Digite el primero valor"));
        int M = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la potencia"));
        int Contador = N;
        int Solucion=0;
        
        for(int i= 1; i<=M; i++){
            int Q = 0;
            for(int z = 1; z<=Contador; z++){
                Q = Q + N;
            }
            Solucion = N;
            N = Q;
        
        }
    
        JOptionPane.showMessageDialog(null,"La solucion de la potencia es: " + Solucion);
    
    
    }
    
}
