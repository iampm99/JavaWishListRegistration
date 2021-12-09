package application;

import java.io.*;  
import java.sql.*;  
  
public class Admin {  
public static void main(String[] args) {  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/finalda","root","");  
              
PreparedStatement ps=con.prepareStatement("SELECT `Reg No`,COUNT(Name) FROM da WHERE `Subject 1`=\"C\" OR `Subject 2`=\"C\" OR `Subject 3`=\"C\" OR `Subject 4`=\"C\" OR `Subject 5`=\"C\" OR `Subject 6`=\"C\" OR `Subject 7`=\"C\";");  
ResultSet rs=ps.executeQuery();  
rs.next();//now on 1st row  
              
Clob c=rs.getClob(2);  
Reader r=c.getCharacterStream();              
              
FileWriter fw=new FileWriter("C:\\Users\\Praneel\\Desktop\\countsubject.txt");  
              
int i;  
while((i=r.read())!=-1)  
fw.write((char)i);  
              
fw.close();  
con.close();  
              
System.out.println("Successfully Saved");  
}catch (Exception e) {e.printStackTrace();  }  
}  
}  