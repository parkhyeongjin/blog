package com.cos.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.action.Action;
import com.cos.util.Script;

public class MemberLogoutAction implements Action{
	private static String naming = "MemberLogoutAction : ";
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "main.jsp";
		
		HttpSession session = request.getSession();
		session.removeAttribute("id");
		Script.moving(response, "로그아웃 성공", url);
	}

}
