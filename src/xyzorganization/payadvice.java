/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package xyzorganization;

/**
 *
 * @author ish
 */
class payadvice {
  private String Employee_Id,EPF_Number,Frist_Name,Last_name,DOB,Adress,NIC_Number,gender,Bankname,Account_Number,Jobtitle,Salary_Type,addedDate,Email ,DepartmentName,Department_id;
  private int   Phone_Number;
  private float Basic_Salary;
  public payadvice(String Employee_Id,String EPF_Number,String Frist_Name,String Last_name,String DOB,String Adress,int Phone_Number,String NIC_Number,String gender,String Bankname,String Account_Number,String Jobtitle,String Salary_Type,float Basic_Salary,String addedDate,String Email ,String DepartmentName,String Department_id )
  {
      this.Employee_Id=Employee_Id;
      this.EPF_Number=EPF_Number;
      this.Frist_Name=Frist_Name;
      this.Last_name=Last_name;
      this.DOB=DOB;
      this.Adress=Adress;
       this.Phone_Number=Phone_Number;
      this.NIC_Number=NIC_Number;
      this.gender=gender;
      this.Bankname=Bankname;
      this.Account_Number=Account_Number;
      this.Jobtitle=Jobtitle;
      this.Salary_Type=Salary_Type;
      this.Basic_Salary=Basic_Salary;
      this.addedDate=addedDate;
      this.Email=Email;
      this.DepartmentName=DepartmentName;
      this.Department_id=Department_id;
     
      
       
  }
  
  
   public String getEmployee_Id()
   {
       return Employee_Id.trim();
   }
   public String getEPF_Number()
   {
       return EPF_Number.trim();
   }
   public String getFrist_Name()
   {
       return Frist_Name.trim();
   }
   public String getLast_name()
   {
       return Last_name.trim();
   }
   public String getDOB()
   {
       return DOB.trim();
   }
   public String getAdress()
   {
       return Adress.trim();
   }
   public int getPhone_Number()
  {
      return Phone_Number;
  }
   public String getNIC_Number()
   {
       return NIC_Number.trim();
   }
   public String getgender()
   {
       return gender.trim();
   }
   public String getBankname()
   {
       return Bankname.trim();
   }
   public String getAccount_Number()
   {
       return Account_Number.trim();
   }
    public String getJobtitle()
   {
       return Jobtitle.trim();
   }
     public String getSalary_Type()
   {
       return Salary_Type.trim();
   }
      public float getBasic_Salary()
  {
      return Basic_Salary;
  }
     public String getaddedDate()
   {
       return addedDate.trim();
   }
     public String getEmail()
   {
       return Email.trim();
   }
      public String getDepartmentName() {
        return  DepartmentName.trim();
    }
       public String getDepartment_id()
   {
       return Department_id.trim();
   }

   
}
 
    
    
    
    

