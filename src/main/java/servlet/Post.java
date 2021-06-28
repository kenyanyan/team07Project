package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post
 */
@WebServlet("/Post")
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String title = request.getParameter("title");
		String text = request.getParameter("text");
		String largeGenre = request.getParameter("largeGenre");
		String middleGenre = request.getParameter("middleGenre");
		boolean is_title = true;
		boolean is_text = true;
		boolean is_largeGenre = true;
		boolean is_middleGenre = true;

		System.out.println(title);
		System.out.println(text);
		System.out.println(largeGenre);
		System.out.println(middleGenre);
		if (title.equals("")) {
			is_title = false;
			System.out.println("タイトルが入力されていません");
		}
		if (text.equals("")) {
			is_text = false;
			System.out.println("本文が入力されていません");
		}
		if (largeGenre.equals("")) {
			is_largeGenre = false;
			System.out.println("大ジャンルが選ばれていません");
		}
		if (middleGenre.equals("")) {
			is_middleGenre = false;
			System.out.println("中ジャンルが選ばれていません");
		}
		
		request.setAttribute("is_title", is_title);
		//set
		request.setAttribute("is_text", is_text);
		request.setAttribute("is_largeGenre", is_largeGenre);
		request.setAttribute("is_middleGenre", is_middleGenre);
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/jsp/post.jsp");
		dispatcher.forward(request, response);
	}
}
