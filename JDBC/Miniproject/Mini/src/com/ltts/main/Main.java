package com.ltts.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.ltts.configuration.Connect;
import com.ltts.dao.Playerdao;
import com.ltts.dao.Teamdao;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Connection mc=Connect.getConnection();
		Statement s = mc.createStatement();
		Playerdao b=new Playerdao();
		Teamdao t=new Teamdao();
		
		while(true)
		{
	    System.out.println("1. Insert operation");
		System.out.println("2. Update operation");
		System.out.println("3. Delete opertaion");
		System.out.println("4. Search opeartion");
		System.out.println("5. Display full record");
		
		System.out.println("\nenter to select option");
		int option=Integer.parseInt(br.readLine());
			switch(option)
		{
		case 1:
      		System.out.println("insert record into the table");
      		System.out.println("");
      		b.add();

			break;
		case 2:
			System.out.println("update record into the table");
			b.update();

			break;
		case 3:
			System.out.println("delete record into the table");
			b.delete();

			break;
		case 4:
			System.out.println("select from the table");
			b.getall();
			break;
		case 5:
			System.out.println("The table is\n");
			b.display();
			break;
			

	}
			System.out.println("\nDo you want to continue with player Table?(y/n)");
			String m=br.readLine();
			if(m.equalsIgnoreCase("y"))
				continue;
			else
			{
				break;
			}   
			
		}
		System.out.println("---------Team table operaration--------------");
		
		while(true)
		{
	    System.out.println("1. Insert operation");
		System.out.println("2. Update operation");
		System.out.println("3. Delete opertaion");
		System.out.println("4. Search opeartion");
		System.out.println("5. Display full record");
		
		System.out.println("\nenter to select option");
		int option=Integer.parseInt(br.readLine());
			switch(option)
		{
		case 1:
      		System.out.println("insert record into the table");
      		System.out.println("");
      		t.add();

			break;
		case 2:
			System.out.println("update record into the table");
			t.update();

			break;
		case 3:
			System.out.println("delete record into the table");
			t.delete();

			break;
		case 4:
			System.out.println("select from the table");
			t.getall();
			break;
		case 5:
			System.out.println("The table is\n");
			t.display();
			break;
			

	}
			System.out.println("\nDo you want to continue?(y/n)");
			String m=br.readLine();
			if(m.equalsIgnoreCase("y"))
				continue;
			else
			{
				break;
			}   
			
		}
		
		

}
	}
