/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xyzorganization;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class loginform extends javax.swing.JFrame {
Connection con;
  
    public loginform() {
        initComponents();
        getdata();
        currentDate();
    }
    //Connecting database
  public void getConnection()
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
  //get companiy details
public void getdata()
{
 getConnection();
        try
       {
       PreparedStatement stmt1=con.prepareStatement("Select * from xyzorganization");
        ResultSet  rs1=stmt1.executeQuery(); 
        while(rs1.next())
        {
         String regno=(rs1.getString(1).trim());
        lableregno.setText(regno);
        String Companyname=(rs1.getString(2).trim());
        lablecompanyName.setText(Companyname);
        int pn=(rs1.getInt(3));
        String phonenumber=Integer.toString(pn);
        lablepnnuber.setText(phonenumber);
        LableLocation.setText(rs1.getString(4).toString());
        lableemail.setText(rs1.getString(5).trim());
  
        }
       
        
       }
       catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, e, "Error getting Company details from database", JOptionPane.ERROR_MESSAGE);
            }


}
//Show system date and time
 public void currentDate()
{
  Calendar cal=new GregorianCalendar();
  int year=cal.get(Calendar.YEAR);
  int month=cal.get(Calendar.MONTH);
  int day=cal.get(Calendar.DAY_OF_MONTH);
  labeldate.setText(year+"-"+(month+1)+"-"+day);  
} 




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        ButtonLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lableregno = new javax.swing.JLabel();
        lablecompanyName = new javax.swing.JLabel();
        LableLocation = new javax.swing.JLabel();
        lableemail = new javax.swing.JLabel();
        lablepnnuber = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labeldate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        loginid = new javax.swing.JLabel();
        btnhelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Login Here");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("User Name:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Password:");

        ButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Lock_Landscape_25px_1.png"))); // NOI18N
        ButtonLogin.setText("Login");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Register Nuber:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Company Name:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Location:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Phone Number:");

        lableregno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lablecompanyName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lablecompanyName.setText(".");

        LableLocation.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LableLocation.setText(".");

        lableemail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lablepnnuber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lablepnnuber.setText(".");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Date:");

        labeldate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labeldate.setText(".");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Login ID:");

        loginid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginid.setText(".");

        btnhelp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Help_25px_3.png"))); // NOI18N
        btnhelp.setText("Help");
        btnhelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lableregno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnhelp)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(loginid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lablepnnuber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labeldate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LableLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lablecompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lableemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 194, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonLogin)
                        .addGap(324, 324, 324))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(191, 191, 191))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lableregno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lablecompanyName)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LableLocation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(lableemail, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lablepnnuber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labeldate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addComponent(ButtonLogin)
                .addGap(14, 14, 14)
                .addComponent(btnhelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(loginid))
                .addContainerGap())
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

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
       //Login button
        getConnection();
        String Usertype =null;
         
        if(txtUserid.getText().isEmpty()|| txtPassword.getText().isEmpty())
        {
   JOptionPane.showMessageDialog(null, "User Id or password can't be empty", "Error", JOptionPane.ERROR_MESSAGE);
        }
         
        else 
        {
      
            try
            {
  PreparedStatement stmt=con.prepareStatement("Select * from logininfo where FristName=? and UserPassword=?");
  stmt.setString(1,txtUserid.getText());
  stmt.setString(2,txtPassword.getText());
  
 
  ResultSet  rs=stmt.executeQuery(); 
  			
  if (rs.next())
           {
Usertype= rs.getString(4).trim();


if(Usertype.equals("Admin"))
{	
    AdminForm obj=new AdminForm();
    obj.show();
    this.dispose();
    try{
     getConnection();
     //Insertin login history
        PreparedStatement stat=con.prepareStatement("insert into loginhistory values(?,?,?,?)");
     stat.setString(1,loginid.getText());
     stat.setString(2,Usertype);
     stat.setString(3,txtUserid.getText());
     stat.setString(4,labeldate.getText());
     
     
     
     int row=stat.executeUpdate();
       if(row>0)
       {
           JOptionPane.showMessageDialog(null,"Login Sucessfully!");
       }
    
    }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,new String("Error  "+e));
          //JOptionPane.showMessageDialog(null,"Error encounterd while entering data in the database"+ex);
      }   
} 


  else if(Usertype.equals("HR Manager"))
  {
  ManageEmployee obj=new ManageEmployee();
    obj.show();
    this.dispose();   
    
     try{
     getConnection();
     
        PreparedStatement stat=con.prepareStatement("insert into loginhistory values(?,?,?,?)");
     stat.setString(1,loginid.getText());
     stat.setString(2,Usertype);
     stat.setString(3,txtUserid.getText());
     stat.setString(4,labeldate.getText());
     
     
     
     int row=stat.executeUpdate();
       if(row>0)
       {
           JOptionPane.showMessageDialog(null,"Login Sucessfully!");
       }
    
    }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,new String("Error  "+e));
          //JOptionPane.showMessageDialog(null,"Error encounterd while entering data in the database"+ex);
      }   
    
    
    
    
    
  }
else if(Usertype.equals("Accountant"))
  {
  SalaryMenu obj=new SalaryMenu();
    obj.show();
    this.dispose();  
    
     try{
     getConnection();
     
        PreparedStatement stat=con.prepareStatement("insert into loginhistory values(?,?,?,?)");
     stat.setString(1,loginid.getText());
     stat.setString(2,Usertype);
     stat.setString(3,txtUserid.getText());
     stat.setString(4,labeldate.getText());
     
     
     
     int row=stat.executeUpdate();
       if(row>0)
       {
           JOptionPane.showMessageDialog(null,"Login Sucessfully!");
       }
    
    }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,new String("Error  "+e));
          //JOptionPane.showMessageDialog(null,"Error encounterd while entering data in the database"+ex);
      }   
    
    
    
  }
           }
        else
        {
        JOptionPane.showMessageDialog(null, "Invalid user", "Error", JOptionPane.ERROR_MESSAGE);
        }
            }
            catch(Exception e)
            {
                 JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            }
           
      }
         
       
        
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      //Creating automatically loginid for login details table 
        try
       { //getConnection();
        PreparedStatement stmt1=con.prepareStatement("select loginid   from loginhistory");
        ResultSet  rs3=stmt1.executeQuery(); 	
 String logi=null;
        while (rs3.next())
           {
 logi= rs3.getString("loginid").trim() ;		
       }     
       String y =logi.substring(3);
      int  ID1  =Integer.parseInt(y);
      String IDS1=null;
      if(ID1>0 && ID1<9)
      {
       ID1=ID1+1;
       IDS1 ="LOG00"+ID1;   
      }
      else   if(ID1>=9 && ID1<99)
      {
       ID1=ID1+1;
        IDS1 ="LOG0"+ID1;
               }
       else   if(ID1>=99)
      {
       ID1=ID1+1;
        IDS1 ="loginid"+ID1;
               }
 loginid.setText(IDS1);   
       }
  catch(Exception e)
                  {      
     JOptionPane.showMessageDialog(null,"Error Genarating login ID "+e);
        	      }
          
                                    

    }//GEN-LAST:event_formWindowOpened

    private void btnhelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhelpActionPerformed
//help menu
        JOptionPane.showMessageDialog(null,"Help\nPlease contact admin for your login problems");
    }//GEN-LAST:event_btnhelpActionPerformed

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JLabel LableLocation;
    private javax.swing.JButton btnhelp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labeldate;
    private javax.swing.JLabel lablecompanyName;
    private javax.swing.JLabel lableemail;
    private javax.swing.JLabel lablepnnuber;
    private javax.swing.JLabel lableregno;
    private javax.swing.JLabel loginid;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserid;
    // End of variables declaration//GEN-END:variables
}
