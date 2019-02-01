package fr.afpa.jee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InscriptionServlet
 */
public class InscriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InscriptionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/inscription.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String civiliteString = request.getParameter("civilite");
		System.out.println(civiliteString);
	/*	if(!civiliteString.contentEquals("")) {
			int civilite = Integer.parseInt(civiliteString);
		}
		int civilite =  request.getParameter(civiliteString);*/
		int civilite = Integer.parseInt(civiliteString);
		String surname = request.getParameter("surname");
		String prenom = request.getParameter("prenom");
		String naissance = request.getParameter("naissance");
		/*String numeroRueString = request.getParameter("numeroRue");
		int numeroRue= Integer.parseInt("numeroRueString");*/
		String numeroRue = request.getParameter("numeroRue");
		String ville = request.getParameter("ville");
		String departement = request.getParameter("departement");
		String pays = request.getParameter("pays");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String comments = request.getParameter("comments");

		
		request.setAttribute("civilite", civilite);
		request.setAttribute("surname", surname);
		request.setAttribute("prenom", prenom);
		request.setAttribute("naissance", naissance);
		request.setAttribute("numeroRue", numeroRue);
		request.setAttribute("ville", ville);
		request.setAttribute("departement", departement);
		request.setAttribute("pays", pays);
		request.setAttribute("telephone", telephone);
		request.setAttribute("email", email);
		request.setAttribute("comments", comments);
	
		//this.getServletContext().getRequestDispatcher("/WEB-INF/pages/inscriptionOk.jsp").forward(request, response);
		if(email.contains("@")){		
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/inscriptionOk.jsp").forward(request, response);
		}else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/inscription.jsp").forward(request, response);
System.out.println("erreur");
		}

		
		
		
	}

}
