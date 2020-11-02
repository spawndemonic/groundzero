package gz.controllers;

import gz.displays.DisplayGraphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicsController implements ActionListener {
    DisplayGraphics g;
    public GraphicsController(DisplayGraphics graphic){
        g = graphic;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        g.movePaint();
    }
}
