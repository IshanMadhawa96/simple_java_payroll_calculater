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
class Logindetails {
 private String loginid,Usertype,username,logindate;
 public   Logindetails(String loginid,String Usertype,String username,String logindate )
 {
 this.loginid=loginid;
 this.Usertype=Usertype;
 this.username=username;
 this.logindate=logindate;
 }
   public String getloginid()
   {
       return loginid.trim();
   }
    public String getUsertype()
   {
       return Usertype.trim();
   }
     public String getusername()
   {
       return username.trim();
   }
      public String getlogindate()
   {
       return logindate.trim();
   }
    
    
    
    
}
