package com.ltts.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ltts.configuration.Connect;
import com.ltts.model.Player;
import com.ltts.model.Team;
//import com.ltts.*;
public class Teamdao {



	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void add() throws Exception {

		Connection con = Connect.getConnection();
		PreparedStatement pst = con.prepareStatement("insert into team values(?,?,?,?)");
		System.out.println("Please enter id,teamname,ownername, coachname");
		int id = Integer.parseInt(br.readLine());
		String name = br.readLine();
		String oname = br.readLine();
		String cname = br.readLine();

	
		Team p = new Team(id, name, oname, cname);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, oname);
		pst.setString(4, cname);
		pst.executeUpdate();
		System.out.println("Record is inserted");
	}

	public void delete() throws Exception {
		Connection con2 = Connect.getConnection();
		PreparedStatement pst2 = con2.prepareStatement("delete from team where Id=?");
		System.out.println("enter the id to delete");
		int id2 = Integer.parseInt(br.readLine());
		pst2.setInt(1, id2);
		pst2.executeUpdate();
		System.out.println("record is deleted");
	}

	public void getall() throws Exception {
		Connection con1 = Connect.getConnection();
		System.out.println("Please Enter on what basis you want to search in the table:");
		System.out.println("1. Id ");
		System.out.println("2. teamname");
		System.out.println("3. ownername");
		System.out.println("4. coachname");
		System.out.println("enter the option");
//		String query = "select * from Player"; 
//	    PreparedStatement ps = con1.prepareStatement(query); 
//    	ResultSet rs = ps.executeQuery(); 
//		List<Player> ls = new ArrayList(); 

//		while (rs.next()) { 
//			Player emp = new Player(); 
//			emp.setId(rs.getInt("Id")); 
//			emp.setName(rs.getString("name")); 
//			emp.setSkill(rs.getString("skill")); 
//			emp.setId(rs.getInt("numberofmatches"));
//			
//			ls.add(emp); 
//		} 
//		return ls; 

		int opt = Integer.parseInt(br.readLine());
		switch (opt) 
		{
		case 1:
			System.out.println("enter id You want to search");
			int id = Integer.parseInt(br.readLine());
			Connection con4 = Connect.getConnection();
			PreparedStatement pst1 = con4.prepareStatement("select * from team where Id=? ");
			pst1.setInt(1, id);
			pst1.execute();
			ResultSet rs = pst1.executeQuery();
			System.out.println("The result is:");
			while (rs.next()) 
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
						
			}

			break;
			
		case 2:
			System.out.println("enter teamname You want to search");
			String name = br.readLine();
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("select * from team where teamname=? ");
			pst1.setString(1, name);
			pst1.execute();
			rs = pst1.executeQuery();
			System.out.println("The result is:");
			while (rs.next()) 
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			break;

		case 3:
			System.out.println("enter the ownername you want to search");
			String sk = br.readLine();
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("select * from team where ownername=? ");
			pst1.setString(1, sk);
			pst1.execute();
			rs = pst1.executeQuery();
			System.out.println("The result is:");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			break;
		case 4:
			System.out.println("Enter the ownername");
			String on = br.readLine();
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("select * from team where coachname=? ");
			pst1.setString(1, on);
			pst1.execute();
			rs = pst1.executeQuery();
			System.out.println("The result is:");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			break;

		}
	}

	public void update() throws Exception {
		
		Connection con1 = Connect.getConnection();
		System.out.println("Please Enter the column that You want to update in the table:");
		System.out.println("1. Id ");
		System.out.println("2. teamname");
		System.out.println("3. ownername");
		System.out.println("4. coachname");
		int opt = Integer.parseInt(br.readLine());
		switch (opt) 
		{
		case 1:
			System.out.println("enter which id You want to update");
			int id7 = Integer.parseInt(br.readLine());
			Connection con4 = Connect.getConnection();
			System.out.println("enter the updated id");
			int id1 = Integer.parseInt(br.readLine());
			PreparedStatement pst1 = con4.prepareStatement("update team set Id=? where Id=? ");
			pst1.setInt(1, id1);
			pst1.setInt(2, id7);
			
			System.out.println("Record updated");
			

			break;
			
		case 2:
			System.out.println("enter which id You want to update");
			int id2 = Integer.parseInt(br.readLine());
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("update team set teamname=? where Id=?  ");
			System.out.println("enter the updated teamname");
			String n= br.readLine();
			pst1.setString(1, n);
			pst1.setInt(2, id2);
			pst1.execute();
			System.out.println("Record updated");
			break;

		case 3:
			System.out.println("enter which id You want to update");
			int id3 = Integer.parseInt(br.readLine());
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("update team set ownername=? where Id=?  ");
			System.out.println("enter the updated ownername");
			String s = br.readLine();
			pst1.setString(1, s);
			pst1.setInt(2, id3);
			pst1.execute();
			System.out.println("Record updated");
			break;
		case 4:
			System.out.println("enter which id You want to update");
			int id4 = Integer.parseInt(br.readLine());
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("update team set coachname=? where Id=?");
			System.out.println("enter the updated coachname");
			String cn = br.readLine();
			pst1.setString(1,cn);
			pst1.setInt(2, id4);
			pst1.execute();
			System.out.println("Record updated");
			break;
			
	}
	}

	public void display() throws Exception {
		Connection con4 = Connect.getConnection();
		PreparedStatement pst1 = con4.prepareStatement("Select * from team");
		ResultSet rs = pst1.executeQuery();
		pst1.execute();
		rs = pst1.executeQuery();
		System.out.println("--------------------------------------");
		System.out.println("Id  teamname  ownername  coachanme");
		System.out.println("--------------------------------------");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "    " + rs.getString(2) + "    " + rs.getString(3) + "      " + rs.getString(4));
		}
	
		
		
	}
}
