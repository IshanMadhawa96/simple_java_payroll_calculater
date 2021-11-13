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
import javax.mail.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




/**
 *
 * @author ish
 */
public class viewsalary extends javax.swing.JFrame {

    /**
     * Creates new form viewsalary
     */
    public viewsalary() {
        initComponents();
        show_Paysheet();
    }
Connection con;
//Databse Connnecton
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
 public ArrayList<viewpaysheet>viewSalaryTable()
 {
     
      ArrayList<viewpaysheet> viewSalaryTable= new ArrayList<>();
     try
     {
      getConnection();   
      String query="select * from  Salarycalculation";  
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery(query);
      viewpaysheet viewpaysheet1;
      while(rs.next())
      {
          
          
            viewpaysheet1=new  viewpaysheet(rs.getString("PaysheetID").trim(),rs.getString("EPF_Number").trim(),rs.getString("Frist_Name").trim(),rs.getString("Last_name").trim(),rs.getString("Email").trim(),rs.getString("AccountNumber").trim(),rs.getString("ReleseDate").trim(),rs.getFloat("BasicSalary"),rs.getFloat("SfiftAllowance"),rs.getFloat("AttendenceBones"),rs.getFloat("ProIncentive"),rs.getFloat("OT"),rs.getFloat("TotalEraning"),rs.getFloat("EPFEmployee"),rs.getFloat("Tax"),rs.getFloat("FeAdvInst"),rs.getFloat("TotalDeducations"),rs.getFloat("NetSalary"),rs.getFloat("EPFEmployer"),rs.getFloat("ETFEmployer"),rs.getFloat("OTRate"),rs.getFloat("OTHoures"),rs.getFloat("StampDuty"),rs.getString("Salary_Type").trim(),rs.getString("Jobtitle").trim(),rs.getString("DepartmentName").trim(),rs.getString("Employee_Id").trim(),rs.getString("Department_id").trim());    
         viewSalaryTable.add(viewpaysheet1);
      }  
     }
     catch(Exception e)
      {
        JOptionPane.showMessageDialog(null,e); 
      }
     return viewSalaryTable;
     
 }

   public void show_Paysheet()
{
  ArrayList<viewpaysheet> list=viewSalaryTable();
  DefaultTableModel model=(DefaultTableModel)tableViewSalary.getModel();
  Object[] row=new Object[28];
  for(int i=0;i<list.size();i++)
  {
      row[0]=list.get(i).getPaysheetID();
      row[1]=list.get(i).getEPF_Number();
      row[2]=list.get(i).getFrist_Name();
      row[3]=list.get(i).getLast_name();
      row[4]=list.get(i).getEmail();
      row[5]=list.get(i).getAccountNumber();
      row[6]=list.get(i).getReleseDate();
      row[7]=list.get(i).getBasicSalary();
      row[8]=list.get(i).getSfiftAllowance();
      row[9]=list.get(i).getAttendenceBones();
      row[10]=list.get(i).getProIncentive();
      row[11]=list.get(i).getOT();
      row[12]=list.get(i).getTotalEraning();
      row[13]=list.get(i).getEPFEmployee();
      row[14]=list.get(i).getTax();
      row[15]=list.get(i).getFeAdvInst();
      row[16]=list.get(i).getTotalDeducation();
      row[17]=list.get(i).getNetSalary();
      row[18]=list.get(i).getEPFEmployer();
      row[19]=list.get(i).getETFEmployer();
      row[20]=list.get(i).getOTRate();
      row[21]=list.get(i).getOTHoures();
      row[22]=list.get(i).getStampDuty();
      row[23]=list.get(i).getSalary_Type();
      row[24]=list.get(i).getJobtitle();
      row[25]=list.get(i).getDepartmentName();
      row[26]=list.get(i).getEmployee_Id();
      row[27]=list.get(i).getDepartment_id();
      model.addRow(row);
      
  }
  
} 


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewSalary = new javax.swing.JTable();
        btnPlayship = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtSubject = new javax.swing.JTextField();
        textAreaPlayship = new java.awt.TextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        LableName = new javax.swing.JLabel();
        LableEPFNo = new javax.swing.JLabel();
        LableEmpId = new javax.swing.JLabel();
        LableEmail = new javax.swing.JLabel();
        lablepaysheetid = new javax.swing.JLabel();
        lableJobtitle = new javax.swing.JLabel();
        lableAccountnumber = new javax.swing.JLabel();
        lablesalarytype = new javax.swing.JLabel();
        lablemonth = new javax.swing.JLabel();
        lableBasicSlary = new javax.swing.JLabel();
        lableShiftAllowance = new javax.swing.JLabel();
        lableAttendencebonus = new javax.swing.JLabel();
        lableProIcentive = new javax.swing.JLabel();
        LableOT = new javax.swing.JLabel();
        labletotalEranings = new javax.swing.JLabel();
        LableEPFeMPLOYEE = new javax.swing.JLabel();
        labletax = new javax.swing.JLabel();
        labelFestAdvInst = new javax.swing.JLabel();
        labaleTotalDeducations = new javax.swing.JLabel();
        lablenetsalary = new javax.swing.JLabel();
        lableLastName = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnbacktomainmenu = new javax.swing.JButton();
        btnBacktocalculatesalary = new javax.swing.JButton();
        txtTO = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Genarate Pay sheet");

        tableViewSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SlipID", "EPFNo", "FristName", "LastName", "Email", "AcNo", "RelaseDate", "BasicSalary", "ShiftAllowance", "AttendenceBonus", "Pro.Incentive", "OT", "TotalEraning", "EPFEmployee", "Tax", "FeAdvInst", "TotalDeducation", "NetSalary", "EPFEmployer", "ETFEmployer", "OTRate", "OTHoures", "StamDuty", "SalaryType", "Position", "Dep.Name", "Emp.ID", "Dep.Id"
            }
        ));
        tableViewSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewSalaryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableViewSalary);

        btnPlayship.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPlayship.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Add_Property_25px.png"))); // NOI18N
        btnPlayship.setText("Genarate");
        btnPlayship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayshipActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setText("To:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Subject:");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Pay Advice");

        jLabel3.setText("Name:");

        jLabel4.setText("EPF No:");

        jLabel5.setText("EMP ID:");

        jLabel6.setText("Pay Sheet ID:");

        jLabel7.setText("Job Title:");

        jLabel8.setText("Ac No:");

        jLabel9.setText("Email:");

        jLabel10.setText("Salary Type:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Earnings");

        jLabel12.setText("Basic Salary:");

        jLabel13.setText("Shift Allowance:");

        jLabel14.setText("Attendence Bonus:");

        jLabel15.setText("Pro Incentive:");

        jLabel16.setText("OT:");

        jLabel17.setText("Total Earnings:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("Deducation:");

        jLabel19.setText("EPF Employee:");

        jLabel20.setText("Tax(5%):");

        jLabel21.setText("Fest.Adv.Inst:");

        jLabel22.setText("Total Deducations:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Net Salary:");

        jLabel24.setText("Month:");

        LableName.setText(".");

        LableEPFNo.setText(".");

        LableEmpId.setText(".");

        LableEmail.setText(".");
        LableEmail.setToolTipText("");

        lablepaysheetid.setText(".");

        lableJobtitle.setText(".");

        lableAccountnumber.setText(".");

        lablesalarytype.setText(".");

        lablemonth.setText(".");

        lableBasicSlary.setText(".");

        lableShiftAllowance.setText(".");

        lableAttendencebonus.setText(".");

        lableProIcentive.setText(".");

        LableOT.setText(".");

        labletotalEranings.setText(".");

        LableEPFeMPLOYEE.setText(".");

        labletax.setText(".");

        labelFestAdvInst.setText(".");

        labaleTotalDeducations.setText(".");

        lablenetsalary.setText(".");

        lableLastName.setText(".");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lableBasicSlary, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(lableShiftAllowance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lableAttendencebonus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LableOT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lableProIcentive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labletax, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LableEPFeMPLOYEE, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelFestAdvInst, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(LableEmpId, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                                .addComponent(LableEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(LableName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lableLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(132, 132, 132))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(LableEPFNo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lablesalarytype, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(lablemonth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lableJobtitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(lablepaysheetid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lableAccountnumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lablenetsalary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(labaleTotalDeducations, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labletotalEranings, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(lablepaysheetid)
                    .addComponent(LableName)
                    .addComponent(lableLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(LableEPFNo)
                    .addComponent(lableJobtitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(LableEmpId)
                    .addComponent(lableAccountnumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(LableEmail)
                    .addComponent(lablesalarytype))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(lablemonth))
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lableBasicSlary))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lableShiftAllowance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lableAttendencebonus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lableProIcentive))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(LableOT))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(labletotalEranings))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(LableEPFeMPLOYEE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(labletax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(labelFestAdvInst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(labaleTotalDeducations))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(lablenetsalary))
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Clear_Symbol_25px_2.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Gmail_25px_4.png"))); // NOI18N
        jButton1.setText("Send ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnbacktomainmenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbacktomainmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Back_To_25px_3.png"))); // NOI18N
        btnbacktomainmenu.setText("Back to main menu");
        btnbacktomainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbacktomainmenuActionPerformed(evt);
            }
        });

        btnBacktocalculatesalary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBacktocalculatesalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xyzorganization/images/icons8_Back_To_25px_1.png"))); // NOI18N
        btnBacktocalculatesalary.setText("Calculate salary");
        btnBacktocalculatesalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktocalculatesalaryActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textAreaPlayship, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTO, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtSubject, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPlayship)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnbacktomainmenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBacktocalculatesalary)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textAreaPlayship, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlayship)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBacktocalculatesalary)
                            .addComponent(btnbacktomainmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndelete))
                        .addGap(164, 164, 164))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableViewSalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewSalaryMouseClicked
       
       int i = tableViewSalary.getSelectedRow();
        TableModel model=tableViewSalary.getModel(); 
        lablepaysheetid.setText(model.getValueAt(i,0).toString());
        LableEPFNo.setText(model.getValueAt(i,1).toString());
        LableName.setText(model.getValueAt(i,2).toString());
        lableLastName.setText(model.getValueAt(i,3).toString());
        LableEmpId.setText(model.getValueAt(i,26).toString());
        LableEmail.setText(model.getValueAt(i,4).toString());
        
        lableJobtitle.setText(model.getValueAt(i,24).toString());
        lableAccountnumber.setText(model.getValueAt(i,5).toString());
        lablesalarytype.setText(model.getValueAt(i,23).toString());
        lablemonth.setText(model.getValueAt(i,6).toString());
        
        lableBasicSlary.setText(model.getValueAt(i,7).toString());
        lableShiftAllowance.setText(model.getValueAt(i,8).toString());
        lableAttendencebonus.setText(model.getValueAt(i,9).toString());
        lableProIcentive.setText(model.getValueAt(i,10).toString());
        LableOT.setText(model.getValueAt(i,11).toString());
        labletotalEranings.setText(model.getValueAt(i,12).toString());
        LableEPFeMPLOYEE.setText(model.getValueAt(i,13).toString());
        labletax.setText(model.getValueAt(i,14).toString());
        labelFestAdvInst.setText(model.getValueAt(i,15).toString());
        labaleTotalDeducations.setText(model.getValueAt(i,16).toString());
        lablenetsalary.setText(model.getValueAt(i,17).toString());
         textAreaPlayship.setText("");
         txtTO.setText("");
         txtSubject.setText("");
         btnPlayship.setEnabled(true);
    }//GEN-LAST:event_tableViewSalaryMouseClicked

    private void btnPlayshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayshipActionPerformed
      
      txtTO.setText(LableEmail.getText().toString());
      txtSubject.setText("Monthly Slary Slip for "+lablemonth.getText().toString());
      textAreaPlayship.append("-------------------------------------------------------------------------------------------------------------------------------\n");
      textAreaPlayship.append("\t\t\t\tPay Slip"+"\n"+
              "-------------------------------------------------------------------------------------------------------------------------------"+"\n");
      textAreaPlayship.append("Name:  "+" "+LableName.getText()+" "+lableLastName.getText()+"\t\t\t\t\tPay SheetID:"+" "+lablepaysheetid.getText()+"\n");
      textAreaPlayship.append("EPF No:"+" "+LableEPFNo.getText()+"\t\t\t\t\t\tJob Title:"+" "+lableJobtitle.getText()+"\n");  
      textAreaPlayship.append("EMP ID:"+" "+LableEmpId.getText()+"\t\t\t\t\t\tAC No:    "+" "+lableAccountnumber.getText()+"\n");  
      textAreaPlayship.append("EMail: "+" "+LableEmail.getText()+"            \t\tSalary Type:"+" "+lablesalarytype.getText()+"\n"); 
      textAreaPlayship.append("\t\t\t\t\t\t\tMonth:"+" "+lablemonth.getText()+"\n");
      textAreaPlayship.append("-------------------------------------------------------------------------------------------------------------------------------\n");
      textAreaPlayship.append("    Earnings"+"\n");
      textAreaPlayship.append("\tBasic Salary:    "+"  \t\t"+lableBasicSlary.getText()+"\n");
      textAreaPlayship.append("\tShift Allowance: "+"  \t\t"+lableShiftAllowance.getText()+"\n");
      textAreaPlayship.append("\tAttendence Bonus:"+"\t"+lableAttendencebonus.getText()+"\n");
      textAreaPlayship.append("\tPro Incentive:   "+"  \t\t"+lableProIcentive.getText()+"\n");
      textAreaPlayship.append("\tOver Time:       "+"  \t\t"+LableOT.getText()+"\n");
       textAreaPlayship.append("-------------------------------------------------------------------------------------------------------------------------------\n");
      textAreaPlayship.append("\tTotal Eranings:    "+"\t\t\t"+labletotalEranings.getText()+"\n");
      textAreaPlayship.append("-------------------------------------------------------------------------------------------------------------------------------\n");
      textAreaPlayship.append("    Deducations"+"\n");
      textAreaPlayship.append("\tEPF Employee:    "+"\t"+LableEPFeMPLOYEE.getText()+"\n");
      textAreaPlayship.append("\tTax(5%):         "+"\t\t"+labletax.getText()+"\n");
      textAreaPlayship.append("\tFest.Adv.Inst:   "+"\t\t"+labelFestAdvInst.getText()+"\n");
       textAreaPlayship.append("-------------------------------------------------------------------------------------------------------------------------------\n");
      textAreaPlayship.append("\tTotal Deducations: "+"\t\t"+labaleTotalDeducations.getText()+"\n");
      textAreaPlayship.append("-------------------------------------------------------------------------------------------------------------------------------\n");
      textAreaPlayship.append("\tNet Salary(Rs.)  "+"\t\t\t"+lablenetsalary.getText()+"\n");
      textAreaPlayship.append("-------------------------------------------------------------------------------------------------------------------------------\n");
      btnPlayship.setEnabled(false);
    }//GEN-LAST:event_btnPlayshipActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
   textAreaPlayship.setText("");
   txtTO.setText("");
   txtSubject.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String Sub=txtSubject.getText().toString();
       String body=textAreaPlayship.getText().toString();
       String to=txtTO.getText().toString();

        
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
            message.setSubject(Sub);
            message.setText(body);
            Transport.send(message);
            JOptionPane.showMessageDialog(null,"Mail Send");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Mail fail! Check Your Connection!"+ex);
           //JOptionPane.showMessageDialog(null,ex);
        } 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnbacktomainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbacktomainmenuActionPerformed
         SalaryMenu obj=new SalaryMenu();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_btnbacktomainmenuActionPerformed

    private void btnBacktocalculatesalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktocalculatesalaryActionPerformed
       ManageSalary obj=new  ManageSalary();
        obj.show();
        this.dispose();
    }//GEN-LAST:event_btnBacktocalculatesalaryActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        try
        {
            getConnection();
            PreparedStatement stat=con.prepareStatement("delete from Salarycalculation  where PaysheetID=?");
            stat.setString(1,lablepaysheetid.getText());
            int rows=stat.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)tableViewSalary.getModel();
            model.setRowCount(0);
            show_Paysheet();
              lablepaysheetid.setText("");
        LableEPFNo.setText("");
        LableName.setText("");
        lableLastName.setText("");
        LableEmpId.setText("");
        LableEmail.setText("");
        
        lableJobtitle.setText("");
        lableAccountnumber.setText("");
        lablesalarytype.setText("");
        lablemonth.setText("");
        
        lableBasicSlary.setText("");
        lableShiftAllowance.setText("");
        lableAttendencebonus.setText("");
        lableProIcentive.setText("");
        LableOT.setText("");
        labletotalEranings.setText("");
        LableEPFeMPLOYEE.setText("");
        labletax.setText("");
        labelFestAdvInst.setText("");
        labaleTotalDeducations.setText("");
        lablenetsalary.setText("");
            if(rows>0)
            {
                JOptionPane.showMessageDialog(null,"deleted....");
            }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Error delete data! "+ex);
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btnPlayship.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(viewsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewsalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewsalary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LableEPFNo;
    private javax.swing.JLabel LableEPFeMPLOYEE;
    private javax.swing.JLabel LableEmail;
    private javax.swing.JLabel LableEmpId;
    private javax.swing.JLabel LableName;
    private javax.swing.JLabel LableOT;
    private javax.swing.JButton btnBacktocalculatesalary;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnPlayship;
    private javax.swing.JButton btnbacktomainmenu;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labaleTotalDeducations;
    private javax.swing.JLabel labelFestAdvInst;
    private javax.swing.JLabel lableAccountnumber;
    private javax.swing.JLabel lableAttendencebonus;
    private javax.swing.JLabel lableBasicSlary;
    private javax.swing.JLabel lableJobtitle;
    private javax.swing.JLabel lableLastName;
    private javax.swing.JLabel lableProIcentive;
    private javax.swing.JLabel lableShiftAllowance;
    private javax.swing.JLabel lablemonth;
    private javax.swing.JLabel lablenetsalary;
    private javax.swing.JLabel lablepaysheetid;
    private javax.swing.JLabel lablesalarytype;
    private javax.swing.JLabel labletax;
    private javax.swing.JLabel labletotalEranings;
    private javax.swing.JTable tableViewSalary;
    private java.awt.TextArea textAreaPlayship;
    private javax.swing.JTextField txtSubject;
    private javax.swing.JTextField txtTO;
    // End of variables declaration//GEN-END:variables
}
