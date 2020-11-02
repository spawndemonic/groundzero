package gz.displays;
import javax.swing.*;
import java.awt.*;

public class DisplayGraphics extends JPanel {
    int x=60,y=60;
    public void movePaint(){
        for(int i = 0; i<130;i++){
            this.x++;
            this.y++;
            this.repaint();
            try{
                Thread.sleep(100);
            } catch (Exception ex){}
        }
    }
    public void paintComponent(Graphics g){
    g.setColor(Color.WHITE);
    g.fillRect(0,0,this.getWidth(),this.getHeight());
    g.setColor(Color.BLUE);
    g.fillOval(x,y,40,40);
    }
}
