package model;

import dao.postDAO;

public class postLogic {
	public boolean execute(Post post) {
		try {
			postDAO posDAO = new postDAO();
			posDAO.doPost(post);
			
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
}
