package servlet;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("/WEB-INF/jsp/regist.jsp");
		dispatcher.forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//会員登録時処理を書く
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String mail = request.getParameter("mail");
		String pass = request.getParameter("pass");
		String pass2 = request.getParameter("pass2");
		String name = request.getParameter("name");
		
		boolean is_mail =true;
		
		
		//System.out.println(pass.length()+"passの長さ");
		
		//パスワードのチェック
		if (pass.length() < 8) {
			System.out.println("8文字未満です");
			is_mail = false;
		}
		
		if (pass.equals(pass2)) {
			System.out.println("passが一緒");
		} 
		else{
			System.out.println("passが不一致");
		}
		
		//ニックネームの空値チェック
		
		if (name.equals("")) {
			System.out.println("ニックネームが入っていません");
		} else{
			System.out.println("ニックネームが入っています");
		}
		
		//メールアドレス空値チェック
		if (mail.equals("")) {
			System.out.println("メールアドレスが入っていません");
		} else{
			System.out.println("メールアドレスが入っています");
		}
		//正規表現
		
		String pattern = "^([a-zA-Z0-9])+([a-zA-Z0-9\\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\\._-]+)+$";
	    Pattern p = Pattern.compile(pattern);
		
	    if (p.matcher(mail).find()) {
	        System.out.println(mail + "はメールアドレスです");
	     } else {
	        System.out.println(mail + "はメールアドレスではありません");
	     }
	
		
		
		//System.out.println(mail);
		//System.out.println(pass);
		//System.out.println(pass2);
		//System.out.println(name);
	}

}
