package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ltts.configure.MyConnection;
import com.ltts.model.Player;

public class PlayerDao {
	
	public boolean insertPlayer(Player p) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into _player values(?,?,?,?,?,?)");
		ps.setInt(1, p.getPid());
		ps.setString(2, p.getName());
		ps.setDate(3, p.getDate());
		ps.setInt(4, p.getRun());
		ps.setInt(5, p.getWic());
		ps.setString(6, p.getCountry());


		return ps.execute();
		//return false;

		
	}

}
