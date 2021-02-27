//ALAN DANIEL SEVILLA HERNANDEZ
//2022525
package gui;

import java.awt.Color;
import javax.swing.JFrame;

public class Main {
    
    public static void main (String[] args){
        
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setTitle("Cesba Ventana");
        
        frame.setResizable(true);
        
        //FORMATO DEFAULT
        //frame.getContentPane().setBackground(Color.CYAN);
        
        //FORMATO RGB
       // frame.getContentPane().setBackground(new Color(28, 26, 198));
        
        //FORMATO HEXADECIMAL
        frame.getContentPane().setBackground(new Color(0x1AC3C6));
        
        
    } 
            
            
}
