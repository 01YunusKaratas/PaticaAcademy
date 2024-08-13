package com.patikadev.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.patikadev.model.*;
import com.patikadev.helper.*;
import com.patikadev.model.User;

public class login  extends JFrame {
    private JPanel wrapper;
    private JPanel wrapper_top;
    private JPanel wrapper_bottom;
    private JTextField login_name;
    private JButton btn_login;
    private JPasswordField fld_lgn_password;


    public login(){

        add(wrapper);
        setTitle("LOGIN");
        setVisible(true);//görünmesi için
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//proclick and close wimdows
        setSize(500,500);
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width)/2;//horizontal
        int y =(Toolkit.getDefaultToolkit().getScreenSize().height- getSize().height)/2; //vertical
        setResizable(false);//boyut küçültme ve büyütme işlemini engelliyor
        setLocation(x,y);
        btn_login.setFont(new Font("Arial Black", Font.BOLD, 14));

        btn_login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn_login.setFont(new Font("Arial Black", Font.BOLD, 14));
                if (fld_lgn_password.getText().length() ==0 || login_name.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please enter the value !!!");

                }else{
                    User user1 =User.getFetch(login_name.getText(),fld_lgn_password.getText());
                    if(user1 == null){
                        JOptionPane.showMessageDialog(null,"User not found","LOGIN",JOptionPane.INFORMATION_MESSAGE);

                    }else{
                        switch (user1.getUser_type()){
                            case("educator"):
                                educator edGUI = new educator();
                                break;
                            case("student"):
                                student stGUI = new student();
                                break;
                            case ("operator"):
                                OperatorGUI opGUI = new OperatorGUI((Operator) user1 );//operator veri tipindek olcak
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Please enter the valid bit!!");
                                break;
                        }

                        dispose();//kapatıyoruz
                    }

                }
            }
        });
    }


    public static void main(String[] args) {
        help.setLayout();
        login login1 = new login();

    }
}
