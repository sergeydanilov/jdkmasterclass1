package me.dz2.teaching.masterclazz;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;

import javax.swing.*;

public class Main {

    MyPanel panel;

    class Background implements Runnable {

        int i = 0;

        @Override
        public void run() {
            while (i< 1000) {
//                panel.set
                i++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("hi");

        JFrame window = new JFrame();

        window.setSize(1024, 768);
        window.setLocation(0,0);
        window.setVisible(true);

        window.setTitle("Hello world");

        MyPanel panel = new MyPanel();
        window.add(panel);



        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
