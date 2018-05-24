package me.dz2.teaching.masterclazz;

import javax.swing.*;
import java.awt.*;

/**
 *
 */
class MyPanel extends JPanel {

    int d = 30;
    Color bgColor = new Color(0, 0, 255);
    Color cicleColor = new Color(255, 0, 0);

    int x = 0;
    int y = 100;

    int speed = 1;


    @Override
    public void paint(Graphics canvas) {
        super.paint(canvas);

        canvas.setColor(bgColor);
        canvas.fillRect(0, 0, getWidth(), getHeight());

        canvas.setColor(cicleColor);
        canvas.fillOval(x, y, d, d);

        x = x + speed;
        if (x > getWidth() - d) {
            speed = -1;
        }
        if (x < 0 && speed < 0) {
            speed = 1;
        }
        String name = Thread.currentThread().getName();
        System.out.println("name: " + name + " current x = " + x + " getWidth()=" + getWidth());
    }

}
