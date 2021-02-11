
package com.mycompany.taller;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class Punto1 {

   
    public static void main(String[] args) {
        ArrayList<Integer> Num = new ArrayList<Integer>();
        boolean inicio = false; 
        while(!inicio){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un numero, si quiere terminar escriba 000 para salir"));
            switch (opcion){
                case 000:
                    inicio=true;
                    break;
                default:
                    Num.add(opcion);
                    break;
            }
        }
        
        
            JOptionPane.showMessageDialog(null,"El numero maximo es: "+ Collections.max(Num));
    }
    
}
