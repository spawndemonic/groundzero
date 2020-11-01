package groundzero;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class DisplayWindow implements ActionListener{
    //component declarations
    JPanel panelA = new JPanel();
    JPanel panelB = new JPanel();
    JFrame frame =new JFrame();
    Font butFont = new Font("serif", Font.BOLD,13);
    JButton addItem = new JButton("Add Task");
    public DisplayWindow(){

        panelB.add(addItem);
        panelA.add(panelB);
        // adds components like button to layout
        frame.getContentPane().add(BorderLayout.SOUTH,panelA);
        //set the size and make it visible
        frame.setSize(500,300);
        //set center
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent event){

    }
    
}
