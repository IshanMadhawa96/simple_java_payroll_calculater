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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author ish
 */
public class ManageSalary extends javax.swing.JFrame {

    /**
     * Creates new form ManageSalary
     */
    public ManageSalary() {
        initComponents();
        show_employee();
        currentMonth2();
        //save();
    }
    //Database Connection
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
   public ArrayList<payadvice>paysheet()
   {// loding Employee details to table
        ArrayList<payadvice> paysheet= new ArrayList<>();//Creating Array for store table details
        try
        {
            getConnection();
           // Select Statement
            String query2="select * from  Employee";
           
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query2);
          
            payadvice payadvice1;
            while(rs.next())
            {
              //Parameter passing for pay advice class  
              payadvice1=new payadvice(rs.getString("Employee_Id").trim(),rs.getString("EPF_Number").trim(),rs.getString("Frist_Name").trim(),rs.getString("Last_name").trim(),rs.getString("DOB").trim(),rs.getString("Adress").trim(),rs.getInt("Phone_Number"),rs.getString("NIC_Number").trim(),rs.getString("gender").trim(),rs.getString("Bankname").trim(),rs.getString("Account_Number").trim(),rs.getString("Jobtitle").trim(),rs.getString("Salary_Type").trim(),rs.getFloat("Basic_Salary"),rs.getString("addedDate").trim(),rs.getString("Email").trim(),rs.getString("DepartmentName").trim(),rs.getString("Department_id").trim());
              paysheet.add(payadvice1);
            }
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
         return paysheet;
   }
 // Show Table data     
   public void show_employee()
{
  ArrayList<payadvice> list=paysheet();
  DefaultTableModel model=(DefaultTableModel)tablesalaryCalculation.getModel();
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
//Show Current Month
 public void currentMonth2()
{
  Date thisDate=new Date();
    SimpleDateFormat dateForm=new SimpleDateFormat("MMMM/Y");
    lableMonth.setText(dateForm.format(thisDate));
    btndelete.setEnabled(false);
    btnSave.setEnabled(false);
}         
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lableEmployeeName = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lableDepartmentName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lableEmployeeid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LableDepartmentID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBasicSalary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtShiftallowance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtAttendencebonus = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtProductivityIncentive = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtOT = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtOverTime = new javax.swing.JTextField();
        txtEmployeeCont = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTax = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtfestAdvInst = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtEmployerEPF = new javax.swing.JTextField();
        txtEtfEmployer = new javax.swing.JTextField();
        txtOTRate = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtStampDuty = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtTotalEranings = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtTotalDeducations = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lableEPFno = new javax.swing.JLabel();
        lableAccountNo = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtNetSalary = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablesalaryCalculation = new javax.swing.JTable();
        Labellastname = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lableEmail = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        LablePaysheetId = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        labletypeofsalary = new javax.swing.JLabel();
        lableMonth = new javax.swing.JLabel();
        btnEmail = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        lablePosition = new javax.swing.JLabel();
        lablevalidation = new javax.swing.JLabel();
        lablevalidation1 = new javax.swing.JLabel();
        lablevalidation2 = new javax.swing.JLabel();
        lablevalidation3 = new javax.swing.JLabel();
        lablevalidation4 = new javax.swing.JLabel();
        lablevalidation5 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Pay Advice");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("EMPLOYER:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("EMPLOYEE:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("XYZ Organization");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("FOR THE MONTH OF:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("DEPARTMENT:");

        lableDepartmentName.setText(".");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("EMP ID:");

        lableEmployeeid.setText(".");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("DEP ID:");

        LableDepartmentID.setText(".");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("EARNINGS");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("DEDUCTIONS");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("OTHER DETAILS");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Basic Salary:");

        txtBasicSalary.setText("0");
        txtBasicSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBasicSalaryActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Shift Allowance:");

        txtShiftallowance.setText("0");
        txtShiftallowance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtShiftallowanceKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Attendence Bonus:");

        txtAttendencebonus.setText("0");
        txtAttendencebonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttendencebonusActionPerformed(evt);
            }
        });
        txtAttendencebonus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAttendencebonusKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Productivity Incentive:");

        txtProductivityIncentive.setText("0");
        txtProductivityIncentive.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProductivityIncentiveKeyTyped(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("OT hours:");

        txtOT.setText("0");
        txtOT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOTKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("EPF Employee Cont(12%):");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("OverTime");

        txtOverTime.setText("0");

        txtEmployeeCont.setText("0");
        txtEmployeeCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeContActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Tax(5%):");

        txtTax.setText("0");
        txtTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaxActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Fest.Adv.Inst:");

        txtfestAdvInst.setText("0");
        txtfestAdvInst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfestAdvInstKeyTyped(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("EPF Employer Cont:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("ETF Employer Cont:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("OT Rate:");

        txtEmployerEPF.setText("0");

        txtEtfEmployer.setText("0");

        txtOTRate.setText("0");
        txtOTRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOTRateKeyTyped(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Stamp Duty");

        txtStampDuty.setText("100");
        txtStampDuty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStampDutyActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Total Earnings:");

        txtTotalEranings.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("Total Deducations:");

        txtTotalDeducations.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setText("EPF No:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Account No:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel29.setText("Net Salary in Cash:");

        txtNetSalary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNetSalary.setToolTipText("");

        tablesalaryCalculation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablesalaryCalculation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EID", "EPFNo", "FristName", "LastName", "DOB", "Adress", "Phone ", "NIC", "Gender", "Bank Name", "Account No", "Jobtitle", "Salary Type", "Basic Salary", "Reg.Date", "Email", "Dep.Name", "Dep.Id"
            }
        ));
        tablesalaryCalculation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesalaryCalculationMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablesalaryCalculation);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel30.setText("Email:");

        btnCalculate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Calculator_25px.png"))); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Clear_Symbol_25px_2.png"))); // NOI18N
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Save_25px.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
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

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Shutdown_25px.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel31.setText("Pay Sheet Id:");

        LablePaysheetId.setText(".");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel32.setText("Salary Type:");

        btnEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Gmail_25px_4.png"))); // NOI18N
        btnEmail.setText("Send Email");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Position:");

        lablevalidation.setForeground(new java.awt.Color(255, 0, 51));
        lablevalidation.setText(".");

        lablevalidation1.setForeground(new java.awt.Color(255, 0, 51));
        lablevalidation1.setText(".");

        lablevalidation2.setForeground(new java.awt.Color(255, 0, 51));
        lablevalidation2.setText(".");

        lablevalidation3.setForeground(new java.awt.Color(255, 0, 51));
        lablevalidation3.setText(".");

        lablevalidation4.setForeground(new java.awt.Color(255, 0, 51));
        lablevalidation4.setText(".");
        lablevalidation4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lablevalidation4KeyTyped(evt);
            }
        });

        lablevalidation5.setForeground(new java.awt.Color(255, 0, 51));
        lablevalidation5.setText(".");
        lablevalidation5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lablevalidation5KeyTyped(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Delete_Database_25px.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(268, 268, 268)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lableEmployeeid)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lableEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Labellastname))
                                    .addComponent(lableEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lableDepartmentName)
                                    .addComponent(LableDepartmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LablePaysheetId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lableMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lablePosition, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel11)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel14))
                                        .addGap(34, 34, 34))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtShiftallowance, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lablevalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel10)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtAttendencebonus, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lablevalidation2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lablevalidation1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel20)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalDeducations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmployeeCont, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtfestAdvInst, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lablevalidation3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btndelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel25))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtOverTime, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                            .addComponent(txtTotalEranings)
                                            .addComponent(txtProductivityIncentive, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEmail)
                                .addGap(65, 65, 65)))
                        .addGap(18, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNetSalary))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel32)))
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmployerEPF)
                                    .addComponent(txtEtfEmployer)
                                    .addComponent(lableEPFno)
                                    .addComponent(lableAccountNo)
                                    .addComponent(txtStampDuty, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labletypeofsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtOT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                            .addComponent(txtOTRate, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lablevalidation4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lablevalidation5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLogout)
                        .addGap(20, 20, 20))))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(LablePaysheetId))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(lableMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel30)
                        .addComponent(lableEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(lableDepartmentName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lableEmployeeName)
                        .addComponent(Labellastname))
                    .addComponent(jLabel7)
                    .addComponent(LableDepartmentID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lableEmployeeid))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lablePosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtEmployeeCont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(txtEmployerEPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtShiftallowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtEtfEmployer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lablevalidation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtAttendencebonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtfestAdvInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtOTRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lablevalidation1)
                    .addComponent(lablevalidation3)
                    .addComponent(lablevalidation4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtProductivityIncentive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtOT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lablevalidation2)
                    .addComponent(lablevalidation5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtOverTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtStampDuty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lableEPFno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(lableAccountNo))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(labletypeofsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtTotalEranings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtTotalDeducations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtNetSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnclear)
                    .addComponent(btnSave)
                    .addComponent(btnCalculate)
                    .addComponent(btnEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndelete)
                    .addComponent(jButton1))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
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
       //Auto genaraetd Pay sheet id
        getConnection();
          try
       { //getConnection();
        PreparedStatement stmt1=con.prepareStatement("select PaysheetID  from Salarycalculation");
        ResultSet  rs3=stmt1.executeQuery(); 	
 String EPFN=null;
        while (rs3.next())
           {
 EPFN= rs3.getString("PaysheetID").trim() ;		
       }     
       String y =EPFN.substring(3);
      int  ID1  =Integer.parseInt(y);
      String IDS1=null;
      if(ID1>0 && ID1<9)
      {
       ID1=ID1+1;
       IDS1 ="PAY00"+ID1;   
      }
      else   if(ID1>=9 && ID1<99)
      {
       ID1=ID1+1;
        IDS1 ="PAY0"+ID1;
               }
       else   if(ID1>=99)
      {
       ID1=ID1+1;
        IDS1 ="PAY"+ID1;
               }
  LablePaysheetId.setText(IDS1);   
       }
  catch(Exception e)
                  {      
     JOptionPane.showMessageDialog(null,"Error generting EPF Number "+e);
        	      }
        
    
        
    }//GEN-LAST:event_formWindowOpened

    private void lablevalidation5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lablevalidation5KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lablevalidation5KeyTyped

    private void lablevalidation4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lablevalidation4KeyTyped

    }//GEN-LAST:event_lablevalidation4KeyTyped

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        // TODO add your handling code here:
        viewsalary obj=new viewsalary();
        obj.show();
        this.dispose();

    }//GEN-LAST:event_btnEmailActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        loginform obj=new loginform();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        SalaryMenu obj=new SalaryMenu();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    //Calculation Button
        boolean valid=true;
 if(txtTotalEranings.getText().isEmpty())
    {
         btndelete.setEnabled(true);
    JOptionPane.showMessageDialog(null,"Total Eraing can't be Empty","Please calcuate!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
 if(txtTotalDeducations.getText().isEmpty())
    {
         btndelete.setEnabled(true);
    JOptionPane.showMessageDialog(null,"Total Deducaions can't be Empty","Please calcuate!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
 if(txtNetSalary.getText().isEmpty())
    {
        btndelete.setEnabled(true);
    JOptionPane.showMessageDialog(null,"Net Salary can't be Empty","Please calcuate!",JOptionPane.ERROR_MESSAGE);
            valid=false;
    
    }
 if(valid){
        try
        {// stop entering Duplicate calculatings
            getConnection();
            Statement stmt3=con.createStatement();
            String mail=lableEmail.getText();
            String date=lableMonth.getText();
            String SQL="select Email,ReleseDate   from Salarycalculation where Email='"+mail+"' and ReleseDate='"+date+"'";
            ResultSet rs=stmt3.executeQuery(SQL);//
            btndelete.setEnabled(true);
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Alredy Calculated","Error!",JOptionPane.ERROR_MESSAGE);
            }
            else{
                // JOptionPane.showMessageDialog(null," added plz","Error!",JOptionPane.ERROR_MESSAGE);
                //  save();
                try
                {
                    getConnection();
                    PreparedStatement stat1=con.prepareStatement("insert into Salarycalculation values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                    stat1.setString(1,LablePaysheetId.getText());
                    stat1.setString(2,lableEPFno.getText());
                    stat1.setString(3,lableEmployeeName.getText());
                    stat1.setString(4,Labellastname.getText());
                    stat1.setString(5,lableEmail.getText());
                    stat1.setString(6,lableAccountNo.getText());
                    stat1.setString(7,lableMonth.getText());
                    stat1.setString(8,txtBasicSalary.getText());
                    stat1.setString(9,txtShiftallowance.getText());
                    stat1.setString(10,txtAttendencebonus.getText());
                    stat1.setString(11,txtProductivityIncentive.getText());
                    stat1.setString(12,txtOT.getText());
                    stat1.setString(13,txtTotalEranings.getText());
                    stat1.setString(14,txtEmployeeCont.getText());
                    stat1.setString(15,txtTax.getText());
                    stat1.setString(16,txtfestAdvInst.getText());
                    stat1.setString(17,txtTotalDeducations.getText());
                    stat1.setString(18,txtNetSalary.getText());
                    stat1.setString(19,txtEmployerEPF.getText());
                    stat1.setString(20,txtEtfEmployer.getText());
                    stat1.setString(21,txtOTRate.getText());
                    stat1.setString(22,txtOT.getText());
                    stat1.setString(23,txtStampDuty.getText());
                    stat1.setString(24,labletypeofsalary.getText());
                    stat1.setString(25,lablePosition.getText());
                    stat1.setString(26,lableDepartmentName.getText());
                    stat1.setString(27,lableEmployeeid.getText());
                    stat1.setString(28,LableDepartmentID.getText());
                    int row=stat1.executeUpdate();
                     btndelete.setEnabled(true);
                    if(row>0)
                    {
                        JOptionPane.showMessageDialog(null,"Save Success");
                    }

                }

                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,new String("Error inserting data in to database! "+e));
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,new String("Error finding duplicate values! "+e));
        }
 }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       //Clear Button
        lableEmail.setText("");
        LablePaysheetId.setText("");
        lableEmployeeName.setText("");
        lableEmployeeid.setText("");
        LableDepartmentID.setText("");
        lableDepartmentName.setText("");
        txtBasicSalary.setText("0");
        lableAccountNo.setText("");
        lableEPFno.setText("");
        txtShiftallowance.setText("0");
        txtAttendencebonus.setText("0");
        txtProductivityIncentive.setText("0");
        txtOverTime.setText("0.0");
        txtTotalEranings.setText("0.0");
        txtEmployeeCont.setText("0.0");
        txtTax.setText("0.0");
        txtfestAdvInst.setText("0.0");
        txtTotalDeducations.setText("0.0");
        txtEmployerEPF.setText("0.0");
        txtEtfEmployer.setText("0.0");
        txtOTRate.setText("0");
        txtOT.setText("0");
        txtStampDuty.setText("0");
        txtNetSalary.setText("0.0");
        Labellastname.setText("");
        lablePosition.setText("");

    }//GEN-LAST:event_btnclearActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // BasicSalary,ShiftAllowance,AttendenceBonus,ProductivityIncentive,OThours,OverTime,TotalEarnings,EPFEmployeeCont,Tax,FestAdvInst,TotalDeducations,EPFEmployerCont,OTRate,StampDuty,NetSalaryinCash;
        float  BasicSalary=Float.parseFloat(txtBasicSalary.getText());
        float  ShiftAllowance=Float.parseFloat(txtShiftallowance.getText());
        float  AttendenceBonus=Float.parseFloat(txtAttendencebonus.getText());
        float ProductivityIncentive=Float.parseFloat(txtProductivityIncentive.getText());
        float OThours=Float.parseFloat(txtOT.getText());
//calculate OT
        float OTRate=Float.parseFloat(txtOTRate.getText());
        float OverTimeC;
        OverTimeC=OTRate*OThours;
        String cOvertime=Float.toString(OverTimeC);
        txtOverTime.setText(cOvertime);
        // txtOverTime.setEnabled(false);
        float OverTime=Float.parseFloat(txtOverTime.getText());
        //calculate total eranings
        float TotalEarnings=BasicSalary+ShiftAllowance+AttendenceBonus+ProductivityIncentive+OverTime;
        String cTotalEraning=Float.toString(TotalEarnings);
        txtTotalEranings.setText(cTotalEraning);
        //calculate epf
        float   EPFEmployeeCont;
        EPFEmployeeCont=BasicSalary*8/100;
        String convertEPFEmployeeCont=Float.toString(EPFEmployeeCont);
        txtEmployeeCont.setText(convertEPFEmployeeCont);
//calculate tax
        float Tax;
        Tax=BasicSalary*5/100;
        String ConvertTax=Float.toString(Tax);
        txtTax.setText(ConvertTax);
//calculate Employee count
        float FestAdvInst=Float.parseFloat(txtfestAdvInst.getText());
        //calculate total deducations
        float TotalDeducations=EPFEmployeeCont+Tax+FestAdvInst;
        String ConvertTotalDeducations=Float.toString(TotalDeducations);
        txtTotalDeducations.setText(ConvertTotalDeducations);
        //calculate Employer deducations
        float EPFEmployerCont;
        EPFEmployerCont=BasicSalary*12/100;
        String convertEPFEmployerCont=Float.toString(EPFEmployerCont);
        txtEmployerEPF.setText(convertEPFEmployerCont);
        float ETFEmployerCont=BasicSalary*3/100;
        String  ConvertETFEmployerCont=Float.toString(ETFEmployerCont);
        txtEtfEmployer.setText(ConvertETFEmployerCont);
        //calcuate Net Salary
        float NetSalaryinCash=TotalEarnings-TotalDeducations;
        String convertNetSalaryinCash=Float.toString(NetSalaryinCash);
        txtNetSalary.setText(convertNetSalaryinCash);
  btnSave.setEnabled(true);
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void tablesalaryCalculationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesalaryCalculationMouseClicked
//Show selected Employee details in table
        int i = tablesalaryCalculation.getSelectedRow();
        TableModel model=tablesalaryCalculation.getModel();
        txtOverTime.setEnabled(false);
        txtEmployeeCont.setEnabled(false);
        txtTax.setEnabled(false);
        txtEmployerEPF.setEnabled(false);
        txtEtfEmployer.setEnabled(false);
        txtStampDuty.setEnabled(false);
        txtTotalEranings.setEnabled(false);
        txtTotalDeducations.setEnabled(false);
        txtNetSalary.setEnabled(false);
        txtBasicSalary.setEnabled(false);
        lableEmployeeid.setText(model.getValueAt(i,0).toString());
        lableEPFno.setText(model.getValueAt(i,1).toString());
        txtBasicSalary.setText(model.getValueAt(i,13).toString());
        lableEmployeeName.setText(model.getValueAt(i,2).toString());
        Labellastname.setText(model.getValueAt(i,3).toString());
        lableAccountNo.setText(model.getValueAt(i,10).toString());
        lableEmail.setText(model.getValueAt(i,15).toString());
        lableDepartmentName.setText(model.getValueAt(i,16).toString());
        LableDepartmentID.setText(model.getValueAt(i,17).toString());
        labletypeofsalary.setText(model.getValueAt(i,12).toString());
        lablePosition.setText(model.getValueAt(i,11).toString());
        btndelete.setEnabled(false);
        //btnSave.setEnabled(true);
        btnSave.setEnabled(false);
    }//GEN-LAST:event_tablesalaryCalculationMouseClicked

    private void txtStampDutyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStampDutyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStampDutyActionPerformed

    private void txtOTRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOTRateKeyTyped
        // TODO add your handling code here:
        try{
            int i=Integer.parseInt(txtOTRate.getText());

            lablevalidation4.setText("");
        }
        catch(NumberFormatException e){
            lablevalidation4.setText("Invalid");
        }
    }//GEN-LAST:event_txtOTRateKeyTyped

    private void txtfestAdvInstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfestAdvInstKeyTyped
        // TODO add your handling code here:
        try{
            int i=Integer.parseInt(txtfestAdvInst.getText());

            lablevalidation3.setText("");
        }
        catch(NumberFormatException e){
            lablevalidation3.setText("Invalid");
        }
    }//GEN-LAST:event_txtfestAdvInstKeyTyped

    private void txtTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaxActionPerformed

    private void txtEmployeeContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeContActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeContActionPerformed

    private void txtOTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOTKeyTyped
        try{
            int i=Integer.parseInt(txtOT.getText());

            lablevalidation5.setText("");
        }
        catch(NumberFormatException e){
            lablevalidation5.setText("Invalid");
        }

    }//GEN-LAST:event_txtOTKeyTyped

    private void txtProductivityIncentiveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductivityIncentiveKeyTyped
        // TODO add your handling code here:
        try{
            int i=Integer.parseInt(txtProductivityIncentive.getText());

            lablevalidation2.setText("");
        }
        catch(NumberFormatException e){
            lablevalidation2.setText("Invalid");
        }
    }//GEN-LAST:event_txtProductivityIncentiveKeyTyped

    private void txtAttendencebonusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAttendencebonusKeyTyped
        // TODO add your handling code here:
        try{
            int i=Integer.parseInt(txtAttendencebonus.getText());

            lablevalidation1.setText("");
        }
        catch(NumberFormatException e){
            lablevalidation1.setText("Invalid");
        }
    }//GEN-LAST:event_txtAttendencebonusKeyTyped

    private void txtAttendencebonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttendencebonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttendencebonusActionPerformed

    private void txtShiftallowanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtShiftallowanceKeyTyped
        // TODO add your handling code here:
        try{
            int i=Integer.parseInt(txtShiftallowance.getText());

            lablevalidation.setText("");
        }
        catch(NumberFormatException e){
            lablevalidation.setText("Invalid");
        }
    }//GEN-LAST:event_txtShiftallowanceKeyTyped

    private void txtBasicSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBasicSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBasicSalaryActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        //Delete Button
        try
        {
            getConnection();
            PreparedStatement stat=con.prepareStatement("delete from Salarycalculation  where PaysheetID=?");
            stat.setString(1,LablePaysheetId.getText());
            
            int rows=stat.executeUpdate();
            lableEmail.setText("");
        LablePaysheetId.setText("");
        lableEmployeeName.setText("");
        lableEmployeeid.setText("");
        LableDepartmentID.setText("");
        lableDepartmentName.setText("");
        txtBasicSalary.setText("0");
        lableAccountNo.setText("");
        lableEPFno.setText("");
        txtShiftallowance.setText("0");
        txtAttendencebonus.setText("0");
        txtProductivityIncentive.setText("0");
        txtOverTime.setText("0.0");
        txtTotalEranings.setText("0.0");
        txtEmployeeCont.setText("0.0");
        txtTax.setText("0.0");
        txtfestAdvInst.setText("0.0");
        txtTotalDeducations.setText("0.0");
        txtEmployerEPF.setText("0.0");
        txtEtfEmployer.setText("0.0");
        txtOTRate.setText("0");
        txtOT.setText("0");
        txtStampDuty.setText("0");
        txtNetSalary.setText("0.0");
        Labellastname.setText("");
        lablePosition.setText("");
            
            if(rows>0)
            {
                JOptionPane.showMessageDialog(null,"deleted....");
            }
//btndelete.setEnabled(false);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error delete data! "+ex);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        formWindowOpened(null);
       //Refresh button
        lableEmail.setText("");
       
        lableEmployeeName.setText("");
        lableEmployeeid.setText("");
        LableDepartmentID.setText("");
        lableDepartmentName.setText("");
        txtBasicSalary.setText("0");
        lableAccountNo.setText("");
        lableEPFno.setText("");
        txtShiftallowance.setText("0");
        txtAttendencebonus.setText("0");
        txtProductivityIncentive.setText("0");
        txtOverTime.setText("0.0");
        txtTotalEranings.setText("0.0");
        txtEmployeeCont.setText("0.0");
        txtTax.setText("0.0");
        txtfestAdvInst.setText("0.0");
        txtTotalDeducations.setText("0.0");
        txtEmployerEPF.setText("0.0");
        txtEtfEmployer.setText("0.0");
        txtOTRate.setText("0");
        txtOT.setText("0");
        txtStampDuty.setText("0");
        txtNetSalary.setText("0.0");
        Labellastname.setText("");
        lablePosition.setText("");
        btnSave.setEnabled(false);
        btndelete.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManageSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageSalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Labellastname;
    private javax.swing.JLabel LableDepartmentID;
    private javax.swing.JLabel LablePaysheetId;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lableAccountNo;
    private javax.swing.JLabel lableDepartmentName;
    private javax.swing.JLabel lableEPFno;
    private javax.swing.JLabel lableEmail;
    private javax.swing.JLabel lableEmployeeName;
    private javax.swing.JLabel lableEmployeeid;
    private javax.swing.JLabel lableMonth;
    private javax.swing.JLabel lablePosition;
    private javax.swing.JLabel labletypeofsalary;
    private javax.swing.JLabel lablevalidation;
    private javax.swing.JLabel lablevalidation1;
    private javax.swing.JLabel lablevalidation2;
    private javax.swing.JLabel lablevalidation3;
    private javax.swing.JLabel lablevalidation4;
    private javax.swing.JLabel lablevalidation5;
    private javax.swing.JTable tablesalaryCalculation;
    private javax.swing.JTextField txtAttendencebonus;
    private javax.swing.JTextField txtBasicSalary;
    private javax.swing.JTextField txtEmployeeCont;
    private javax.swing.JTextField txtEmployerEPF;
    private javax.swing.JTextField txtEtfEmployer;
    private javax.swing.JTextField txtNetSalary;
    private javax.swing.JTextField txtOT;
    private javax.swing.JTextField txtOTRate;
    private javax.swing.JTextField txtOverTime;
    private javax.swing.JTextField txtProductivityIncentive;
    private javax.swing.JTextField txtShiftallowance;
    private javax.swing.JTextField txtStampDuty;
    private javax.swing.JTextField txtTax;
    private javax.swing.JTextField txtTotalDeducations;
    private javax.swing.JTextField txtTotalEranings;
    private javax.swing.JTextField txtfestAdvInst;
    // End of variables declaration//GEN-END:variables
}
