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
