package jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet (loadOnStartup = 1, urlPatterns = "/jspfile")
public class DisplayServlet extends HttpServlet {
	public DisplayServlet() {
System.out.println("default const of DisplayServlet");	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method");
		String first=req.getParameter("first");
		String last=req.getParameter("last");
		String gender=req.getParameter("gender");
		String reason=req.getParameter("reason");
		String adress=req.getParameter("address");
		
		System.out.println(first);
		System.out.println(last);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(adress);
		
		RequestDispatcher request=req.getRequestDispatcher("Display.jsp")	;
	req.setAttribute("first", first);
	req.setAttribute("last", last);
	req.setAttribute("gender", gender);
	req.setAttribute("reason", reason);
	req.setAttribute("adress", adress);
	request.forward(req, resp);
	
		
	}

}
