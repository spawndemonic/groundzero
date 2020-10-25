package gz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;


public class App implements ActionListener {
    //component declarations
    JPanel panelA = new JPanel();
    JPanel panelB = new JPanel();
    JFrame frame =new JFrame();
    Font butFont = new Font("serif", Font.BOLD,13);
    JButton button = new JButton("fuckoff");
    JButton button2 = new JButton("seriously");
    JButton button3 = new JButton("fine whatever");
    DisplayGraphics graphics = new DisplayGraphics();
    App(){
        button.setFont(butFont);
        button3.addActionListener(this);
        panelB.add(button);
        panelB.add(button2);
        panelB.add(button3);
        panelA.add(panelB);
        // adds components like button to layout
        frame.getContentPane().add(BorderLayout.SOUTH,panelA);
        frame.add(BorderLayout.CENTER,graphics);
        //set the size and make it visible
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
        button3.setText("Trolled");
    }
    public static void main(String[]args){
        App test = new App();

    }
}
