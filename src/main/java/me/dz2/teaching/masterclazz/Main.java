package me.dz2.teaching.masterclazz;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import javax.swing.*;
import java.awt.*;

public class Main {

    MyPanel panel;
    int speed = 1;

    public static void main(String[] args) {
        System.out.println("hi");

        JFrame window = new JFrame();

        window.setSize(500, 768);
        window.setLocation(100,0);
        window.setVisible(true);

        window.setTitle("Hello world");

        MyPanel panel = new MyPanel();
//        window.add(panel);
        window.getContentPane().add(panel);
        //window.pack();



        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Thread background = new Thread(new BackgroundTask(0, 1, panel));
        //background.setDaemon(true);
//        background.start();


        BackgroundTask task = new BackgroundTask(0, 1, panel);

        new Thread(task).start();

//        EventQueue.invokeLater(task);

    }
}
