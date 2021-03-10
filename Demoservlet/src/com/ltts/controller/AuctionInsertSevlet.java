package com.ltts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ltts.dao.AuctionDao;
import com.ltts.model.Auction;

/**
 * Servlet implementation class AuctionInsertSevlet
 */
@WebServlet("/AuctionInsertSevlet")
public class AuctionInsertSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuctionInsertSevlet() {
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
		int auctionId=Integer.parseInt(request.getParameter("ano"));
		String teamn=request.getParameter("tnumber");
		int playerId=Integer.parseInt(request.getParameter("playerNumber"));
		String price = request.getParameter("price");
		
		Auction t=new Auction(auctionId, teamn, playerId, price);
		System.out.println("Inside Servlet: "+t);
		AuctionDao pd=new AuctionDao(); 
		
		
		
		
		RequestDispatcher rd=null;
		
		boolean b =false;
		try {
			b=pd.insertauction(t); // Control TRanfers to Dao file
			rd=request.getRequestDispatcher("success.html");
			System.out.println("Successfully Inserted...");
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			out.write("Already Team id Used: "+e);
			rd=request.getRequestDispatcher("addTeam.html");
			rd.include(request, response);
			e.printStackTrace();
		}
		
	}
}


