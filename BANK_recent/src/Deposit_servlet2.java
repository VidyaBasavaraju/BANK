

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Deposit_servlet2
 */
@WebServlet("/Deposit_servlet2")
public class Deposit_servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   	
   	response.setContentType("text/html");
   	PrintWriter out=response.getWriter();
   	String Account_no=request.getParameter("acc");
   	int account=Integer.parseInt(Account_no);
   	String amount=request.getParameter("amt");
   	int amount_no=Integer.parseInt(amount);
   	ACCount a=new ACCount();
   	a.setAmount(amount_no);
   	Methods m=new Methods();
   	m.Deposit(amount_no,account);
   	
   	
   	
   	
   	}

}
