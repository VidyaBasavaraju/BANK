

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check_Balance
 */
@WebServlet("/Check_Balance")
public class Check_Balance extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   	int amount=0;
   	response.setContentType("text/html");
   	PrintWriter out=response.getWriter();
   	out.print("<form action='Check_Balance2' method='post'>");
   	out.print("Enter account number:");
   	out.print("<input type='text' name='acc'>");
   	out.print("<input type='submit' value='submit'>");
   	out.print("</form>");
   	out.print("balance is:"+amount);
   	
   	
   	
   	
   	}

}
