/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

import javax.swing.JOptionPane;
import static semana2.Fibonacci.num;


public class Semana2 {
  
    public static void main(String[] args) {
        
        int input = Integer.parseInt(JOptionPane.showInputDialog("Fibonacci: "));
        Fibonacci a = new Fibonacci();
        JOptionPane.showMessageDialog(null, "El Fibonacci de " + input + " es " + num(input));
       
    }       
}
