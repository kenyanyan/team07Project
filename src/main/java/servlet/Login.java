package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ログイン認証処理を書く

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		User user = new User(id, pw);

/*			LoginLogic loginLogic = new LoginLogic();
			boolean isLogin = loginLogic.execute(user);*/
				

		boolean isLogin = true;
		
				if (isLogin) {
					HttpSession session = request.getSession();
					session.setAttribute("loginUser", user);
				} else if (!isLogin == equals("")) {
	}
				request.getRequestDispatcher("/WEB-INF/jsp/main.jsp").forward(request, response);

}
}
