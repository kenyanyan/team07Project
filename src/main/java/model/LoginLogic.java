package model;

import dao.customerDAO;

public class LoginLogic {
	public boolean execute(User user) {
		try {
			customerDAO cusDAO = new customerDAO();
			String pass = cusDAO.getPass(user.getname());
			//DAOにアクセスしてユーザIDとパスワード比較の処理追加
			if (user.getPass() == pass) { // 一致の比較

				return true;
			} else {

				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}
