import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

import org.omg.CORBA.Request;


public class Methods
{int amount=0;
int balance=0;
	public static Connection getConnection()
	{
		Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
		
	} catch (Exception e) {e.printStackTrace();
	}
	return con;
		
	}
	
	
public static void Save(Login l)
{
Connection con=getConnection();
int ac=15677;
try {
	PreparedStatement ps=con.prepareStatement("insert into login(AccountNumber,Password) values(?,?)");
	ps.setInt(1,ac++);
	System.out.println(l.getAccountNumber());
	ps.setString(2,l.getPassword());
	ps.executeUpdate();
	con.close();
} catch (Exception e) {
	e.printStackTrace();
}
}




public void deposit(Login l)
{
	Connection con=getConnection();
//System.out.println(amount);
	try {
		
		  Statement cs = con.createStatement();
		  ResultSet rs = cs.executeQuery("select amount from login where AccountNumber='"+l.getAccountNumber()+"'");
		  rs.next();
		 balance = rs.getInt(1);
		 
		balance = balance + l.getAmount();
		cs.executeUpdate("update login set amount='"+balance+"'where AccountNumber='"+l.getAccountNumber()+"'")	;
		PreparedStatement ps=con.prepareStatement("insert into deposit values(?,?)");
		ps.setInt(1,l.getAccountNumber());
		ps.setInt(2,l.getAmount());
	ps.executeUpdate();
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
	
}

public void withdraw(Login l)
{Connection con=getConnection();
try {
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("select amount from login where AccountNumber='"+l.getAccountNumber()+"'");
	rs.next();
	balance=rs.getInt(1);
	if(balance<l.getAmount())
	{
		System.out.println("insufficient funds");
	}
	else{
	balance=balance-l.getAmount();
	s.executeUpdate("update login set amount='"+balance+"' where AccountNumber='"+l.getAccountNumber()+"'");
	
	
	PreparedStatement ps = con.prepareStatement("insert into withdraw values(?,?)");

	ps.setInt(1,l.getAccountNumber());
	ps.setInt(2, l.getAmount());
	
	ps.executeUpdate();
	
	
	
	//s.executeUpdate("insert into withdraw values('"+l.getAccountNumber()+"','"+l.getAmount()+"'");
	}
} catch (Exception e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}



      }

public void delete()


{
	Connection con=getConnection();
	try {
     Statement ps=con.createStatement();
     ps.executeUpdate("delete from login");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}