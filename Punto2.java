
package com.mycompany.taller;

import javax.swing.JOptionPane;
public class Punto2 {

   
    public static void main(String[] args) {
       String palabra = JOptionPane.showInputDialog(null,"ingrese la palabra"); 
       
       JOptionPane.showMessageDialog(null,"¿La palabra es palindromo? : " + esPalindromo(palabra)); 
        
    
    }
    public static String esPalindromo(String palabra){
        palabra = palabra.toLowerCase();
        
        for (int i=0 , j = palabra.length() - 1; i <= j; i++,j--){
            if(palabra.charAt(i) !=palabra.charAt(j)){
                return "No es palindromo";
            }
        }
        return "Si es palindromo";
    }
    
}
