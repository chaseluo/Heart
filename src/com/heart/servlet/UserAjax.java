package com.heart.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.heart.entity.Mem_User;

import net.sf.json.JSONObject;

public class UserAjax extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	/**
	 * ajax用户数据
	 * */
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setHeader("content-type","text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		JSONObject json = new JSONObject();
		Mem_User find = new Mem_User();
		find.setUser_Id(1);
		find.setUser_Name("唐小云");
		find.setUser_Level(2);
		if (null!=find) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("name", find.getUser_Name());
			map.put("userId", find.getUser_Id());
			map.put("userLevel", find.getUser_Level());
			json.put("data", map);
		}else{
			json.put("data", "no");
		}
		json.put("result", "ok");
		out.print(json.toString());
		out.flush();
		out.close();
	}

}
