

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class withdrawservlet2
 */
@WebServlet("/withdrawservlet2")
public class withdrawservlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	
    	
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	
    	String amot=request.getParameter("amt");
    	int amounts=Integer.parseInt(amot);
    	String account=request.getParameter("acc");
    	int accountno=Integer.parseInt(account);
    	//System.out.println(amot);
    	//System.out.println(amounts);
    	Login l=new Login();
    	l.setAmount(amounts);
    	l.setAccountNumber(accountno);
    	Methods m=new Methods();
    	m.withdraw(l);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	}

}
