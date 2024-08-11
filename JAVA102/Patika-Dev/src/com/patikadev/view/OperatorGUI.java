package com.patikadev.view;

import com.patikadev.model.Operator;
import com.patikadev.model.User;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OperatorGUI  extends JFrame {


    private JPanel wrapper;
    private JTabbedPane tabbedPane1;
    private JLabel lbl_welcome;
    private JButton btn_exit;
    private JTable tbl_userlist;
    private JScrollPane scrool_userlist;
    private JTextField add_name;
    private JPanel addname;
    private JLabel addusername;
    private JTextField add_username;
    private JPasswordField addpassword;
    private JComboBox comboBox1;
    private JButton saveButton;
    private JButton deleteButton;
    private JTextField fld_del;
    private JLabel del_userıd;
    private JTextField searchname;
    private JTextField searchusername;
    private JPanel panel;
    private JComboBox search_combobox;
    private JButton searchButton;
    private  final Operator operator;
    // alt tarafta olanlar modelleme için kullanılıyor
    private DefaultTableModel mdl_userlist;
    private Object[] row_userlist;


    public OperatorGUI(Operator operator){
        this.operator = operator;
        add(wrapper);
        setSize(800,500);
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
        row_userlist = new Object[col_user.length];
        loadUserModel();
        //tablo modelleri
        tbl_userlist.setModel(mdl_userlist);
        tbl_userlist.getTableHeader().setReorderingAllowed(false);// kaymasını önler yerlerinin
        //Update method for Databases



        tbl_userlist.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    // Güncellenen satırdaki değerleri al
                    int id = Integer.parseInt(tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(), 0).toString());
                    String name = tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(), 1).toString();
                    String userName = tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(), 2).toString();
                    String password = tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(), 3).toString();
                    String userType = tbl_userlist.getValueAt(tbl_userlist.getSelectedRow(), 4).toString();

                    // Kullanıcıyı güncelle
                    if (User.update(id, name, userName, password, userType)) {
                        // Güncelleme başarılı ise tabloyu temizle ve yeniden doldur


                        JOptionPane.showMessageDialog(null, "Update is successful", "UPDATE", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error", "UPDATE", JOptionPane.INFORMATION_MESSAGE);
                    }
                    loadUserModel();
                }
            }
        });


        loadUserModel();



        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(add_name.getText().length() == 0 || add_username.getText().length() == 0 || addpassword.getText().length() == 0){
                    JOptionPane.showMessageDialog(null,"Please enter the check value !!!");
                }else{
                    String name = add_name.getText();
                    String user_name = add_username.getText();
                    String password = addpassword.getText();
                    String user_type = comboBox1.getSelectedItem().toString();
                    if(User.add(name,user_name,password,user_type)){

                        //2 row provides to clear for all table
                        DefaultTableModel clearModel = (DefaultTableModel) tbl_userlist.getModel();
                        clearModel.setRowCount(0);
                       loadUserModel();
                        JOptionPane.showMessageDialog(null,"Succesfull");
                        //Added and Panel will be empty
                        add_name.setText(null);
                        add_username.setText(null);
                        addpassword.setText(null);
                        comboBox1.setSelectedItem("student");



                    }else{



                    }




                }
            }
        });
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int response = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to exit?",
                        "Confirm Exit",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0); // Program closed
                }

            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fld_del.getText().length() == 0){
                    JOptionPane.showMessageDialog(null,"Please enter the correct value!!!!!");
                }else{
                    try{
                        int ıd = Integer.parseInt(fld_del.getText());

                       boolean isdelete =  User.delete(ıd);
                       loadUserModel();
                        if(isdelete){
                            JOptionPane.showMessageDialog(null,"Delete is succesfull","DELETE STATUS",JOptionPane.INFORMATION_MESSAGE);
                            fld_del.getText();// clear and empty textfield

                        }else{
                            JOptionPane.showMessageDialog(null,"There is not ID in database","DELETE STATUS",JOptionPane.INFORMATION_MESSAGE);

                        }

                    }catch (Exception E){
                        System.out.println(E.getMessage());

                    }
                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name= searchname.getText();
                String user_name = searchusername.getText();
                String user_Type =search_combobox.getSelectedItem().toString();//getıtem method o yüzden tostirng ile sonucu alcaz
                String  query =User.searchQuery(name,user_name,user_Type); // automaticlyy searching
                ArrayList<User> searching = User.searchUser(query);
                loadUserModel(searching);
            }
        });
    }

    public void loadUserModel(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userlist.getModel();
        clearModel.setRowCount(0);

        for(User obj : User.getUserList()){
            //burda yeni bir satır oluşturuduk
            // tüm elemanları kontrol ettik tekrardan

            row_userlist[0] =obj.getId();
            row_userlist[2]= obj.getUser_name();
            row_userlist[1]=obj.getName();
            row_userlist[3]=obj.getPassword();
            row_userlist[4]=obj.getUser_type();
            mdl_userlist.addRow(row_userlist); //oluşturuduğumuz mdoelin içine ekledik.





        }

    }

    //Overloading method
    public void loadUserModel(ArrayList<User> list){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_userlist.getModel();
        clearModel.setRowCount(0);

        for(User obj : list){
            //burda yeni bir satır oluşturuduk
            // tüm elemanları kontrol ettik tekrardan

            row_userlist[0] =obj.getId();
            row_userlist[2]= obj.getUser_name();
            row_userlist[1]=obj.getName();
            row_userlist[3]=obj.getPassword();
            row_userlist[4]=obj.getUser_type();
            mdl_userlist.addRow(row_userlist); //oluşturuduğumuz mdoelin içine ekledik.





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
