package com.patikadev.view;

import javax.swing.*;
import java.awt.*;

public class student  extends JFrame {
    private JPanel wrapper;
    private JPanel wrapper_top;
    private JPanel wrapper_bottom;



    public student(){
        add(wrapper);
        add(wrapper);
        setTitle("Student");
        setVisible(true);//görünmesi için
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//proclick and close wimdows
        setSize(500,500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width)/2;//horizontal
        int y =(Toolkit.getDefaultToolkit().getScreenSize().height- getSize().height)/2; //vertical
        setResizable(false);//boyut küçültme ve büyütme işlemini engelliyor
        setLocation(x,y);
    }


    public static void main(String[] args) {
        student student1 = new student();

    }
}
