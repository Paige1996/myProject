package com.myProject.Controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.User;

import com.myProject.service.UserService;
import com.myProject.vo.Board;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L; // test

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		String view = null;
		String pw = null;
		String idx = null;
		User user = null;
		UserService userService = null;
//		HttpSession session = null;
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		switch (command) {
		case  "/board-list.do":
			userService = UserService.getInstance();
			ArrayList<Board> list = userService.getUsers();
			view = "board/list";
			request.setAttribute("list", list);
			break; 
		case "/board-insert.do":
			view ="board/startNewBoard";
			break; 
			
		case "/board-insert-process.do":
			//session = request.getSession();
			Board board = new Board();
			//board.setU_idx(session.getAttribute(""));
			board.setB_title(request.getParameter("b_title"));
			board.setB_content(request.getParameter("b_content"));
			board.setU_idx(7);
			
		//	board.setB_date(request.getParameter("b_date"));
		//	board.setB_writer(request.getParameter("b_writer"));
		//	board.setB_view(request.getParameter("b_view"));
			
			userService = UserService.getInstance();
			userService.insertBoard(board);
   	       	view = "board/startNewBoard-result";
   	       	break;

		}
		RequestDispatcher rd = request.getRequestDispatcher(view+".jsp");
		rd.forward(request, response);
	}

}