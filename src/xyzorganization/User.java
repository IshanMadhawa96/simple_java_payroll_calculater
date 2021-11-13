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
class User {
  private String  UserID,FristName,LastName,UserType,Email,UserPassword,gender,Adress,Registerdate;
  private int  Phone_Number;
  public User(String UserID,String FristName,String LastName,String UserType,String Email,String UserPassword,String gender,String Adress,int Phone_Number,String Registerdate )
          {
          
             this.UserID=UserID; 
             this.FristName=FristName; 
             this.LastName=LastName; 
             this.UserType=UserType; 
             this.Email=Email; 
             this.UserPassword=UserPassword; 
             this.gender=gender; 
             this.Adress=Adress; 
             this.Phone_Number=Phone_Number; 
             this.Registerdate=Registerdate; 
            
          }
    public String getUserID()
   {
       return UserID.trim();
   }
      public String getFristName()
   {
       return FristName.trim();
   }
     public String getLastName()
   {
       return LastName.trim();
   } 
      public String getUserType()
   {
       return UserType.trim();
   } 
      public String getEmail()
   {
       return Email.trim();
   } 
    public String getUserPassword()
   {
       return UserPassword.trim();
   } 
     public String getgender()
   {
       return gender.trim();
   }  
   public String getAdress()
   {
       return Adress.trim();
   } 
    public int getPhone_Number()
   {
       return Phone_Number;
   }  
     public String getRegisterdate()
   {
       return Registerdate.trim();
   } 
}
