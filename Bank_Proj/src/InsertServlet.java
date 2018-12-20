

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   		response.setContentType("text/html");
   		PrintWriter out=response.getWriter();
   		
   		String account=request.getParameter("acc");
   		int sacc=Integer.parseInt(account);
   		//String Name=request.getParameter(arg0)
   		String password=request.getParameter("pass");
   	
   		Login l=new Login();
   	l.setAccountNumber(sacc);
   	l.setPassword(password);
   	System.out.println(l);
   		Methods.Save(l);
   		
   		RequestDispatcher rd=request.getRequestDispatcher("index2.html");
   		rd.forward(request,response);
   		
   	}

}
