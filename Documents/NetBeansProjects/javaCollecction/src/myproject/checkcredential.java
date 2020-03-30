/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.sql.*;

/**
 *
 * @author vijay
 */
public class checkcredential {
    Connector con=new Connector();
  public boolean checkuser(String name,String password)
    {
        boolean status=false;
        try{
            
        Connection co=con.getConnection();
            System.out.println("hello"+co);
        Statement st=co.createStatement();
            ResultSet rs=st.executeQuery("select *from register where Name='"+name+"'and Password='"+password+"' ");
       
        while(rs.next())
        {
            if(rs!=null)
        {
        status=true;   
        }
        }
        }
        catch(Exception e)
        {
            e.getStackTrace().toString();
        }
        return status;
    }
}
