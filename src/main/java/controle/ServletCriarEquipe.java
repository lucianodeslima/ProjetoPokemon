package controle;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.IncluiPokemonDAO;
import modelo.Pokemon;

/**
 * Servlet implementation class ServletCriarEquipe
 */
public class ServletCriarEquipe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCriarEquipe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setAttribute("variavelRequestMsgErro", "Erroo");
			Pokemon poke = new Pokemon();
			poke.setIdEquipe(1);
			poke.setId_usuario(1);
			poke.setNome_pokemon(request.getParameter("idSelNome"));
			poke.setHabilidade_pokemon(request.getParameter("idselHabilidade"));
			IncluiPokemonDAO.incluir(poke);
			response.sendRedirect("teste.jsp");
			
			
		}catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("index.html");
		}
	}

}
