package me.dz2.teaching.masterclazz.animatedpane;

import javax.swing.*;
import java.awt.*;

class BouncingBalls extends JFrame
{
    JPanel panel;
    public static void main(String[] args)
    {
        BouncingBalls bounce = new BouncingBalls();
        bounce.makeGui();
    }
    public void makeGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(400,400);

        Ball ball1 = new Ball();
        Ball ball2 = new Ball();
        ball1.add(ball2);
        getContentPane().add(ball1);
        setVisible(true);
        new Thread(ball1).start();
        new Thread(ball2).start();
    }
}
class Ball extends JPanel implements Runnable
{
    int x;
    int y;
    String name;
    public Ball()
    {
        setOpaque(false);
        setPreferredSize(new Dimension(400,400));
    }
    public void run()
    {
        x = (int) (Math.random() * 300);
        y = (int) (Math.random() * 300);

        name = Thread.currentThread().getName();

        for (int i = 0; i < 200; i++) {
            x++;
            y++;
            System.out.println(name);
            repaint();

            try {
                Thread.sleep(50);
            } catch (Exception ex) {}
        }
    }
    public void paintComponent(Graphics g)
    {
        System.out.println(name+" "+x+" "+y);
        g.setColor(Color.white);
        //g.fillRect(0,0,this.getWidth(),this.getHeight());//see next line
        super.paintComponent(g);
        g.setColor(Color.orange);
        g.fillOval(x,y,50,50);
    }
}