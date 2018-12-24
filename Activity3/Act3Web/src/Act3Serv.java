

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Act3Serv
 */
@WebServlet("/Act3Serv")
public class Act3Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	Act3Bean act3bean;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("usern");
		String pass = request.getParameter("userpw");
		
		if (uname.equals("mat") && pass.equals("password")){
			response.sendRedirect("/welcome.jsp");
		}
		else {
			response.sendRedirect("/login.jsp");
		}
	}

	

}
