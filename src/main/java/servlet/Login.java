package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		request.setAttribute("is_check", true);
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ログイン認証処理を書く
		
		

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		User user = new User(id, pw);
		System.out.println(user.getid() + ":" + user.getPass());
		LoginLogic loginLogic = new LoginLogic();
		boolean isLogin = loginLogic.execute(user);
		System.out.println(id + " : " + pw);

		if (isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", user);
			request.getRequestDispatcher("/WEB-INF/jsp/main.jsp").forward(request, response);
		} else {
			request.setAttribute("is_check", false);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}
}
