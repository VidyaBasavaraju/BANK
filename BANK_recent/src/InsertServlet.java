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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String name=request.getParameter("name");
	String mobile=request.getParameter("mob");
	String email=request.getParameter("mail");
	ACCount a=new ACCount();
	a.setName(name);
	a.setMobile(mobile);
	a.setEmail(email);
	
	Methods m=new Methods();
	m.save(a);
	RequestDispatcher rd=request.getRequestDispatcher("index2.html");
	rd.forward(request, response);
	}

}
