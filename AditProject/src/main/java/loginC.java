import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class loginC extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		String uname = req.getParameter("user");
		String pass = req.getParameter("pass");
		
		String username = "ram";
		String password ="12345";
		
		if(uname.equals(username) && pass.equals(password)) {
			HttpSession session = req.getSession();
			session.setAttribute("user", uname);
			
			res.sendRedirect("welcome.jsp");
		}
		else {
			res.sendRedirect("login.jsp");
		}
			
	}

}
