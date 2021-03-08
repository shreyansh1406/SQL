package com.ltts.dao;

import java.io.BufferedReader;
import java.io.IOException;
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

public class Playerdao {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void add() throws Exception {

		Connection con = Connect.getConnection();
		PreparedStatement pst = con.prepareStatement("insert into Player values(?,?,?,?,?)");
		System.out.println("Please enter id, name, skill, numberOfmatches, dateofbirth(yyy-mm-dd)");
		int id = Integer.parseInt(br.readLine());
		String name = br.readLine();
		String skill = br.readLine();
		int nom = Integer.parseInt(br.readLine());
		String str = br.readLine();
		Date dat = Date.valueOf(str);

		Player p = new Player(id, name, skill, nom, dat);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, skill);
		pst.setInt(4, nom);
		pst.setString(5, str);
		pst.executeUpdate();
		System.out.println("Record is inserted");
	}

	public void delete() throws Exception {
		Connection con2 = Connect.getConnection();
		PreparedStatement pst2 = con2.prepareStatement("delete from Player where Id=?");
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
		System.out.println("2. name");
		System.out.println("3. skill");
		System.out.println("4. numberofmatches");
		System.out.println("5. dateofbirth/n");
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
			PreparedStatement pst1 = con4.prepareStatement("select * from Player where Id=? ");
			pst1.setInt(1, id);
			pst1.execute();
			ResultSet rs = pst1.executeQuery();
			System.out.println("The result is:");
			while (rs.next()) 
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getString(5));
			}

			break;
			
		case 2:
			System.out.println("enter name You want to search");
			String name = br.readLine();
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("select * from Player where name=? ");
			pst1.setString(1, name);
			pst1.execute();
			rs = pst1.executeQuery();
			System.out.println("The result is:");
			while (rs.next()) 
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ "      " + rs.getString(5));
			}
			break;

		case 3:
			System.out.println("enter the skill you want to search");
			String sk = br.readLine();
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("select * from Player where skill=? ");
			pst1.setString(1, sk);
			pst1.execute();
			rs = pst1.executeQuery();
			System.out.println("The result is:");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getString(5));
			}
			break;
		case 4:
			System.out.println("Enter the number of matches");
			int nom1 = Integer.parseInt(br.readLine());
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("select * from Player where numberofmatches=? ");
			pst1.setInt(1, nom1);
			pst1.execute();
			rs = pst1.executeQuery();
			System.out.println("The result is:");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getString(5));
			}
			break;
		case 5:
			System.out.println("Enter the dateofbirth");
			String d = br.readLine();
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("select * from Player where date=? ");
			pst1.setString(1, d);
			pst1.execute();
			rs = pst1.executeQuery();
			System.out.println("The result is:");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getString(5));
			}
			break;

		}
	}

	public void update() throws Exception {
//		Connection con1 = Connect.getConnection();
//		PreparedStatement pst1 = con1.prepareStatement("update Player set name=? ");
//		System.out.println("enter the id to update");
//		int id1 = Integer.parseInt(br.readLine());
//		pst1.setInt(1, id1);
//		pst1.executeUpdate();
//		System.out.println("Record is updated");
		
		Connection con1 = Connect.getConnection();
		System.out.println("Please Enter the column that You want to update in the table:");
		System.out.println("1. Id ");
		System.out.println("2. name");
		System.out.println("3. skill");
		System.out.println("4. numberofmatches");
		System.out.println("5. dateofbirth\n");
		System.out.println("enter the option");


		int opt = Integer.parseInt(br.readLine());
		switch (opt) 
		{
		case 1:
			System.out.println("enter which id You want to update");
			int id7 = Integer.parseInt(br.readLine());
			Connection con4 = Connect.getConnection();
			System.out.println("enter the updated id");
			int id1 = Integer.parseInt(br.readLine());
			PreparedStatement pst1 = con4.prepareStatement("update Player set Id=? where Id=? ");
			pst1.setInt(1, id1);
			pst1.setInt(2, id7);
			
			System.out.println("Record updated");
			

			break;
			
		case 2:
			System.out.println("enter which id You want to update");
			int id2 = Integer.parseInt(br.readLine());
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("update Player set name=? where Id=?  ");
			System.out.println("enter the updated name");
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
			pst1 = con4.prepareStatement("update Player set skill=? where Id=?  ");
			System.out.println("enter the updated skill");
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
			pst1 = con4.prepareStatement("update Player set numberofmatches=? where Id=?");
			System.out.println("enter the updated numberofmatches");
			int no = Integer.parseInt(br.readLine());
			pst1.setInt(1, no);
			pst1.setInt(2, id4);
			pst1.execute();
			System.out.println("Record updated");
			break;
			
		case 5:
			System.out.println("enter which id You want to update");
			int id5 = Integer.parseInt(br.readLine());
			con4 = Connect.getConnection();
			pst1 = con4.prepareStatement("update Player set date=? where Id=?");
			System.out.println("enter the updated dob");
			String str = br.readLine();
			Date dat = Date.valueOf(str);
			pst1.setString(1, str);
			pst1.setInt(2, id5);
			pst1.execute();
			System.out.println("Record updated");
			break;
	}
	}

	public void display() throws Exception {
		Connection con4 = Connect.getConnection();
		PreparedStatement pst1 = con4.prepareStatement("Select * from player");
		ResultSet rs = pst1.executeQuery();
		pst1.execute();
		rs = pst1.executeQuery();
		System.out.println("-----------------------------------------------");
		System.out.println("Id  name  skill    numberofmatches    date");
		System.out.println("-----------------------------------------------");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "          " + rs.getInt(4)+ "      " + rs.getString(5));
		}
	
		
		
	}
}
