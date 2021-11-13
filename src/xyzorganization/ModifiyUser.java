/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xyzorganization;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ish
 */
public class ModifiyUser extends javax.swing.JFrame {

    /**
     * Creates new form ModifiyUser
     */
    public ModifiyUser() {
        initComponents();
        show_User();
    }
    Connection con;
 void getConnection()
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con=DriverManager.getConnection("jdbc:odbc:MyDB","madhawa","1234");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error connecting to the database:"+ex);
        }
    }
    public ArrayList<User>Userlist()
    {
     ArrayList<User> Userlist= new ArrayList<>();
    try
    {
        getConnection();
        
         String query="select * from  logininfo";
         Statement st=con.createStatement();
         ResultSet rs=st.executeQuery(query);
         User user1;
         while(rs.next())
         {
          user1=new User(rs.getString("UserID").trim(),rs.getString("FristName").trim(),rs.getString("LastName").trim(),rs.getString("UserType").trim(),rs.getString("Email").trim(),rs.getString("UserPassword").trim(),rs.getString("gender").trim(),rs.getString("Adress").trim(),rs.getInt("Phone_Number"),rs.getString("Registerdate").trim()) ;  
          Userlist.add(user1) ;
          
         }
        
    }
    catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    return Userlist;
    }
    public void show_User()
    {
    ArrayList<User> list=Userlist();
    DefaultTableModel model=(DefaultTableModel)tableupdateuser.getModel();
  Object[] row=new Object[10];
  for(int i=0;i<list.size();i++)
  {
      row[0]=list.get(i).getUserID();
      row[1]=list.get(i).getFristName();
      row[2]=list.get(i).getLastName();
      row[3]=list.get(i).getUserType();
      row[4]=list.get(i).getEmail();
      row[5]=list.get(i).getUserPassword();
      row[6]=list.get(i).getgender();
      row[7]=list.get(i).getAdress();
      row[8]=list.get(i).getPhone_Number();
      row[9]=list.get(i).getRegisterdate();
      model.addRow(row);
      jButton2.setEnabled(false);
  }   
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableupdateuser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtUserid = new javax.swing.JTextField();
        l = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        radiobtnfemale = new javax.swing.JRadioButton();
        radiobtnmale = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpaneadress = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        txtPhoneNuber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtRegisterDate = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbUserType = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtConfirmPassword1 = new javax.swing.JPasswordField();
        btndelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lablevalidation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Modifiy User");

        tableupdateuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " User ID  ", "Frist Name", "Last Name", "User Type", "Email", "UserPassword", "Gender", "Address", "Phone Number", "Registerdate"
            }
        ));
        tableupdateuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableupdateuserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableupdateuser);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("User ID:");

        l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l.setText("Frist Name:");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Last Name:");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("User Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("User Password:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Confirm Password:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Gender:");

        radiobtnfemale.setBackground(new java.awt.Color(0, 153, 51));
        buttonGroup1.add(radiobtnfemale);
        radiobtnfemale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radiobtnfemale.setText("Fe Male");
        radiobtnfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtnfemaleActionPerformed(evt);
            }
        });

        radiobtnmale.setBackground(new java.awt.Color(0, 153, 51));
        buttonGroup1.add(radiobtnmale);
        radiobtnmale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radiobtnmale.setText("Male");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Address:");

        jScrollPane2.setViewportView(txtpaneadress);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Phone Number:");

        txtPhoneNuber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNuberKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Register Date:");

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Update_25px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Clear_Formatting_25px.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Back_To_25px_3.png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("User Type:");

        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "HR Manager", "Accountant" }));
        cmbUserType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbUserTypeMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Confirm Password:");

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Delete_Database_25px.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Gmail_25px_4.png"))); // NOI18N
        jButton2.setText("Send");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lablevalidation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lablevalidation.setForeground(new java.awt.Color(255, 51, 51));
        lablevalidation.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(l)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail)
                                            .addComponent(txtUserid)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtConfirmPassword1, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(64, 64, 64))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radiobtnmale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radiobtnfemale)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtPhoneNuber)
                            .addComponent(txtRegisterDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lablevalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(496, 496, 496)
                    .addComponent(jLabel6)
                    .addContainerGap(497, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtConfirmPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtPhoneNuber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lablevalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(radiobtnmale)
                                    .addComponent(radiobtnfemale))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnClear)
                                .addGap(9, 9, 9)
                                .addComponent(btndelete)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(254, 254, 254)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(285, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void radiobtnfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtnfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiobtnfemaleActionPerformed

    private void tableupdateuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableupdateuserMouseClicked
         int i = tableupdateuser.getSelectedRow();
        TableModel model=tableupdateuser.getModel();
         txtUserid.setText(model.getValueAt(i,0).toString());
         txtUserid.setEnabled(false);
         txtUserName.setText(model.getValueAt(i,1).toString());
         txtLastName.setText(model.getValueAt(i,2).toString());
         String utype=model.getValueAt(i,3).toString();
        switch(utype)
        {
            case "Admin":
                cmbUserType.setSelectedIndex(0);
                        break;
            
            case "HR Manager":
               cmbUserType.setSelectedIndex(1);
                        break;
             case "Accountant":
               cmbUserType.setSelectedIndex(1);
                        break;    
              
        }
        txtEmail.setText(model.getValueAt(i,4).toString());
        txtPassword.setText(model.getValueAt(i,5).toString());
        txtConfirmPassword1.setText(model.getValueAt(i,5).toString());
         String gen=model.getValueAt(i, 6).toString();
        if(gen.equals("Male"))
       {
          radiobtnmale.setSelected(true);
       }
        else
       {
          radiobtnfemale.setSelected(true);
       }
        txtpaneadress.setText(model.getValueAt(i,7).toString());
        txtPhoneNuber.setText(model.getValueAt(i,8).toString());
        txtRegisterDate.setText(model.getValueAt(i,9).toString());
    }//GEN-LAST:event_tableupdateuserMouseClicked

    private void cmbUserTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUserTypeMouseClicked

    }//GEN-LAST:event_cmbUserTypeMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
         try
        {
            getConnection();
            PreparedStatement stat=con.prepareStatement("delete from logininfo  where UserID=?");
            stat.setString(1,txtUserid.getText());
            int rows=stat.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)tableupdateuser.getModel();
            model.setRowCount(0);
            show_User();
            if(rows>0)
            {
                JOptionPane.showMessageDialog(null,"deleted....");
            }
             txtUserid.setText("");
      txtUserName.setText("");
      txtLastName.setText("");
      txtEmail.setText("");
      txtPassword.setText("");
      txtConfirmPassword1.setText("");
     txtpaneadress.setText("");
     txtPhoneNuber.setText("");
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error delete data! "+ex);                
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        
        
          boolean valid=true;
          if(txtPassword.getText().length()<5)
       {
           JOptionPane.showMessageDialog(null,"Password need to be minimum 5 caractors","Error",JOptionPane.ERROR_MESSAGE);
           valid=false;
       }
           else if(!txtPassword.getText().equals(txtConfirmPassword1.getText()))
               {
                   JOptionPane.showMessageDialog(null,"Password cannot be match","Error",JOptionPane.ERROR_MESSAGE);
                   valid=false;
               }  
            
    if(valid){
        try
        {
         getConnection();
            
          String sql="update logininfo set FristName=?,LastName=?,UserType=?,Email=?,UserPassword=?,gender=?,Adress=?,Phone_Number=?,Registerdate=? where UserID=?";
          PreparedStatement stat=con.prepareStatement(sql);
            stat.setString(1,txtUserName.getText());  
            stat.setString(2,txtLastName.getText());
             String usertype=cmbUserType.getSelectedItem().toString();
            stat.setString(3,usertype);
            stat.setString(4,txtEmail.getText()); 
           
            stat.setString(5,txtConfirmPassword1.getText()); 
           
            String gender=null;
             if(radiobtnmale.isSelected())
             {
              gender="Male";
             }
             if(radiobtnfemale.isSelected())
               {
                gender="Female";
               }
             stat.setString(6,gender);
             stat.setString(7,txtpaneadress.getText());
             stat.setInt(8,Integer.parseInt(txtPhoneNuber.getText()));
             stat.setString(9,txtRegisterDate.getText());
             stat.setString(10,txtUserid.getText());
             stat.executeUpdate();
             DefaultTableModel model=(DefaultTableModel)tableupdateuser.getModel();
            model.setRowCount(0);
            show_User();
            JOptionPane.showMessageDialog(this,"Update Sucessfull");
             
        }
        catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,new String("Error  "+e));
          //JOptionPane.showMessageDialog(null,"Error encounterd while entering data in the database"+ex);
      }
         jButton2.setEnabled(true);
    }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      txtUserid.setText("");
      txtUserName.setText("");
      txtLastName.setText("");
      txtEmail.setText("");
      txtPassword.setText("");
      txtConfirmPassword1.setText("");
     txtpaneadress.setText("");
     txtPhoneNuber.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
         AdminForm obj=new  AdminForm();
         obj.show();
         this.dispose();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*String Subject="Your Details Updated";
        String to=txtEmail.getText().toString();
        String body=txtUserName.getText().toString();
        String body1=txtConfirmPassword1.getText().toString();
        try{
            final String fromEmail = "ishanmadhawa44@gmail.com";
            final String password = "ishpvi928280";
            final String toEmail = to;

            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
            props.put("mail.smtp.port", "587"); //TLS Port
            props.put("mail.smtp.auth", "true"); //enable authentication
            props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

            //create Authenticator object to pass in Session.getInstance argument
            Authenticator auth = new Authenticator() {
                //override the getPasswordAuthentication method
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            };
            Session session = Session.getInstance(props, auth);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(Subject);
            message.setText(body,body1);
            Transport.send(message);
            JOptionPane.showMessageDialog(null,"Mail Send");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Mail fail! Check Your Connection!"+ex);
            //JOptionPane.showMessageDialog(null,ex);
        }*/
            String T=txtUserid.getText();
       String Subject="YUR DETILS UPDATED !!!!!!Your user Name also your frist name and password";
       try{
       getConnection();
        PreparedStatement stmt=con.prepareStatement("select Fristname,Email,UserPassword from logininfo where UserID='"+T+"' ");
       ResultSet  rs=stmt.executeQuery(); 
       String name=null,mail=null,password1=null;
         while (rs.next())
         {
         name= rs.getString("Fristname").trim() ;
         //nam1= rs.getString("LastName").trim() ;
         mail=rs.getString("Email").trim() ;
         password1=rs.getString("UserPassword").trim() ;
          
       //txtLastName.setText(password1);
       String to=mail;
       //String body=name;
      // String body1=txtLastName.getText().toString();
         try{
            final String fromEmail = "@gmail.com"; 
            final String password = ""; 
            final String toEmail = to; 

            
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
            props.put("mail.smtp.port", "587"); //TLS Port
            props.put("mail.smtp.auth", "true"); //enable authentication
            props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS

                //create Authenticator object to pass in Session.getInstance argument
            Authenticator auth = new Authenticator() {
                //override the getPasswordAuthentication method
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            };
            Session session = Session.getInstance(props, auth);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(Subject);
            //message.setText(mail);
           message.setText(password1);
            Transport.send(message);
            JOptionPane.showMessageDialog(null,"Mail Send");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Mail fail! Check Your Connection!"+ex);
           //JOptionPane.showMessageDialog(null,ex);
        } 
         }
       }
       catch(Exception e)
               {
                  JOptionPane.showMessageDialog(null,"Error getting Details"+e);
               }
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPhoneNuberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNuberKeyTyped
        // TODO add your handling code here:
        try{
         int i=Integer.parseInt(txtPhoneNuber.getText());
          
     lablevalidation.setText("");
      }
      catch(NumberFormatException e){
          lablevalidation.setText("Invalid");
      }
    }//GEN-LAST:event_txtPhoneNuberKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifiyUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifiyUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifiyUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifiyUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifiyUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btndelete;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbUserType;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l;
    private javax.swing.JLabel lablevalidation;
    private javax.swing.JRadioButton radiobtnfemale;
    private javax.swing.JRadioButton radiobtnmale;
    private javax.swing.JTable tableupdateuser;
    private javax.swing.JPasswordField txtConfirmPassword1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNuber;
    private javax.swing.JTextField txtRegisterDate;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtUserid;
    private javax.swing.JTextPane txtpaneadress;
    // End of variables declaration//GEN-END:variables
}
