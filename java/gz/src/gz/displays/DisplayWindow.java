package gz.displays;

//import gz.controllers.GraphicsController;
import gz.controllers.TaskController;
//import gz.displays.DisplayGraphics;

import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import javax.swing.*;

public class DisplayWindow{
    //component declarations
    String [][] tasks = {{"Do Laundry","tomorrow","urgent"},
                          {"Finish Swing Project","End of Week","urgent"}};
    String [] tags = {"Tasks","Due Date","Priority"};
    JPanel panelA = new JPanel();
    JPanel panelB = new JPanel();
    JFrame frame =new JFrame();
    //Font butFont = new Font("serif", Font.BOLD,13);
    JButton addItem = new JButton("Add Task");
    //JButton moveGraphic = new JButton("Move Graphic");
    JTable jt = new JTable(tasks,tags);
    //DisplayGraphics graphics = new DisplayGraphics();
    public DisplayWindow() {
        addItem.addActionListener(new TaskController());
      //  moveGraphic.addActionListener(new GraphicsController(graphics));
        panelB.add(addItem);
        //panelB.add(moveGraphic);
        panelA.add(panelB);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // adds components like button to layout
        frame.getContentPane().add(BorderLayout.CENTER,new JScrollPane(jt));
        frame.getContentPane().add(BorderLayout.SOUTH, panelA);

        frame.setSize(500, 300);
        //set center
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //graphics.movePaint();
    }

}
