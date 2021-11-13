/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xyzorganization;

import com.sun.corba.se.spi.orbutil.fsm.Guard;
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


/**
 *
 * @author ish
 */
public class AddNewUser extends javax.swing.JFrame {

    /**
     * Creates new form AddNewUser
     */
    public AddNewUser() {
        initComponents();
        currentDate();
    }
Connection con;
//Data base connection
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
     
    //get Current Date
    public void currentDate()
{
  Calendar cal=new GregorianCalendar();
  int year=cal.get(Calendar.YEAR);
  int month=cal.get(Calendar.MONTH);
  int day=cal.get(Calendar.DAY_OF_MONTH);
  txtRegisterDate.setText(year+"-"+(month+1)+"-"+day);  
  jButton2.setEnabled(false);
} 
      
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserid = new javax.swing.JTextField();
        l = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbUserType = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        radiobtnmale = new javax.swing.JRadioButton();
        radiobtnfemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpaneadress = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        txtPhoneNuber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtRegisterDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lablevalidation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New User");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("User ID:");

        txtUserid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUseridActionPerformed(evt);
            }
        });

        l.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        l.setText("Frist Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("User Type:");

        cmbUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "HR Manager", "Accountant" }));
        cmbUserType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbUserTypeMouseClicked(evt);
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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Gender:");

        radiobtnmale.setBackground(new java.awt.Color(0, 153, 51));
        buttonGroup1.add(radiobtnmale);
        radiobtnmale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radiobtnmale.setText("Male");

        radiobtnfemale.setBackground(new java.awt.Color(0, 153, 51));
        buttonGroup1.add(radiobtnfemale);
        radiobtnfemale.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radiobtnfemale.setText("Fe Male");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Last Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Address:");

        jScrollPane1.setViewportView(txtpaneadress);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Phone Number:");

        txtPhoneNuber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNuberActionPerformed(evt);
            }
        });
        txtPhoneNuber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNuberKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNuberKeyTyped(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Save_25px.png"))); // NOI18N
        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Clear_Formatting_25px.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Back_To_25px_3.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Register Date:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Refresh_25px.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(l)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUserid)
                                    .addComponent(txtUserName)
                                    .addComponent(txtLastName)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(radiobtnmale)
                                    .addComponent(txtConfirmPassword)
                                    .addComponent(txtPassword)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(txtPhoneNuber)
                                    .addComponent(txtRegisterDate))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnclear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lablevalidation)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(136, 136, 136)
                        .addComponent(radiobtnfemale)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cmbUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtnmale)
                    .addComponent(radiobtnfemale)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhoneNuber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lablevalidation)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtRegisterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnclear)
                            .addComponent(btnBack)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(16, 16, 16))
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
 // Automatically genarating loginid
        getConnection();
          try
       { //getConnection();
        PreparedStatement stmt1=con.prepareStatement("select  UserID  from logininfo");
        ResultSet  rs3=stmt1.executeQuery(); 	
 String EPFN=null;
        while (rs3.next())
           {
 EPFN= rs3.getString("UserID").trim() ;		
       }     
       String y =EPFN.substring(3);
      int  ID1  =Integer.parseInt(y);
      String IDS1=null;
      if(ID1>0 && ID1<9)
      {
       ID1=ID1+1;
       IDS1 ="USE00"+ID1;   
      }
      else   if(ID1>=9 && ID1<99)
      {
       ID1=ID1+1;
        IDS1 ="USE0"+ID1;
               }
       else   if(ID1>=99)
      {
       ID1=ID1+1;
        IDS1 ="USE"+ID1;
               }
  txtUserid.setText(IDS1);   
       }
  catch(Exception e)
                  {      
     JOptionPane.showMessageDialog(null,"Error generting EPF Number "+e);
        	      }     
        
       
    }//GEN-LAST:event_formWindowOpened

    private void cmbUserTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUserTypeMouseClicked

    }//GEN-LAST:event_cmbUserTypeMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
     //Save button    
        boolean valid=true;
if(txtUserid.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"User Name can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
          
   if(txtUserName.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"User Name can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
    if(txtLastName.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"Last  Name can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
   if(txtEmail.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"Email can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
   if(txtPassword.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"password can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
    
    else if(txtPassword.getText().length()<5)
       {
           JOptionPane.showMessageDialog(null,"Password need to be minimum 5 caractors","Error",JOptionPane.ERROR_MESSAGE);
           valid=false;
       }
    if(txtConfirmPassword.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"Confirm password can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
    else if(!txtPassword.getText().equals(txtConfirmPassword.getText()))
               {
                   JOptionPane.showMessageDialog(null,"Password cannot be match","Error",JOptionPane.ERROR_MESSAGE);
                   valid=false;
               }   
       if(txtpaneadress.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"Address can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }    
        if(txtPhoneNuber.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"Phone number can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }   
        if(txtRegisterDate.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"Register date can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }  
           
          
   
    
    if(valid){
        try{
          getConnection();
            
          PreparedStatement stat=con.prepareStatement("insert into logininfo values(?,?,?,?,?,?,?,?,?,?)");
          
           stat.setString(1,txtUserid.getText());
           stat.setString(2,txtUserName.getText());
           stat.setString(3,txtLastName.getText());
           String usertype=cmbUserType.getSelectedItem().toString();
           stat.setString(4,usertype);
           stat.setString(5,txtEmail.getText());
           stat.setString(6,txtConfirmPassword.getText());
           String gender=null;
           if(radiobtnmale.isSelected())
           {
           gender="Male";
           }
           if(radiobtnfemale.isSelected())
           {
           gender="Female";
           }
          stat.setString(7,gender);
          stat.setString(8,txtpaneadress.getText());  
          stat.setInt(9, Integer.parseInt(txtPhoneNuber.getText()));
          stat.setString(10,txtRegisterDate.getText());  
          
          int row=stat.executeUpdate();
       if(row>0)
       {
           JOptionPane.showMessageDialog(null,"User registerd");
       }
          
          
        }
        
       catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,new String("Error  "+e));
          //JOptionPane.showMessageDialog(null,"Error encounterd while entering data in the database"+ex);
      }   
        
    } 
        jButton2.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
      txtUserName.setText("");
      txtLastName.setText("");
      txtEmail.setText("");
      txtPassword.setText("");
      txtConfirmPassword.setText("");
     txtpaneadress.setText("");
     txtPhoneNuber.setText("");
        
     //txtRegisterDate.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        formWindowOpened(null);
      txtUserName.setText("");
      txtLastName.setText("");
      txtEmail.setText("");
      txtPassword.setText("");
      txtConfirmPassword.setText("");
     txtpaneadress.setText("");
     txtPhoneNuber.setText("");
     currentDate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       //Sending Email
       String T=txtUserid.getText();
       String Subject="Your user Name also your frist name and password";
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
            final String fromEmail = "ishanmadhawa44@gmail.com"; //Final Mening is non acess modifire
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      AdminForm obj=new  AdminForm();
         obj.show();
         this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtUseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUseridActionPerformed

    private void txtPhoneNuberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNuberActionPerformed
      
       
    }//GEN-LAST:event_txtPhoneNuberActionPerformed

    private void txtPhoneNuberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNuberKeyTyped
        // TODO add your handling code here:
        //Phone number validation
        try{
         int i=Integer.parseInt(txtPhoneNuber.getText());
          
     lablevalidation.setText("");
      }
      catch(NumberFormatException e){
          lablevalidation.setText("Invalid");
      }
        
        
    }//GEN-LAST:event_txtPhoneNuberKeyTyped

    private void txtPhoneNuberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNuberKeyPressed
      
    }//GEN-LAST:event_txtPhoneNuberKeyPressed

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
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnclear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbUserType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l;
    private javax.swing.JLabel lablevalidation;
    private javax.swing.JRadioButton radiobtnfemale;
    private javax.swing.JRadioButton radiobtnmale;
    private javax.swing.JPasswordField txtConfirmPassword;
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
