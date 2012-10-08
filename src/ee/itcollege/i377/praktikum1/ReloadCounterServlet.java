package ee.itcollege.i377.praktikum1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReloadCounterServlet
 */
public class ReloadCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReloadCounterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer counter = (Integer)request.getSession().getAttribute("counter");
		if(counter == null) {
			counter = new Integer(0);
		}
		else {
			counter = counter + 1;
		}
		request.getSession().setAttribute("counter", counter);
		response.getOutputStream().println("Ccounter value: "+counter);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
