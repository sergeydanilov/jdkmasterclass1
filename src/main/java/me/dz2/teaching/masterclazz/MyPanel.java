package me.dz2.teaching.masterclazz;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class MyPanel extends JPanel {

    int d = 30;
    Color bgColor = new Color(0,0,255);
    Color cicleColor = new Color(255,0,0);

    int x =0;
    int y = 100;

    int speed = 1;


    @Override
    protected void paintComponent(Graphics canvas) {
        super.paintComponent(canvas);

//        canvas.fillRect(100,50, 400,200);
        canvas.setColor(bgColor);
        canvas.fillRect(0, 0, getWidth(), getHeight());

        canvas.setColor(cicleColor);
        canvas.fillOval(x, y, d, d);

    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
