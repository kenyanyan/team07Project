package servlet;

import java.io.IOException;
import java.sql.Blob;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.postDAO;
import model.User;
import model.postLogic;

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
		request.setAttribute("is_title", true);
		request.setAttribute("is_text", true);
		request.setAttribute("is_largeGenre", true);
		request.setAttribute("is_middleGenre", true);
		request.getRequestDispatcher("/WEB-INF/jsp/post.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
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
			System.out.println("??????????????????????????????????????????");
		}
		if (text.equals("")) {
			is_text = false;
			System.out.println("????????????????????????????????????");
		}
		if (largeGenre.equals("")) {
			is_largeGenre = false;
			System.out.println("??????????????????????????????????????????");
		}
		if (middleGenre.equals("")) {
			is_middleGenre = false;
			System.out.println("??????????????????????????????????????????");
		}
		if (is_title == true && is_text == true && is_largeGenre == true && is_middleGenre == true) {

			HttpSession session = request.getSession();
			User user = (User) session.getAttribute("loginUser");
			Timestamp date = null;
			Blob image = null;

			model.Post post = new model.Post(user.getid(), 1, 1, title, text, image);
			postLogic pL = new postLogic();

			boolean isPost = pL.execute(post);
			if (isPost == true) {
				System.out.println("aaa");

				request.getRequestDispatcher("/WEB-INF/jsp/main.jsp").forward(request, response);
			}

			//TODO: ????????????????????????????????????????????????
		} else {
			request.setAttribute("is_title", is_title);
			request.setAttribute("is_text", is_text);
			request.setAttribute("is_largeGenre", is_largeGenre);
			request.setAttribute("is_middleGenre", is_middleGenre);
			System.out.println("sss");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/post.jsp");
			dispatcher.forward(request, response);
		}
	}
}