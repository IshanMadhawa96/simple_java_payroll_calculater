/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xyzorganization;
import javax.swing.*;
import java.sql.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


 public class AddNewEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddNewEmployee
     */
     Connection con;
    public AddNewEmployee() {
        initComponents();
         currentDate();
    }
    //data base Connection

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
 //Display System Date in textFiled 
public void currentDate()
{
  Calendar cal=new GregorianCalendar();
  int year=cal.get(Calendar.YEAR);
  int month=cal.get(Calendar.MONTH);
  int day=cal.get(Calendar.DAY_OF_MONTH);
  txtdate.setText(year+"-"+(month+1)+"-"+day);  
}
          
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEPFNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFristname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNicNumber = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        CMBDepartment = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cmbSalaryType = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbJobtitle = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtBasicSalary = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lablebsalary = new javax.swing.JLabel();
        lablevalidationpn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New Employee");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Employee ID:");

        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("EPF Number:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Frist Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Last Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("DOB:");

        txtDOB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDOBKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Address:");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Phone Number:");

        txtPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberActionPerformed(evt);
            }
        });
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("NIC Number:");

        txtNicNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicNumberActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Gender:");

        rbMale.setBackground(new java.awt.Color(102, 255, 204));
        buttonGroup1.add(rbMale);
        rbMale.setSelected(true);
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        rbfemale.setBackground(new java.awt.Color(0, 255, 153));
        buttonGroup1.add(rbfemale);
        rbfemale.setText("Female");
        rbfemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbfemaleActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Department:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Bank Name:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("AccountNumber:");

        txtAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNumberActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Salary Type:");

        cmbSalaryType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eitherfixed", "Monthly", "Hourly" }));
        cmbSalaryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSalaryTypeActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("BasicSalary:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Job title:");

        cmbJobtitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Assistant", "Executive", " " }));
        cmbJobtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJobtitleActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Save_25px.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Clear_Formatting_25px.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Back_To_25px_1.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtBasicSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBasicSalaryKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Date");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Refresh_25px.png"))); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lablebsalary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lablebsalary.setForeground(new java.awt.Color(255, 0, 0));
        lablebsalary.setText(".");

        lablevalidationpn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lablevalidationpn.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBack))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbSalaryType, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFristname, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbMale)
                                        .addGap(32, 32, 32)
                                        .addComponent(rbfemale))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtNicNumber)
                            .addComponent(txtEPFNumber)
                            .addComponent(txtLastName)
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtBankName)
                            .addComponent(cmbJobtitle, 0, 303, Short.MAX_VALUE)
                            .addComponent(txtBasicSalary)
                            .addComponent(CMBDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lablebsalary)
                            .addComponent(lablevalidationpn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEPFNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFristname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(lablevalidationpn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNicNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbJobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(lablebsalary))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CMBDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSave)
                            .addComponent(btnClear)
                            .addComponent(btnBack)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbfemale)
                                    .addComponent(rbMale))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbSalaryType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
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

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIdActionPerformed

    private void cmbJobtitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJobtitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJobtitleActionPerformed
         public String getDepartment_id()
{
    String DepartmentId="";
String DepartmentName=CMBDepartment.getSelectedItem().toString().trim();
  try
   {
            getConnection();
        PreparedStatement stat2=con.prepareStatement
("select Department_id from Department where Department_Name=?");
		stat2.setString(1,DepartmentName);	
		ResultSet  rs=stat2.executeQuery(); 			
  while (rs.next())
           {
DepartmentId=rs.getString( "Department_id").trim() ;		
           }
   }
    catch(Exception e)
                  {      
     JOptionPane.showMessageDialog(null,"Error getting the Departmet Id "+e);
        	      }
  return DepartmentId;
}
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
     //getConnection();
        boolean valid=true;

   if(txtEmployeeId.getText().isEmpty())
    {
    JOptionPane.showMessageDialog(null,"Name can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
 if(txtEPFNumber.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"EPF Number can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
 if(txtFristname.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Frist Name can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
  if(txtLastName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Last Name can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
  if(txtDOB.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"DOB can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
  if(txtAddress.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Adress can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
   if(txtPhoneNumber.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Phone Number can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
    if(txtNicNumber.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"NIC Number can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
    if(txtBankName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Bank Name can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
    if(txtAccountNumber.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Account Number can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
    if(txtBasicSalary.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Basic Salary  can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
  
            
    if(txtEmail.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Email Adress can't be Empty","Error!",JOptionPane.ERROR_MESSAGE);
            valid=false;
        }
    
    if(valid)  {
         
         try{
             getConnection();
             Statement stmt3=con.createStatement();
            String mail=txtEmail.getText();
            String SQL="select Email from Employee where Email='"+mail+"' ";
            ResultSet rs=stmt3.executeQuery(SQL); 
              if(rs.next())
            {
              JOptionPane.showMessageDialog(null,"Email Adress is Alreday exits","Error!",JOptionPane.ERROR_MESSAGE); 
            }
              else
              {
                try{
       getConnection();
       PreparedStatement stat2=con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
       
       stat2.setString(1,txtEmployeeId.getText());
       stat2.setString(2,txtEPFNumber.getText());
       stat2.setString(3,txtFristname.getText());
       stat2.setString(4,txtLastName.getText());
       stat2.setString(5,txtDOB.getText());
       stat2.setString(6,txtAddress.getText());
       stat2.setInt(7, Integer.parseInt(txtPhoneNumber.getText()));
       stat2.setString(8,txtNicNumber.getText());
       String gender=null,Jobtitle=null,Salarytype=null;
       if(rbMale.isSelected())
       {
           gender="Male";
       }
       if(rbfemale.isSelected())
       {
           gender="Female";
       }
       stat2.setString(9,gender);
       stat2.setString(10,txtBankName.getText());
       stat2.setString(11,txtAccountNumber.getText());
        Jobtitle=cmbJobtitle.getSelectedItem().toString();
       stat2.setString(12,Jobtitle);
      Salarytype=cmbSalaryType.getSelectedItem().toString();
        stat2.setString(13,Salarytype);
       stat2.setFloat(14,Float.parseFloat(txtBasicSalary.getText()));
       stat2.setString(15,txtdate.getText());
       stat2.setString(16,txtEmail.getText());
       String depName=CMBDepartment.getSelectedItem().toString();
       
       stat2.setString(17,depName);
       
        stat2.setString(18,getDepartment_id()); 
       int row=stat2.executeUpdate();
       if(row>0)
       {
           JOptionPane.showMessageDialog(null,"Employee delatils has been registerd");
       }
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null,new String("Error  "+e));
          //JOptionPane.showMessageDialog(null,"Error encounterd while entering data in the database"+ex);
      }  
                  
                  
                  
              }
             
         }
         catch(Exception e)    
         {
             JOptionPane.showMessageDialog(null,new String("Error finding duplicate values! "+e));
         }
         
 
     }
        
   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cmbSalaryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSalaryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSalaryTypeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     getConnection();
             try
       { //getConnection();
        PreparedStatement stmt=con.prepareStatement("select  Employee_Id  from Employee");
        ResultSet  rs=stmt.executeQuery(); 	
 String EID=null;
        while (rs.next())
           {
 EID= rs.getString("Employee_Id").trim() ;		
       }     
       String x =EID.substring(1);
      int  ID  =Integer.parseInt(x);
      String IDS=null;
      if(ID>0 && ID<9)
      {
       ID=ID+1;
       IDS ="E00"+ID;   
      }
      else   if(ID>=9 && ID<99)
      {
       ID=ID+1;
        IDS ="E0"+ID;
               }
       else   if(ID>=99)
      {
       ID=ID+1;
        IDS ="E"+ID;
               }
  txtEmployeeId.setText(IDS);   
       }
  catch(Exception e)
                  {      
     JOptionPane.showMessageDialog(null,"Error generting Employee ID "+e);
        	      }
        try
         {
             
             PreparedStatement stat2=con.prepareStatement("Select Department_Name  from Department");
             ResultSet rs1=stat2.executeQuery();
             String DepName1[]=new String[100];
             int index=0;
             while(rs1.next())
             {
                DepName1[index] =rs1.getString("Department_Name");
                index++;
             }
             CMBDepartment.setModel(new DefaultComboBoxModel(DepName1));
         }
          catch (Exception ex)
                 {
                 JOptionPane.showMessageDialog(null,"Error genarating DepartmentName"+ex);
                 }
       
        
        
        
          try
       { //getConnection();
        PreparedStatement stmt1=con.prepareStatement("select  EPF_Number  from Employee");
        ResultSet  rs3=stmt1.executeQuery(); 	
 String EPFN=null;
        while (rs3.next())
           {
 EPFN= rs3.getString("EPF_Number").trim() ;		
       }     
       String y =EPFN.substring(3);
      int  ID1  =Integer.parseInt(y);
      String IDS1=null;
      if(ID1>0 && ID1<9)
      {
       ID1=ID1+1;
       IDS1 ="EPF00"+ID1;   
      }
      else   if(ID1>=9 && ID1<99)
      {
       ID1=ID1+1;
        IDS1 ="FPF0"+ID1;
               }
       else   if(ID1>=99)
      {
       ID1=ID1+1;
        IDS1 ="FPF"+ID1;
               }
  txtEPFNumber.setText(IDS1);   
       }
  catch(Exception e)
                  {      
     JOptionPane.showMessageDialog(null,"Error generting EPF Number "+e);
        	      }
          
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManageEmployee   obj=new  ManageEmployee();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNicNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicNumberActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
         //txtEmployeeId.setText("");
        //txtEPFNumber.setText("");
        txtFristname.setText("");
        txtLastName.setText("");
        txtDOB.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtNicNumber.setText("");
        txtBankName.setText("");
        txtAccountNumber.setText("");
        txtBasicSalary.setText("");
      txtEmail.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        formWindowOpened(null);
        txtFristname.setText("");
        txtLastName.setText("");
        txtDOB.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtNicNumber.setText("");
        txtBankName.setText("");
        txtAccountNumber.setText("");
        txtBasicSalary.setText("");
        txtEmail.setText("");
        currentDate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDOBKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDOBKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBKeyReleased

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
        // TODO add your handling code here:
        
        
        
        try{
         int i=Integer.parseInt(txtPhoneNumber.getText());
          
     lablevalidationpn.setText("");
      }
      catch(NumberFormatException e){
          lablevalidationpn.setText("Invalid");
      }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void txtBasicSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBasicSalaryKeyTyped
        try{
         int i=Integer.parseInt(txtBasicSalary.getText());
          
     lablebsalary.setText("");
      }
      catch(NumberFormatException e){
          lablebsalary.setText("Invalid");
      }
    }//GEN-LAST:event_txtBasicSalaryKeyTyped

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void rbfemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbfemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbfemaleActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CMBDepartment;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbJobtitle;
    private javax.swing.JComboBox cmbSalaryType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel lablebsalary;
    private javax.swing.JLabel lablevalidationpn;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtBasicSalary;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEPFNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtFristname;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNicNumber;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtdate;
    // End of variables declaration//GEN-END:variables
}
