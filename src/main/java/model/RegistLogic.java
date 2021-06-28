package model;

import dao.customerDAO;

public class RegistLogic {
	public boolean execute(User user) {
		try {
			customerDAO dao = new customerDAO();
			return dao.setUser(user);	//DB処理が正常の場合trueを返す
		}catch(Exception e) {
			return false;
		}
	}
}
