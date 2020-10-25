package gz;

import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.*;


public class App {
    public static void main(String[]args){
        JFrame frame =new JFrame();
        JButton button = new JButton("fuckoff");
        // adds components like button to layout
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        //set the size and make it visible
        frame.setSize(300,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }

}
