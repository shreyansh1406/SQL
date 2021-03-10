package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.configure.MyConnection;

import com.ltts.model.team;

public class teamdao {
	
	public boolean insertteam(team t) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into _team values(?,?,?,?)");
		ps.setInt(1, t.getTeam_id());
		ps.setString(2, t.getTeam_name());
		ps.setString(3, t.getOwnerName());
		ps.setString(4, t.getCoachName());

		return ps.execute();
		//return false;

		
	}
}
