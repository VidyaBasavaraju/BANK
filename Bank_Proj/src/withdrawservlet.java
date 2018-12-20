

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class withdrawservlet
 */
@WebServlet("/withdrawservlet")
public class withdrawservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    		
    		int amount=0;
   	
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	out.print("<form action='withdrawservlet2' method='post'>");
    	 
    	out.print("enter the amount:");
    	out.print("Amount:<input type='text' name='amt'>");
    	out.print("enter the account number:");
    	out.print("account:<input type='text' name='acc'>");
    	out.print("<input type='submit'>");
    	   	/*RequestDispatcher rd=request.getRequestDispatcher("withdrawservlet2");
    	rd.forward(request, response);*/
    	
    	}

}
