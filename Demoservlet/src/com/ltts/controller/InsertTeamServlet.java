package com.ltts.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ltts.dao.teamdao;
import com.ltts.model.team;

/**
 * Servlet implementation class InsertTeamServlet
 */
@WebServlet("/InsertTeamServlet")
public class InsertTeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertTeamServlet() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		    PrintWriter out = response.getWriter(); 
		    int id=Integer.parseInt(request.getParameter("tid"));
			String tname=request.getParameter("tname");
			String oname=request.getParameter("owname");
			String cname=request.getParameter("cname");
			team t=new team(id,tname,oname,cname);
			System.out.println("Inside Servlet: "+t);
			teamdao td=new teamdao();
			boolean b=false;
			RequestDispatcher rd=null;
			try {
				b=td.insertteam(t); // Control TRanfers to Dao file
				rd=request.getRequestDispatcher("success.html");
				rd.forward(request, response);
				//System.out.println("Successfully Inserted...");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				out.write("Already Player id Used: "+e);
				rd=request.getRequestDispatcher("addteam1.html");
				rd.include(request, response);
				e.printStackTrace();
			}
	}

}
