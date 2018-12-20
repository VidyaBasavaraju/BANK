

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class withdraw_servlet
 */
@WebServlet("/withdraw_servlet")
public class withdraw_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   	
   	
   	response.setContentType("text/html");
   	PrintWriter out=response.getWriter();
   	out.print("<form action='withdraw_servlet2' method='post'>");
   	out.print("enter account number:<input type='text' name='acc'>");
   	out.print("enter amount:<input type='text' name='amt'>");
   	out.print("<input type='submit'value='submit'>");
   	out.print("</form>");
   	}

}
