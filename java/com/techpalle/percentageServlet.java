package com.techpalle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class percentageServlet
 */
@WebServlet("/percentage")
public class percentageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public percentageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int marks1=Integer.parseInt(request.getParameter("tbMath"));
		int marks2=Integer.parseInt(request.getParameter("tbPhysics"));
		int marks3=Integer.parseInt(request.getParameter("tbChemistry"));
		int marks4=Integer.parseInt(request.getParameter("tbBio"));
		
		int avg=(marks1+marks2+marks3+marks4)/4;
		String result="";
		if(avg<35) {
			result="fail";
		}
		else if(avg<60) {
			result="second class";
		}
		else if(avg<75) {
			result="first class";
		}
		else  {
			result="distinction";
		}
		request.setAttribute("final_result", result);
		RequestDispatcher r=request.getRequestDispatcher("display.jsp");
		
		
		
		
		r.forward
		(request, response);
	}

}
