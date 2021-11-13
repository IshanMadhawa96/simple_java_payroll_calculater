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
class viewpaysheet {
  private  String PaysheetID,EPF_Number,Frist_Name,Last_name,Email,AccountNumber,ReleseDate,Salary_Type,Jobtitle,DepartmentName,Employee_Id,Department_id;
  private float  BasicSalary,SfiftAllowance,AttendenceBones,ProIncentive,OT,TotalEraning,EPFEmployee,Tax,FeAdvInst,TotalDeducations,NetSalary,EPFEmployer,ETFEmployer,OTRate,OTHoures,StampDuty;
  public  viewpaysheet(String  PaysheetID,String EPF_Number,String Frist_Name,String Last_name,String Email,String AccountNumber,String ReleseDate,float  BasicSalary,float SfiftAllowance,float AttendenceBones,float ProIncentive,float OT,float TotalEraning,float EPFEmployee,float Tax,float FeAdvInst,float TotalDeducations,float NetSalary,float EPFEmployer,float ETFEmployer,float OTRate,float OTHoures,float StampDuty,String Salary_Type,String Jobtitle,String DepartmentName,String Employee_Id,String Department_id)
  {
      this.PaysheetID=PaysheetID;
      this.EPF_Number=EPF_Number;
      this.Frist_Name=Frist_Name;
      this.Last_name=Last_name;
      this.Email=Email;
      this.AccountNumber=AccountNumber;
      this.ReleseDate=ReleseDate;
      this.BasicSalary=BasicSalary;
      this.SfiftAllowance=SfiftAllowance;
      this.AttendenceBones=AttendenceBones;
      this.ProIncentive=ProIncentive;
      this.OT=OT;
      this.TotalEraning=TotalEraning;
      this.EPFEmployee=EPFEmployee;
      this.Tax=Tax;
      this.FeAdvInst=FeAdvInst;
      this.TotalDeducations=TotalDeducations;
      this.NetSalary=NetSalary;
      this.EPFEmployer=EPFEmployer;
      this.ETFEmployer=ETFEmployer;
      this.OTRate=OTRate;
      this.OTHoures=OTHoures;
      this.StampDuty=StampDuty;
      this.Salary_Type=Salary_Type;
      this.Jobtitle=Jobtitle;
      this.DepartmentName=DepartmentName;
      this.Employee_Id=Employee_Id;
      this.Department_id=Department_id;  
  }
  public String getPaysheetID()
   {
       return PaysheetID.trim();
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
   public String getEmail()
   {
       return Email.trim();
   }   
   public String getAccountNumber()
   {
       return AccountNumber.trim();
   }   
   
    public String getReleseDate()
   {
       return ReleseDate.trim();
   }   
    public float getBasicSalary()
   {
       return BasicSalary;
   }   
    public float getSfiftAllowance()
   {
       return SfiftAllowance;
   }   
    public  float getAttendenceBones()
   {
       return AttendenceBones;
   }   
    public float getProIncentive()
   {
       return ProIncentive;
   }   
    public float getOT()
   {
       return OT;
   }   
    public float getTotalEraning()
   {
       return TotalEraning;
   }   
    public float getEPFEmployee()
   {
       return EPFEmployee;
   }   
    public float getTax()
   {
       return Tax;
   }   
    public float getFeAdvInst()
   {
       return FeAdvInst;
   }   
    public float getTotalDeducation()
   {
       return TotalDeducations;
   }   
    public float getNetSalary()
   {
       return NetSalary;
   }   
    public float getEPFEmployer ()
   {
       return EPFEmployer;
   }   
    public float getETFEmployer()
   {
       return ETFEmployer;
   }   
    public float getOTRate()
   {
       return OTRate;
   }   
    public float getOTHoures()
   {
       return OTHoures;
   }   
    public float getStampDuty()
   {
       return StampDuty;
   }   
    public String getSalary_Type()
   {
       return Salary_Type.trim();    
    }
    public String getJobtitle()
   {
       return Jobtitle.trim();    
    }
    public String getDepartmentName()
   {
       return DepartmentName.trim();
   }  
   public String getEmployee_Id()
   {
       return Employee_Id.trim();
   }   
  public String getDepartment_id()
   {
       return Department_id.trim();
   }     
    
    
}