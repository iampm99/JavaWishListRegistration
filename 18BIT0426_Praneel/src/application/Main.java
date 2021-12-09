package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.application.Application;
import javafx.collections.*;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JAVA DA");
        GridPane Formgrid = loginform();
        loginfunc(Formgrid);
        Scene scene = new Scene(Formgrid, 1500, 800);
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }


    private GridPane loginform() {
      
        GridPane Formgrid = new GridPane();
        Formgrid.setAlignment(Pos.CENTER);
        Formgrid.setPadding(new Insets(40, 40, 40, 40));
        Formgrid.setHgap(5);
        Formgrid.setVgap(5);
        ColumnConstraints column1 = new ColumnConstraints(100, 100, Double.MAX_VALUE);
        column1.setHalignment(HPos.RIGHT);
        ColumnConstraints column2 = new ColumnConstraints(100,100, Double.MAX_VALUE);
        column2.setHgrow(Priority.ALWAYS);

        Formgrid.getColumnConstraints().addAll(column1, column2);

        return Formgrid;
    }

    private void loginfunc(GridPane Formgrid) {
        Label headerLabel = new Label("WISHLIST REGISTRATION");
        headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        Formgrid.add(headerLabel, 0,0,8,1);
        GridPane.setHalignment(headerLabel, HPos.CENTER);
        GridPane.setMargin(headerLabel, new Insets(5,0,40,0));

        Label fullname = new Label("Name : ");
        Formgrid.add(fullname, 0, 2);
        TextField fullName = new TextField();
        fullName.setPrefHeight(40);
        Formgrid.add(fullName, 1, 2);

        Label RN = new Label("Reg No : ");
        Formgrid.add(RN, 0, 3);
        TextField regno = new TextField();
        regno.setPrefHeight(40);
        Formgrid.add(regno, 1, 3);
        
        Label sch = new Label("School : ");
        Formgrid.add(sch, 0, 4);
        TextField school = new TextField();
        school.setPrefHeight(40);
        Formgrid.add(school, 1, 4);

        Label s1 = new Label("1st Subject : ");
        String fs[]={"JAVA","C","Theory Of Computation","Data Structures & Algorithms","Network Information Security","Big Data Analytics","Artificial Intelligence","Robotics","Computer Architecture","Software Testing"};
        Formgrid.add(s1, 0, 5);
        ComboBox Qbox = new ComboBox(FXCollections.observableArrayList(fs));
        Qbox.setPrefHeight(40);
        Formgrid.add(Qbox, 1, 5);
        
        Label s2 = new Label("2nd Subject : ");
        String ss[]={"JAVA","C","Theory Of Computation","Data Structures & Algorithms","Network Information Security","Big Data Analytics","Artificial Intelligence","Robotics","Computer Architecture","Software Testing"};
        Formgrid.add(s2, 0, 6);
        ComboBox Qbox1 = new ComboBox(FXCollections.observableArrayList(ss));
        Qbox1.setPrefHeight(40);
        Formgrid.add(Qbox1, 1, 6);
        
        Label s3 = new Label("3rd Subject : ");
        String ts[]={"JAVA","C","Theory Of Computation","Data Structures & Algorithms","Network Information Security","Big Data Analytics","Artificial Intelligence","Robotics","Computer Architecture","Software Testing"};
        Formgrid.add(s3, 0, 7);
        ComboBox Qbox2 = new ComboBox(FXCollections.observableArrayList(ts));
        Qbox2.setPrefHeight(40);
        Formgrid.add(Qbox2, 1, 7);
        
        Label s4 = new Label("4th Subject : ");
        String fos[]={"JAVA","C","Theory Of Computation","Data Structures & Algorithms","Network Information Security","Big Data Analytics","Artificial Intelligence","Robotics","Computer Architecture","Software Testing"};
        Formgrid.add(s4, 0, 8);
        ComboBox Qbox3 = new ComboBox(FXCollections.observableArrayList(fos));
        Qbox3.setPrefHeight(40);
        Formgrid.add(Qbox3, 1, 8);
        
        Label s5 = new Label("5th Subject : ");
        String fis[]={"JAVA","C","Theory Of Computation","Data Structures & Algorithms","Network Information Security","Big Data Analytics","Artificial Intelligence","Robotics","Computer Architecture","Software Testing"};
        Formgrid.add(s5, 0, 9);
        ComboBox Qbox4 = new ComboBox(FXCollections.observableArrayList(fis));
        Qbox4.setPrefHeight(40);
        Formgrid.add(Qbox4, 1, 9);
        

        Label s6 = new Label("6th Subject : ");
        String sis[]={"JAVA","C","Theory Of Computation","Data Structures & Algorithms","Network Information Security","Big Data Analytics","Artificial Intelligence","Robotics","Computer Architecture","Software Testing"};
        Formgrid.add(s6, 0, 10);
        ComboBox Qbox5 = new ComboBox(FXCollections.observableArrayList(sis));
        Qbox5.setPrefHeight(40);
        Formgrid.add(Qbox5, 1, 10);
     
        Label s7 = new Label("7th Subject : ");
        String ses[]={"JAVA","C","Theory Of Computation","Data Structures & Algorithms","Network Information Security","Big Data Analytics","Artificial Intelligence","Robotics","Computer Architecture","Software Testing"};
        Formgrid.add(s7, 0, 11);
        ComboBox Qbox6 = new ComboBox(FXCollections.observableArrayList(ses));
        Qbox6.setPrefHeight(40);
        Formgrid.add(Qbox6, 1, 11);
      
        Button submitButton = new Button("Submit");
        submitButton.setPrefHeight(40);
        submitButton.setDefaultButton(true);
        submitButton.setPrefWidth(100);

        Formgrid.add(submitButton, 0, 30, 20, 1);
        GridPane.setHalignment(submitButton, HPos.CENTER);
        GridPane.setMargin(submitButton, new Insets(5, 0,5,0));
        
        Button updateButton = new Button("Update Details");
        updateButton.setPrefHeight(40);
        updateButton.setDefaultButton(true);
        updateButton.setPrefWidth(100);

        Formgrid.add(updateButton, 0, 25, 20, 1);
        GridPane.setHalignment(updateButton, HPos.CENTER);
        GridPane.setMargin(updateButton, new Insets(5, 0,5,0));
        
        
        
        final Text actiontarget = new Text();
        GridPane.setHalignment(actiontarget, HPos.CENTER);
        Formgrid.add(actiontarget, 0,35,20, 1);
        submitButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {	
				actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText(fullName.getText()+"'s Wishlist Registered Successfully");
				
				Student s=new Student(fullName.getText(),regno.getText(),school.getText(),(String)Qbox.getValue(),(String)Qbox1.getValue(),(String)Qbox2.getValue(),(String)Qbox3.getValue(),(String)Qbox4.getValue(),(String)Qbox5.getValue(),(String)Qbox6.getValue());
				boolean result = s.InsertStudentRecord();
				
			}
		});
        updateButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event1) {	
				actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText(fullName.getText()+"'s Wishlist Updated Successfully");
				
				Student s=new Student(fullName.getText(),regno.getText(),school.getText(),(String)Qbox.getValue(),(String)Qbox1.getValue(),(String)Qbox2.getValue(),(String)Qbox3.getValue(),(String)Qbox4.getValue(),(String)Qbox5.getValue(),(String)Qbox6.getValue());
				try {
					s.updateStudentDetails();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
    }
    
    public static void main(String[] args) 
    {
        launch(args);
    }
}
class Student{
	private String fullname;
	private String RN;
	private String sch;
	private String s1;
	private String s2;
	private String s3;
	private String s4;
	private String s5;
	private String s6;
	private String s7;
	
	public Student(String fullname, String rN, String sch, String s1, String s2, String s3, String s4, String s5,
			String s6, String s7) {
		this.fullname = fullname;
		this.RN = rN;
		this.sch = sch;
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
		this.s7 = s7;
	}

	
	public boolean InsertStudentRecord() {
		try {
			dbmsconnection dbmsconnect=new dbmsconnection("jdbc:mysql://localhost:3306/finalda","root","");
			Connection con=dbmsconnect.getConnection();
			String sql="insert into da values (?,?,?,?,?,?,?,?,?,?);";
			PreparedStatement stmt=con.prepareStatement(sql);
			stmt.setString(1,fullname);
			stmt.setString(2,RN);
			stmt.setString(3,sch);
			stmt.setString(4,s1);
			stmt.setString(5,s2);
			stmt.setString(6,s3);
			stmt.setString(7,s4);
			stmt.setString(8,s5);
			stmt.setString(9,s6);
			stmt.setString(10,s7);
			
			int i=stmt.executeUpdate();
			if(i>0) {
				return true;
			}
			else {
				return false;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public void updateStudentDetails() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        dbmsconnection dbmsconnect = new dbmsconnection("jdbc:mysql://localhost:3306/finalda","root","");
        Connection con = dbmsconnect.getConnection();
        String sql1 = "UPDATE da SET 'Reg No' = ? , School=? , 'Subject 1'=? ,'Subject 2'=? ,'Subject 3'=? ,'Subject 4'=? ,'Subject 5'=? ,'Subject 6'=? ,'Subject 7'=? where Name = ? ;";
        PreparedStatement stmt1 = con.prepareStatement(sql1);

		stmt1.setString(1,fullname);
		stmt1.setString(2,RN);
		stmt1.setString(3,sch);
		stmt1.setString(4,s1);
		stmt1.setString(5,s2);
		stmt1.setString(6,s3);
		stmt1.setString(7,s4);
		stmt1.setString(8,s5);
		stmt1.setString(9,s6);
		stmt1.setString(10,s7);
        int i = stmt1.executeUpdate();
        if(i>0)
        {
            System.out.println("Record updated sucessfully");
        }else
        {
            System.out.println("No Such record in the Database");
        }
        dbmsconnect.closeConnection(con, stmt1);
    }
	
}

class dbmsconnection
{
    String url;
    String username;
    String password;
    
    public dbmsconnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
	@SuppressWarnings("deprecation")
	public Connection getConnection() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
        Connection con=null;
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        con = DriverManager.getConnection(url,username,password);
        System.out.println("Connection Established Successfully");
        return con;
    }
    
    public void closeConnection(Connection con,Statement stmt) throws SQLException
    {
        stmt.close();
        con.close();
        System.out.println("The connection is closed");
    }
}