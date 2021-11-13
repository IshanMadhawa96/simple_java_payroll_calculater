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


import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ish
 */
public class UpdateEmployee extends javax.swing.JFrame {

    /**
     * Creates new form UpdateEmployee
     */
    public UpdateEmployee() {
        initComponents();
        //getConnection();
        show_employee();
        
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
public ArrayList<Employee>emplist()
{
     ArrayList<Employee> emplist= new ArrayList<>();
      //Connection con;
   
     try
        {
           
            getConnection();
           // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //con=DriverManager.getConnection("jdbc:odbc:MyDB","madhawa","1234");
            String query1="select * from  Employee";
            //PreparedStatement stmt=con.prepareStatement("select  *  from Employee");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query1);
           // ResultSet  rs=stmt.executeQuery(); 
            Employee employee1;
            while(rs.next())
            {
                
                employee1=new Employee(rs.getString("Employee_Id").trim(),rs.getString("EPF_Number").trim(),rs.getString("Frist_Name").trim(),rs.getString("Last_name").trim(),rs.getString("DOB").trim(),rs.getString("Adress").trim(),rs.getInt("Phone_Number"),rs.getString("NIC_Number").trim(),rs.getString("gender").trim(),rs.getString("Bankname").trim(),rs.getString("Account_Number").trim(),rs.getString("Jobtitle").trim(),rs.getString("Salary_Type").trim(),rs.getFloat("Basic_Salary"),rs.getString("addedDate").trim(),rs.getString("Email").trim(),rs.getString("DepartmentName").trim(),rs.getString("Department_id").trim());
               emplist.add(employee1);
            }
                // return emplist;

        }
         // return emplist;

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    return emplist;
}
public void show_employee()
{//getConnection();
  ArrayList<Employee> list=emplist();
  DefaultTableModel model=(DefaultTableModel)tableupdate.getModel();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableupdate = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtFristname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtNicNumber = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cmbJobtitle = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        txtBasicSalary = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbdepartment = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        cmbSalaryType = new javax.swing.JComboBox();
        txtEPFNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmployeeid = new javax.swing.JTextField();
        lablepnvalid = new javax.swing.JLabel();
        lablebsaicsalarvalid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Employee Details");

        tableupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tableupdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "EPFNo", "FristName", "LastName", "DOB", "Adress", "Phone ", "NIC", "Gender", "Bank Name", "Account No", "Jobtitle", "Salary Type", "Basic Salary", "Reg.Date", "Email", "Dep.Name", "Dep.Id"
            }
        ));
        tableupdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableupdateMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableupdate);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Frist Name:");

        txtFristname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFristnameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Last Name:");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("DOB:");

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Address:");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("NIC Number:");

        txtNicNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNicNumberActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Bank Name:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Job title:");

        cmbJobtitle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manager", "Assistant", "Executive", " " }));
        cmbJobtitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbJobtitleActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("BasicSalary:");

        txtBasicSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBasicSalaryActionPerformed(evt);
            }
        });
        txtBasicSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBasicSalaryKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Gender:");

        rbMale.setBackground(new java.awt.Color(0, 153, 51));
        buttonGroup1.add(rbMale);
        rbMale.setSelected(true);
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        rbfemale.setBackground(new java.awt.Color(0, 153, 51));
        buttonGroup1.add(rbfemale);
        rbfemale.setText("Female");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Account No:");

        txtAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNumberActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Salary Type:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Date");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Department:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Update_User_25px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Clear_Symbol_25px.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Back_To_25px_1.png"))); // NOI18N
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        cmbSalaryType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Eitherfixed", "Monthly", "Hourly" }));
        cmbSalaryType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSalaryTypeActionPerformed(evt);
            }
        });

        txtEPFNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEPFNumberActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("EPF Number:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Employee Id:");

        lablepnvalid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lablepnvalid.setForeground(new java.awt.Color(255, 0, 0));
        lablepnvalid.setText(".");

        lablebsaicsalarvalid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lablebsaicsalarvalid.setForeground(new java.awt.Color(255, 0, 0));
        lablebsaicsalarvalid.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(183, 183, 183))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFristname, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(jLabel17))
                                            .addGap(22, 22, 22))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel14)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbMale)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbfemale))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                                        .addComponent(txtAccountNumber, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(cmbSalaryType, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmployeeid)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lablepnvalid, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                            .addComponent(lablebsaicsalarvalid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel9))
                                        .addGap(13, 13, 13)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPhoneNumber))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBasicSalary, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtEmail)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cmbdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cmbJobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtBankName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNicNumber)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(41, 41, 41)
                                .addComponent(txtLastName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(txtEPFNumber)))))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEPFNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmployeeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFristname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rbMale)
                            .addComponent(rbfemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lablepnvalid))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNicNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cmbJobtitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(lablebsaicsalarvalid)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmbdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(cmbSalaryType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnback)
                            .addComponent(btnclear)
                            .addComponent(btnUpdate))
                        .addGap(21, 21, 21)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
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

    private void txtFristnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFristnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFristnameActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberActionPerformed

    private void txtNicNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNicNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNicNumberActionPerformed

    private void cmbJobtitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbJobtitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbJobtitleActionPerformed

    private void txtAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtBasicSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBasicSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBasicSalaryActionPerformed
 public String getDepartment_id()
{
    String DepartmentId="";
String DepartmentName=cmbdepartment.getSelectedItem().toString().trim();
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
    
    
    
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
      try{
       getConnection();
  
      //int row=tableupdate.getSelectedRow();
     // String value=(tableupdate.getModel().getValueAt(row,0).toString().trim());
       //String value1=(tableupdate.getModel().getValueAt(row,1).toString());
      // String query="UPDATE Employee SET Employee_Id='"+value+"', EPF_Number=?,Frist_Name=?,Last_name=?,DOB=?,Adress=?,Phone_Number=?,NIC_Number=?,gender=?,Bankname=?,Account_Number=?,Jobtitle=?,Salary_Type=?,Basic_Salary=?,addedDate=?,Email=?,DepartmentName=?,Department_id=? where Employee_Id ='"+value+"'";
       //String query="insert into Employee(EPF_Number,Frist_Name,Last_name,DOB,Adress,Phone_Number,NIC_Number,gender,Bankname,Account_Number,Jobtitle,Salary_Type,Basic_Salary,addedDate,Email,DepartmentName,Department_id ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)where Employee_Id=? ";
      //String query="insert into Employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      //PreparedStatement stat2=con.prepareStatement(query);
       //stat2.setString(1, value);
       String sql="update Employee set  EPF_Number=?,Frist_Name=?,Last_name=?,DOB=?,Adress=?,Phone_Number=?,NIC_Number=?,gender=?,Bankname=?,Account_Number=?,Jobtitle=?,Salary_Type=?,Basic_Salary=?,addedDate=?,Email=?,DepartmentName=?,Department_id=? where Employee_Id =? ";
       PreparedStatement stat2=con.prepareStatement(sql);
       
       stat2.setString(1,txtEPFNumber.getText());
       stat2.setString(2,txtFristname.getText());
       stat2.setString(3,txtLastName.getText());
       stat2.setString(4,txtDOB.getText());
       stat2.setString(5,txtAddress.getText());
       stat2.setInt(6, Integer.parseInt(txtPhoneNumber.getText()));
       stat2.setString(7,txtNicNumber.getText());
       String gender=null,Jobtitle=null,Salarytype=null;
       if(rbMale.isSelected())
       {
           gender="Male";
       }
       if(rbfemale.isSelected())
       {
           gender="Female";
       }
       stat2.setString(8,gender);
       stat2.setString(9,txtBankName.getText());
       stat2.setString(10,txtAccountNumber.getText());
       Jobtitle=cmbJobtitle.getSelectedItem().toString();
       stat2.setString(11,Jobtitle);
       Salarytype=cmbSalaryType.getSelectedItem().toString();
       stat2.setString(12,Salarytype);
       stat2.setFloat(13,Float.parseFloat(txtBasicSalary.getText()));
       stat2.setString(14,txtdate.getText());
       stat2.setString(15,txtEmail.getText());
       String depName=cmbdepartment.getSelectedItem().toString();
       
       stat2.setString(16, depName);
       
       stat2.setString(17,getDepartment_id()); 
       stat2.setString(18,txtEmployeeid.getText());
       stat2.executeUpdate();
       DefaultTableModel model=(DefaultTableModel)tableupdate.getModel();
       model.setRowCount(0);
       show_employee();
       JOptionPane.showMessageDialog(this,"Update Sucessfull");
       
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(this,new String("Error  "+e));
          //JOptionPane.showMessageDialog(null,"Error encounterd while entering data in the database"+ex);
      }
        
        
        
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tableupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableupdateMouseClicked
        // TODO add your handling code here:
        int i = tableupdate.getSelectedRow();
        TableModel model=tableupdate.getModel();
        txtEmployeeid.setText(model.getValueAt(i,0).toString());
       txtEmployeeid.setEnabled(false);
        txtEPFNumber.setText(model.getValueAt(i,1).toString());
        txtEPFNumber.setEnabled(false);
        txtFristname.setText(model.getValueAt(i,2).toString());
        txtLastName.setText(model.getValueAt(i,3).toString());
        txtDOB.setText(model.getValueAt(i,4).toString());
        txtAddress.setText(model.getValueAt(i, 5).toString());
        txtPhoneNumber.setText(model.getValueAt(i, 6).toString());
        txtNicNumber.setText(model.getValueAt(i,7).toString());
        String gen=model.getValueAt(i, 8).toString();
        if(gen.equals("Male"))
       {
          rbMale.setSelected(true);
       }
        else
       {
          rbfemale.setSelected(true);
       }
        txtBankName.setText(model.getValueAt(i,9).toString());
        txtAccountNumber.setText(model.getValueAt(i,10).toString());
        String jbtitle=model.getValueAt(i, 11).toString();
        switch(jbtitle)
        {
            case "Manager":
                cmbJobtitle.setSelectedIndex(0);
                        break;
            
            case "Assistant":
               cmbJobtitle.setSelectedIndex(1);
                        break;
            case "Executive":
                cmbJobtitle.setSelectedIndex(2);
                        break;    
        }
        
        String Stype=model.getValueAt(i, 12).toString();
        switch(Stype)
        {
            case "Eitherfixed":
                cmbSalaryType.setSelectedIndex(0);
                        break;
            
            case "Monthly":
               cmbSalaryType.setSelectedIndex(1);
                        break;
            case "Hourly":
                cmbSalaryType.setSelectedIndex(2);
                        break;    
        }
        txtBasicSalary.setText(model.getValueAt(i,13).toString());
        txtdate.setText(model.getValueAt(i,14).toString());
        txtEmail.setText(model.getValueAt(i,15).toString());

        String Deptype=model.getValueAt(i, 16).toString();
       switch(Deptype)
        {
            case "IT":
                cmbdepartment.setSelectedIndex(0);
                        break;
            
            case "HR":
               cmbdepartment.setSelectedIndex(1);
                        break;
            case "Marcketing":
                cmbdepartment.setSelectedIndex(2);
                        break; 
             case "Accounting":
                cmbdepartment.setSelectedIndex(3);
                        break;    
        }
       
 
        
    }//GEN-LAST:event_tableupdateMouseClicked

    private void cmbSalaryTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSalaryTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSalaryTypeActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       txtEmployeeid.setText("");
        txtFristname.setText("");
       txtEPFNumber.setText("");
        txtLastName.setText("");
        txtDOB.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtNicNumber.setText("");
        txtBankName.setText("");
        txtAccountNumber.setText("");
        txtBasicSalary.setText("");
      txtEmail.setText("");
      txtdate.setText("");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        ManageEmployee obj=new ManageEmployee();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
         
        try
         {
            getConnection();
             
             PreparedStatement stat2=con.prepareStatement("Select Department_Name  from Department");
             ResultSet rs1=stat2.executeQuery();
             String DepName1[]=new String[100];
             int index=0;
             while(rs1.next())
             {
                DepName1[index] =rs1.getString("Department_Name");
                index++;
             }
             cmbdepartment.setModel(new DefaultComboBoxModel(DepName1));
         }
          catch (Exception ex)
                 {
                 JOptionPane.showMessageDialog(null,"Error genarating DepartmentName"+ex);
                 }
       
        
    }//GEN-LAST:event_formWindowOpened

    private void txtEPFNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEPFNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEPFNumberActionPerformed

    private void txtPhoneNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyTyped
         try{
         int i=Integer.parseInt(txtPhoneNumber.getText());
          
     lablepnvalid.setText("");
      }
      catch(NumberFormatException e){
          lablepnvalid.setText("Invalid");
      }
    }//GEN-LAST:event_txtPhoneNumberKeyTyped

    private void txtBasicSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBasicSalaryKeyTyped
         try{
         int i=Integer.parseInt(txtBasicSalary.getText());
          
     lablebsaicsalarvalid.setText("");
      }
      catch(NumberFormatException e){
          lablebsaicsalarvalid.setText("Invalid");
      }
    }//GEN-LAST:event_txtBasicSalaryKeyTyped

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbJobtitle;
    private javax.swing.JComboBox cmbSalaryType;
    private javax.swing.JComboBox cmbdepartment;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lablebsaicsalarvalid;
    private javax.swing.JLabel lablepnvalid;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JTable tableupdate;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtBasicSalary;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEPFNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeid;
    private javax.swing.JTextField txtFristname;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNicNumber;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtdate;
    // End of variables declaration//GEN-END:variables
}
