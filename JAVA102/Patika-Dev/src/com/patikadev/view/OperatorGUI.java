package com.patikadev.view;

import com.patikadev.helper.ıtem;
import com.patikadev.model.Operator;
import com.patikadev.model.User;
import com.patikadev.model.course;
import com.patikadev.model.patika;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class OperatorGUI  extends JFrame {


    private final JPopupMenu popupMenu;
    private final JMenuItem deleteMenuItem;
    private JPanel wrapper;
    private JTabbedPane panel_patika;
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
    private JPanel scroll_patika;
    private JTable tbl_patika;
    private JTextField fld_add_patika;
    private JButton save_patika;
    private JLabel patika_add_lbl;
    private JTextField fld_delete_patika;
    private JButton btn_delete_patika;
    private JPanel panel_course;
    private JScrollPane scrool_course;
    private JTable crs_table;
    private JPanel pnl_course_right;
    private JTextField fld_add_course;
    private JTextField textField1;
    private JComboBox cmb_patika;
    private JComboBox cmb_instructor;
    private JButton btn_save_course;
    private JTextField fld_delete_course;
    private JButton dlt_btn_course;
    private  final Operator operator;
    // alt tarafta olanlar modelleme için kullanılıyor
    private DefaultTableModel mdl_userlist;
    private Object[] row_userlist;
    private  DefaultTableModel mdl_patika;
    private  Object[] row_patikalist;
    private  DefaultTableModel mdl_course;
    private Object[] row_courselist;



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
                    laodComboInstructor();
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
                       laodComboInstructor();
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

        //PATIKA BÖLÜMÜ
        mdl_patika = new DefaultTableModel();
        Object[] col_patika = {"ID","Name"};
        mdl_patika.setColumnIdentifiers(col_patika);
        row_patikalist = new Object[col_patika.length];
        loadPatikaModel();

        // bu iki kodu yapmazsan o alanda görünmez
        tbl_patika.setModel(mdl_patika);
        tbl_patika.getColumnModel().getColumn(0).setMaxWidth(100);
        tbl_patika.getTableHeader().setReorderingAllowed(false);// kaymasını önler yerlerinin
        //patika Update
        tbl_patika.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if(e.getType() == TableModelEvent.UPDATE){
                    String name = tbl_patika.getValueAt(tbl_patika.getSelectedRow(), 1).toString();
                    int id = Integer.parseInt(tbl_patika.getValueAt(tbl_patika.getSelectedRow(),0).toString());

                    if(patika.updatePatika(id, name)){
                        JOptionPane.showMessageDialog(null,"Update is succesfull","Update",JOptionPane.INFORMATION_MESSAGE);

                    }else{
                        JOptionPane.showMessageDialog(null,"Update is not succesfull");
                    }
                }
                //loadPatikaModel();// diyerek sürekli tabloyu güncellemiş olcaz.
                loadComboPatika();


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
                    dispose();
                    login lgn = new login();
                }

            }
        });

        //Course section
        mdl_course = new DefaultTableModel();
        Object [] courselist = {"ID","USER_ID","PATIKA_ID","NAME","LANGUAGE"};
        mdl_course.setColumnIdentifiers(courselist);
        row_courselist = new Object[courselist.length];
        loadCourse();

        crs_table.setModel(mdl_course);
        crs_table.getColumnModel().getColumn(0).setMaxWidth(100);
        crs_table.getTableHeader().setReorderingAllowed(false);// kaymasını önler yerlerinin

        loadComboPatika();// bu bize listedeki elemanları göstericek
        laodComboInstructor();//ınstructorlar yani userları döndericek
        loadEducatorCombo();











        // Popup Menu for patika deletion
        popupMenu = new JPopupMenu();
        deleteMenuItem = new JMenuItem("delete");
        popupMenu.add(deleteMenuItem);

        // Listener for the popup menu
        tbl_patika.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showPopup(e);
                }
            }

            private void showPopup(MouseEvent e) {
                int row = tbl_patika.rowAtPoint(e.getPoint());
                if (row >= 0 && row < tbl_patika.getRowCount()) {
                    tbl_patika.setRowSelectionInterval(row, row);
                } else {
                    tbl_patika.clearSelection();
                }

                int rowIndex = tbl_patika.getSelectedRow();
                if (rowIndex >= 0) {
                    deleteMenuItem.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            int id = (int) tbl_patika.getValueAt(rowIndex, 0);
                            if (patika.deletePatika(id)) {
                                JOptionPane.showMessageDialog(null, "Delete is successful", "Delete", JOptionPane.INFORMATION_MESSAGE);
                                loadPatikaModel();
                            } else {
                                JOptionPane.showMessageDialog(null, "Delete is not successful", "Delete", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    });
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
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
                       laodComboInstructor();
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

        //for patika section
        save_patika.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fld_add_patika.getText().length() ==0){
                    JOptionPane.showMessageDialog(null,"Please enter the patika name !!!","AddPatika",JOptionPane.INFORMATION_MESSAGE);
                }else {
                    String name =fld_add_patika.getText();
                    if(patika.addPatika(name)){
                        loadPatikaModel();
                        loadComboPatika();
                        JOptionPane.showMessageDialog(null,"Registration successful");
                        fld_add_patika.setText(null);//clearing and empty area.

                    }else{

                    }

                }

            }
        });
        btn_delete_patika.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ID'nin boş olup olmadığını kontrol et
                if (fld_delete_patika.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    return; // Boş ID girişi varsa metodu bitir
                }

                // Silme işlemi için onay al
                int response = JOptionPane.showConfirmDialog(null,
                        "Are you sure you want to delete?",
                        "Confirm Delete",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                    try {
                        int id = Integer.parseInt(fld_delete_patika.getText().trim());

                        // ID'nin veritabanında mevcut olup olmadığını kontrol et
                        boolean deleted = patika.deletePatika(id);

                        if (deleted) {
                            loadPatikaModel(); // Tabloyu güncelle
                            loadComboPatika();
                            JOptionPane.showMessageDialog(null, "Delete was successful.", "Delete", JOptionPane.INFORMATION_MESSAGE);

                        } else {
                            JOptionPane.showMessageDialog(null, "ID not found in the database.", "Delete Failed", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid ID format. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
                    }

                    fld_delete_patika.setText(null); // TextField'ı temizle

                }
            }
        });


        btn_save_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fld_add_course.getText().length() ==0 ||textField1.getText().length() == 0){
                    JOptionPane.showMessageDialog(null,"Please enter the value!!!!");

                }else{
                    String name = fld_add_course.getText();
                    String language = textField1.getText();
                    ıtem combo = (ıtem) cmb_patika.getSelectedItem();
                    ıtem ınstructor = (ıtem) cmb_instructor.getSelectedItem();
                    if(course.add(combo.getKey(),ınstructor.getKey(),name,language)){
                        JOptionPane.showMessageDialog(null,"Save was succesfull","Save",JOptionPane.INFORMATION_MESSAGE);
                        loadCourse();
                    }else {
                        JOptionPane.showMessageDialog(null,"Error");

                    }


                }
            }
        });
        dlt_btn_course.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(fld_delete_course.getText().length() ==0){
                    JOptionPane.showMessageDialog(null,"Please enter the ID!!!");
                }else{
                    int id = Integer.parseInt(fld_delete_course.getText());
                    boolean delete = course.delete(id);
                    int response = JOptionPane.showConfirmDialog(null,
                            "Are you sure you want to exit?",
                            "Confirm Exit",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE);

                    if (response == JOptionPane.YES_OPTION) {
                        if(delete){
                            loadCourse();
                            JOptionPane.showMessageDialog(null,"Delete was succesfull","Delete",JOptionPane.INFORMATION_MESSAGE);


                        }
                    }

                }
            }
        });
    }
    public void loadPatikaModel(){
        DefaultTableModel clearModel = (DefaultTableModel) tbl_patika.getModel();
        clearModel.setRowCount(0); // always clearing and empty row


        for(patika obj : patika.getList()){

            row_patikalist[0] =obj.getId();
            row_patikalist[1]=obj.getName();
            mdl_patika.addRow(row_patikalist);


        }




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
    //Course tablosundaki verileri GUİ yükler daima
    public  void loadCourse(){//static yaparsak sınıftan ayrı takılır çağıramayız
        DefaultTableModel clearModel = (DefaultTableModel) crs_table.getModel();
        clearModel.setRowCount(0);// provides clearing and empty area

        for(course crs : course.getListCourse()){
           row_courselist[0] = crs.getId();
           row_courselist[1] =crs.getUser_id();
           row_courselist[2]=crs.getPatika_id();
           row_courselist[3] = crs.getName();
           row_courselist[4]=crs.getLanguage();
           mdl_course.addRow(row_courselist);

        }
    }
    public void loadComboPatika(){
        cmb_patika.removeAllItems();//all value deleted
        for(patika ptk : patika.getList()){
            cmb_patika.addItem(new ıtem(ptk.getId(), ptk.getName()));

        }

    }
    public  void laodComboInstructor(){
        cmb_instructor.removeAllItems();
        for(User obj : User.getUserList()){
            if(obj.getUser_type().equals("educator")){
                cmb_instructor.addItem(new ıtem(obj.getId(),obj.getName()));
            }

        }

    }
    public void loadEducatorCombo(){
        cmb_instructor.removeAllItems();
        for(User user:User.getListOnltEdu()){
            cmb_instructor.addItem(new ıtem(user.getId(),user.getName()));

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
