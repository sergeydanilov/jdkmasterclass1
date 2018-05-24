package me.dz2.teaching.masterclazz;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import javax.swing.*;
import java.awt.*;

public class Main {

    static JPanel panel;
    int speed = 1;

    public static void main(String[] args) {
        System.out.println("hi");

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
//                runGUI();
                runGUISimple();

                runAnimation();
            }
        });


    }

    private static void runGUI() {
        JFrame window = new JFrame();

        window.setSize(500, 768);
        window.setLocation(100,0);
        window.setVisible(true);

        window.setTitle("Hello world");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new MyPanel();
        window.setContentPane(panel);
    }

    private static void runGUISimple() {
        JFrame window = new JFrame();

        window.setSize(500, 768);
        window.setLocation(100,0);
        window.setVisible(true);

        window.setTitle("Hello world");

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        window.setContentPane(panel);
    }

    private static void runAnimation() {
        BackgroundTask task = new BackgroundTask(0, 1, panel);

        new Thread(task).start();
    }
}
