package me.dz2.teaching.masterclazz;

/**
 *
 */
public class BackgroundTask implements Runnable {

    int i = 0;
    int x = 0;
    int speed;
    MyPanel panel;

    public BackgroundTask(int x, int speed, MyPanel panel) {
        this.x = x;
        this.speed = speed;
        this.panel = panel;
    }

    @Override
    public void run() {
        while (i < 1000) {
            x = x + speed;
            panel.setX(x);

            panel.invalidate();
            panel.repaint();

            i++;
        }
    }
}
