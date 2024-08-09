package com.patikadev.view;

import com.patikadev.model.Operator;
import com.patikadev.model.User;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class OperatorGUI  extends JFrame {


    private JPanel wrapper;
    private JTabbedPane tabbedPane1;
    private JLabel lbl_welcome;
    private JButton btn_exit;
    private JTable tbl_userlist;
    private JScrollPane scrool_userlist;
    private  final Operator operator;
    // alt tarafta olanlar modelleme için kullanılıyor
    private DefaultTableModel mdl_userlist;
    private Object[] row_userlist;


    public OperatorGUI(Operator operator){
        this.operator = operator;
        add(wrapper);
        setSize(600,350);
        setTitle("Operator");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // closed for GUI
        setVisible(true);//always start GUI
        //horizontal midpoint and vertical midpoint
        int x = (Toolkit.getDefaultToolkit().getScreenSize().width -getSize().width )/2;
        int y = (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height)/2;
        setLocation(x,y);

        lbl_welcome.setText("Welcome : " +operator.getName());

        
        mdl_userlist = new DefaultTableModel();
        Object[] col_user = {"ID","NAME","USERNAME","PASSWORD","USERTYPE"};
        mdl_userlist.setColumnIdentifiers(col_user);

        //tablo modelleri
        tbl_userlist.setModel(mdl_userlist);
        tbl_userlist.getTableHeader().setReorderingAllowed(false);// kaymasını önler yerlerinin

        for(User obj : User.getUserList()){
            Object[] row = new Object[col_user.length];//burda yeni bir satır oluşturuduk

            row[0] =obj.getId();
            row[2]= obj.getUser_name();
            row[1]=obj.getName();
            row[3]=obj.getPassword();
            row[4]=obj.getUser_type();

            mdl_userlist.addRow(row); //oluşturuduğumuz mdoelin içine ekledik.

        }

    }




    public static void main(String[] args) {
        Operator op = new Operator();
        op.setId(1);
        op.setName("yunus emre");
        op.setUser_name("emre2000");
        op.setPassword("yunus1234");
        op.setUser_type("student");

        OperatorGUI operatorGUI = new OperatorGUI(op);


    }
}
