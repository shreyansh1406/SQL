package com.ltts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.configure.MyConnection;
import com.ltts.model.Auction;
import com.ltts.model.team;

public class AuctionDao {

	public boolean insertauction(Auction t) throws Exception {
		//fill your code
		Connection mc=MyConnection.getConnection(); // TRanfers control to another 
		PreparedStatement ps=mc.prepareStatement("insert into _auction values(?,?,?,?)");
		ps.setInt(1, t.getAuctionId());
		ps.setString(2, t.getTeamname());
		ps.setInt(3, t.getPlayerId());
		ps.setString(4, t.getPrice());

		return ps.execute();
		//return false;

		
	}
}
