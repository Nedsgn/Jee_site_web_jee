package fr.afpa.jee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//on est en train de fair eune formulaire donc on fait do post, le nombre de parametre avec le get est limité
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");//c'est le name de l'input submit dans le jsp
		String password = request.getParameter("password");//c'est le name de l'input password dans le jsp
		
		System.out.println("login:" + login);
		
		System.out.println("password : " + password);
		System.out.println("coucou");
		
		request.setAttribute("login", login);
		request.setAttribute("password", password);
		
		if(login.contentEquals("admin")&& password.equals("admin")) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/loginOk.jsp").forward(request, response);
		}else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
			System.out.println("recommencez");
		}
		
		

	}

}
