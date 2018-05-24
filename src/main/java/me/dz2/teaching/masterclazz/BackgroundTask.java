package me.dz2.teaching.masterclazz;

import javax.swing.*;

/**
 *
 */
public class BackgroundTask implements Runnable {

    int i = 0;
    int x = 0;
    int speed;
    JPanel panel;

    public BackgroundTask(int x, int speed, JPanel panel) {
        this.x = x;
        this.speed = speed;
        this.panel = panel;
    }

    @Override
    public void run() {
        if (panel instanceof MyPanel) {
            while (true) {
                try {
                    Thread.sleep(100);
                    panel.invalidate();
                    panel.repaint();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        }
    }
}
