package com.laptrinhjava.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjava.service.ICategoryService;

@WebServlet(urlPatterns= "/trang-chu") 

public class HomeController extends HttpServlet {

	@Inject
	private ICategoryService categoryService ;
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("categories", categoryService.finlAll());
		
		//Muon servlet tra ve view thì thông qua RequestDispatcher bang cú pháp: 
		request.getRequestDispatcher("/views/web/home.jsp").forward(request, response);
		
	}

}
