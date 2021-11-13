/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xyzorganization;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ish
 */
public class ViewEmployeeProfile extends javax.swing.JFrame {

   
    public ViewEmployeeProfile() {
        initComponents();
        
        viewemployee();
    }
 Connection con;
    //Connection con;
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
     public ArrayList<viewall>viewlist()
     {
         ArrayList<viewall>viewlist=new ArrayList<>();
          try
        {
           
            getConnection();
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //con=DriverManager.getConnection("jdbc:odbc:MyDB","madhawa","1234");
            String query="select * from  Employee";
            //PreparedStatement stmt=con.prepareStatement("select  *  from Employee");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
           // ResultSet  rs=stmt.executeQuery(); 
            viewall viewall1;
            while(rs.next())
            {
                
                viewall1=new viewall(rs.getString("Employee_Id").trim(),rs.getString("EPF_Number").trim(),rs.getString("Frist_Name").trim(),rs.getString("Last_name").trim(),rs.getString("DOB").trim(),rs.getString("Adress").trim(),rs.getInt("Phone_Number"),rs.getString("NIC_Number").trim(),rs.getString("gender").trim(),rs.getString("Bankname").trim(),rs.getString("Account_Number").trim(),rs.getString("Jobtitle").trim(),rs.getString("Salary_Type").trim(),rs.getFloat("Basic_Salary"),rs.getString("addedDate").trim(),rs.getString("Email").trim(),rs.getString("DepartmentName").trim(),rs.getString("Department_id").trim());
               viewlist.add(viewall1);
            }
                // return emplist;

        }
         // return emplist;

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    return viewlist;
     }
    public void viewemployee()
{//getConnection();
  ArrayList<viewall> list=viewlist();
  DefaultTableModel model=(DefaultTableModel)tableview.getModel();
  Object[] row=new Object[18];
  for(int i=0;i<list.size();i++)
  {
      row[0]=list.get(i).getEmployee_Id();
      row[1]=list.get(i).getEPF_Number();
      row[2]=list.get(i).getFrist_Name();
      row[3]=list.get(i).getLast_name();
      row[4]=list.get(i).getDOB();
      row[5]=list.get(i).getAdress();
      row[6]=list.get(i).getPhone_Number();
      row[7]=list.get(i).getNIC_Number();
      row[8]=list.get(i).getgender();
      row[9]=list.get(i).getBankname();
      row[10]=list.get(i).getAccount_Number();
      row[11]=list.get(i).getJobtitle();
      row[12]=list.get(i).getSalary_Type();
      row[13]=list.get(i).getBasic_Salary();
      row[14]=list.get(i).getaddedDate();
      row[15]=list.get(i).getEmail();
      row[16]=list.get(i).getDepartmentName();
      row[17]=list.get(i).getDepartment_id();
      model.addRow(row);
      
  }
  
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableview = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        tableview.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "EPFNo", "FristName", "LastName", "DOB", "Adress", "Phone ", "NIC", "Gender", "Bank Name", "Account No", "Jobtitle", "Salary Type", "Basic Salary", "Reg.Date", "Email", "Dep.Name", "Dep.Id"
            }
        ));
        tableview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableviewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableview);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Employee");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Shutdown_25px.png"))); // NOI18N
        jButton1.setText("Log out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Back_To_25px_3.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ManageEmployee obj=new ManageEmployee();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loginform obj=new loginform();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableviewMouseClicked

    }//GEN-LAST:event_tableviewMouseClicked

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
            java.util.logging.Logger.getLogger(ViewEmployeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmployeeProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEmployeeProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableview;
    // End of variables declaration//GEN-END:variables
}
