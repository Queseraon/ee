package com.ee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ee.common.CommonView;
import com.ee.service.TestInfoService;
import com.ee.service.impl.TestInfoServiceImpl;
import com.google.gson.Gson;

@WebServlet("/test-info/*")
public class TestInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TestInfoService tiService = new TestInfoServiceImpl();
	private Gson gson = new Gson();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = CommonView.getCmd(request);
		String json = "";
		if("list".equals(cmd)) {
			json = gson.toJson(tiService.getTestInfos(null));
		}
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
