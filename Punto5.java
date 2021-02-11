
package com.mycompany.taller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Punto5 {

    
    public static void main(String[] args) {
       ArrayList<String> Ejemplo = new ArrayList<>();
       int A = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero para calcular su Factorial"));
       int Factorial=1;
       
       String EjemploEjemplificado = "1";
       for(int i=2; i<=A; i++){
           Factorial = Factorial*i;
       }
       for(int i = 1;i<=A; i++){
           Ejemplo.add("" + i);
       }
       for(int i=1; i<A; i++){
           EjemploEjemplificado+= "x" + Ejemplo.get(i);
       }
            JOptionPane.showMessageDialog(null,"El Factorial de "+A+ " ! = "+EjemploEjemplificado+ "= " +Factorial);
 
    }
    
}
