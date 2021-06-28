package model;

import dao.customerDAO;

public class LoginLogic {
	public boolean execute(User user) {
		try {
			System.out.println("execute実行");
			customerDAO cusDAO = new customerDAO();
			System.out.println("user.getid : "+user.getid());
			String pass = cusDAO.getPass(user.getid());
			//DAOにアクセスしてユーザIDとパスワード比較の処理追加
			System.out.println("DB : "+pass);
			if (user.getPass().equals(pass)) { // 一致の比較

				return true;
			} else {

				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}
