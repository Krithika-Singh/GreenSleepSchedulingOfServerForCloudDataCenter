/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
import java.awt.*;  
import java.awt.event.*;  
public class CloseFrame extends WindowAdapter{  
    Frame f;  
    CloseFrame(Frame jf){  
        f=jf;  
        f.addWindowListener(this);  
          
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }  
public void windowClosing(WindowEvent e) {  
    f.dispose();  
}  
}  