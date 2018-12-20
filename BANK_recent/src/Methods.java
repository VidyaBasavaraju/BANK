import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Methods 
{Connection con;
	public Connection getConnection()
	{

		try {	
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/BANK_DB","root","");
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
		
	}
public void save(ACCount a)
{
	con=getConnection();
	try {
		PreparedStatement ps=con.prepareStatement("insert into Create_AC(NAME,MOBILE,Email) values(?,?,?)");
		ps.setString(1,a.getName());
		System.out.println(a.getName());
		ps.setString(2,a.getMobile());
		ps.setString(3,a.getEmail());
		ps.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
public int Checking(int AccountNumber)
{int amount=0;
	con=getConnection();
	System.out.println(AccountNumber);
	try {
		PreparedStatement ps=con.prepareStatement("select amount from create_ac where AccountNumber=?");
		ps.setInt(1,AccountNumber);
		ResultSet rs= ps.executeQuery();
		if(rs.next())
	amount=	rs.getInt(1);
	System.out.println(amount);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return amount;
}
public int Deposit(int amount,int AccountNumber)
{
	 Connection con=getConnection();
	 int balance=0;
	try {
		Methods m=new Methods();
		 balance=m.Checking(AccountNumber);
		balance=balance+amount;
		Statement s=con.createStatement();
        s.executeUpdate("update create_ac set amount='"+balance+"'where AccountNumber='"+AccountNumber+"'");
	} catch (Exception e1) {
		e1.printStackTrace();
	}
	
	return balance;
	
}




public int withdraw(int amount,int Accountnumber)
{
	int balance=0;
	Connection con=getConnection();
	Methods m=new Methods();
	int newamt=m.Checking(Accountnumber);
	
	if(newamt>amount)
	{
		newamt=newamt-amount;
		Statement s;
		try {
			
			s = con.createStatement();
			 s.executeUpdate("update create_ac set amount='"+newamt+"'where AccountNumber='"+Accountnumber+"'");
				
				
		} catch (Exception e) {
			e.printStackTrace();
		}
       }
	
	
	return newamt;
	
}




}