

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DepositServlet
 */
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
int amount=0;
    	
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	
    	//Scanner sc=new Scanner("System.in");
    	out.print("<form action='DepositServlet2' method='post'>");
    	out.println("enter amount to deposit");
    	out.println("Amount:<input type='text' name='amt'>");
    	out.println("AmountNumber:<input type='text' name='acc'>");
    	out.print("<input type='submit' value='submit'>");
    	
    	//int amount=sc.nextInt();
    	/*String amot=request.getParameter("amt");
    	int amounts=Integer.parseInt("2344");
    	Login l=new Login();
    	l.setAmount(amounts);
    	Methods m=new Methods();
    	m.deposit(amount);
    	*/
    	
    	
    	
    	}

}
