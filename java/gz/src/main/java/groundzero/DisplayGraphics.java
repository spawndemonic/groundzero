package gz;

import java.awt.*;

public class DisplayGraphics extends Canvas {
    public DisplayGraphics(){
        setSize(100,150);
        setBackground(Color.BLACK);
    }
    public void paint(Graphics g){
    g.setColor(Color.BLUE);
    g.drawOval(130,130,50,60);
    g.fillOval(130,130,50,60);
    }

}
