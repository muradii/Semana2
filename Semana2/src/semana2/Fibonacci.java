package semana2;

import javax.swing.JOptionPane;

public class Fibonacci {
    
    public static int num (int i){
        
        if (i<=1) return i;
        
        else {
            return num(i-1) + num(i-2);
        }
    }      
}
