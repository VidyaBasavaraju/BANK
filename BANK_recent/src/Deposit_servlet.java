

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Deposit_servlet
 */
@WebServlet("/Deposit_servlet")
public class Deposit_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  	response.setContentType("text/html");
  	PrintWriter out=response.getWriter();
  	out.print("<form action='Deposit_servlet2' method='post'>");
  	out.print("Enter Account number:<input type='text' name='acc'>");
  	out.println("Enter Amount:<input type='text' name='amt'>");
  	out.print("<input type='submit' value='submit'>");
  	out.print("</form>");
  	
  	
  	
  	}

}
