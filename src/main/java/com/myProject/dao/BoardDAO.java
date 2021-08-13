package com.myProject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.myProject.database.DBConnection;
import com.myProject.vo.Board;

public class BoardDAO {
	
	private static BoardDAO dao = null;
    
	private BoardDAO() {
		
	}

	
	
	public static BoardDAO getInstance() {
		if(dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}

	public ArrayList<Board> getUsers() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Board> list = null;
		
		try {
			conn = DBConnection.getConnection();
			String query = "select * from user";
	       	pstmt = conn.prepareStatement(query);
	        rs = pstmt.executeQuery();
	        list = new ArrayList<Board>();

	        while(rs.next()){     
	        	Board board = new Board();
       	       	board.setB_idx(rs.getInt("b_idx"));
       	       	board.setB_title(rs.getInt("b_title"));
       	       	board.setB_content(rs.getInt("b_content"));
       	       	board.setb_date(rs.getString("b_date"));
       	       	board.setB_writer(rs.getInt("b_writer"));
       	       	board.setB_view(rs.getString("b_view"));
       	       	board.setU_idx(rs.getString("u_idx"));
       	       	list.add(board);
	        }
		} catch (Exception e) {
			
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
}