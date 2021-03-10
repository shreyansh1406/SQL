package com.ltts.model;


public class Auction {
	private int auctionId;
	private String teamname;
	private int playerId;
	private String price;
	public Auction(int auctionId, String teamname, int playerId, String price) {
		super();
		this.auctionId = auctionId;
		this.teamname = teamname;
		this.playerId = playerId;
		this.price = price;
	}
	public int getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Auction [auctionId=" + auctionId + ", teamname=" + teamname + ", playerId=" + playerId + ", price="
				+ price + "]";
	}
	
	
	
}