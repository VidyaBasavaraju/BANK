

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check_Balance2
 */
@WebServlet("/Check_Balance2")
public class Check_Balance2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   	
   	
   		response.setContentType("text/html");
   	   	PrintWriter out=response.getWriter();
   	   	String accno=request.getParameter("acc");
   	int account_number=Integer.parseInt(accno);
   //	System.out.println(account_number);
   	Methods m=new Methods();
   	int amount=m.Checking(account_number);
	out.print("balance is:"+amount);
   	
   	
   	
   	}

}
