package com.myProject.service;
import java.util.ArrayList;

import org.apache.catalina.User;

import com.myProject.dao.BoardDAO;
import com.myProject.vo.Board;

public class UserService {
	
	private static UserService service = null;
	private static BoardDAO dao = null;
    
	private UserService() {
		
	}
	
	public static UserService getInstance() {
		if(service == null) {
			service = new UserService();
			dao = BoardDAO.getInstance();
		}
		return service;
	}

	public ArrayList<Board> getUsers() {
		return dao.getUsers();
	}

	public void insertBoard(Board board) {
		dao.insertBoard(board);
		
	}

}