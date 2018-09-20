/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class Modulos {
    
   public static int Calculo (int x, int y){ 
    x = Integer.parseInt(JOptionPane.showInputDialog("Divisor: "));
    y = Integer.parseInt(JOptionPane.showInputDialog("Dividende: "));
   
        if (x > y){
            JOptionPane.showMessageDialog(null, "El dividende debe ser mayor al divisor");
        }else if (x == y){
            return 1;
        }else {
            return Calculo(x-y, x-y)-y;
            
        }   
       return 0;
   }
}