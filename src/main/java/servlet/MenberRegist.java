package servlet;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.RegistLogic;
import model.User;

/**
 * Servlet implementation class MenberRegist
 */
@WebServlet("/MenberRegist")
public class MenberRegist extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MenberRegist() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("is_mail", 0);
		request.setAttribute("is_pass", true);
		request.setAttribute("is_pass2", true);
		request.setAttribute("is_name", true);
		request.setAttribute("is_db",true);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/regist.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//文字コードの設定
		response.setContentType("text/html;charset=Shift_JIS");
		request.setCharacterEncoding("Shift_JIS");
		//会員登録時処理を書く
		String mail = request.getParameter("mail");
		String pass = request.getParameter("pass");
		String pass2 = request.getParameter("pass2");
		String name = request.getParameter("name");

		//入力チェックフラグ
		int is_mail = 0; //正常 0  メールアドレス未入力 1  メールアドレスの書式があっていない 2 
		boolean is_pass = true;
		boolean is_pass2 = true;
		boolean is_name = true;
		boolean is_check = true; //全てのチェックが通っているか判定 
		//正規表現メール
		String pattern = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";
		Pattern p = Pattern.compile(pattern);
		

		//System.out.println(pass.length()+"passの長さ");

		//パスワードのチェック
		if (pass.length() < 8) {
			System.out.println("8文字未満です");
			is_pass = false;
			is_check = false;
		} else if (!pass.equals(pass2)) {
			System.out.println("passが不一致");
			is_pass2 = false;
			is_check = false;
		}

		//ニックネームの空値チェック
		if (name.equals("")) {
			System.out.println("ニックネームが入っていません");
			is_name = false;
			is_check = false;
		}

		//メールアドレス空値チェック
		if (mail.equals("")) {
			System.out.println("メールアドレスが入っていません");
			is_mail = 1;
			is_check = false;
		} else if (!p.matcher(mail).find()) {
			is_mail = 2;
			is_check = false;
		}

		if (is_check) {
			//全てのチェックが通ったならば会員登録処理を行う
			User user = new User(mail, pass, name);
			RegistLogic registLogic = new RegistLogic();
			if (registLogic.execute(user)) {
				//DBにユーザー情報が正しく登録された場合
				request.setAttribute("is_check", true);
				RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
				dispatcher.forward(request, response);
			} else {
				//DBの保存に失敗したとき
				request.setAttribute("is_mail", 0);
				request.setAttribute("is_pass", true);
				request.setAttribute("is_pass2", true);
				request.setAttribute("is_name", true);
				request.setAttribute("is_db", false);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/regist.jsp");
				dispatcher.forward(request, response);
			}
		} else {
			//どれかのチェックが失敗したとき
			//リクエストスコープにフラグ値登録
			request.setAttribute("is_mail", is_mail);
			request.setAttribute("is_pass", is_pass);
			request.setAttribute("is_pass2", is_pass2);
			request.setAttribute("is_name", is_name);
			request.setAttribute("is_db",true);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/regist.jsp");
			dispatcher.forward(request, response);
		}

	}

}
