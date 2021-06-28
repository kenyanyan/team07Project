package model;

import dao.customerDAO;

public class LoginLogic {
	public boolean execute() {
		User user = new User("kobe@test.co.jp","12345678","こべ");
		try {
			customerDAO cusDAO = new customerDAO();
			String pass = cusDAO.getPass(user.getname());
			//DAOにアクセスしてユーザIDとパスワード比較の処理追加
			if(user.getPass() == pass ) { // 一致の比較
				System.out.println("seikou");
				return true;
			}else {
				System.out.println("error");
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}

