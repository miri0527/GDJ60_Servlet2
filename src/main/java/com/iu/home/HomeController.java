
package com.iu.home;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeController
 */

public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Hello Miri");
//		String method=request.getMethod();
//		System.out.println("Method: " + method);
//		StringBuffer sb= request.getRequestURL();
//		System.out.println("URL: " + sb);
//		String uri = request.getRequestURI();
//		System.out.println("URI: " + uri);
//		Cookie [] cookies =  request.getCookies();
//		for (Cookie cookie : cookies) {
//			System.out.println("CookieName:" + cookie.getName());
//			System.out.println("CookieValue: " + cookie.getValue());
//		}
//		String context = request.getContextPath();
//		System.out.println("ContextPath: " + context);
//		
//		String name= request.getParameter("name");
//		System.out.println("Name: " + name);
//		
//		String age = request.getParameter("age");
//		if(age !=null) {
//			int a = Integer.parseInt(age);
//			System.out.println("Age: " + a*2);
//		}
//		
//		String [] moneys = request.getParameterValues("money");
//		if(moneys !=null) {
//			for (String string : moneys) {
//				System.out.println("Moneys: " + string);
//			}
//		}
//		
		
//		PrintWriter out = response.getWriter();
//		out.println("<h1>MIRI PAGE </h1>");
//		out.println("<h2>Header2</h2>");
//		
//		out.close();
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/home.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
