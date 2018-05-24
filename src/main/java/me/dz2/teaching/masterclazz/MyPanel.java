package me.dz2.teaching.masterclazz;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
public class MyPanel extends JPanel {

    int d = 30;
    Color bgColor = new Color(0, 0, 255);
    Color cicleColor = new Color(255, 0, 0);

    int x = 0;
    int y = 100;

    int speed = 1;


    @Override
    public void paint(Graphics canvas) {
        super.paint(canvas);

//        canvas.fillRect(100,50, 400,200);
        canvas.setColor(bgColor);
        canvas.fillRect(0, 0, getWidth(), getHeight());

        canvas.setColor(cicleColor);
        canvas.fillOval(x, y, d, d);

        x = x + speed;
        if (x > getWidth() - d) {
            speed = -1;
        }
        if (x < d && speed < 0) {
            speed = 1;
        }
        System.out.println("current x = " + x + " getWidth()=" + getWidth());
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
