

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class withdraw_servlet2
 */
@WebServlet("/withdraw_servlet2")
public class withdraw_servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	
    		
    		response.setContentType("text/html");
    		PrintWriter out=response.getWriter();
    		
    		String account=request.getParameter("acc");
    		int account_no=Integer.parseInt(account);
    		
    		String amount=request.getParameter("amt");
    		int amount_no=Integer.parseInt(amount);
    		
    		Methods m=new Methods();
    		m.withdraw(amount_no, account_no);
    		
    		
    		
    	
    	
    	}

}
