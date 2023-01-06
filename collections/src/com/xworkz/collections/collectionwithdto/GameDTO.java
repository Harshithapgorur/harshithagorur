package com.xworkz.collections.collectionwithdto;

public class GameDTO {
	private String gameName;
	private Integer noOfPlayer;
	private String type;
	public GameDTO() {
		super();
		System.out.println("calling no-argument cont");
	}

	public GameDTO(String gameName, Integer noOfPlayer, String type) {
		super();
		this.gameName = gameName;
		this.noOfPlayer = noOfPlayer;
		this.type = type;
	}

	 @Override
	public boolean equals(Object obj) {
	System.out.println("calling the equals method");
	if(obj!=null) {
		if(obj instanceof GameDTO) {
			GameDTO dto=(GameDTO)obj;
			if(dto.gameName.equals(this.gameName)){
				System.out.println("not match the gamename");
				
			}
		}
	}
		return true;
	}
	
	@Override
	public String toString() {
		return "GameDTO [gameName=" + gameName + ", noOfPlayer=" + noOfPlayer + ", type=" + type + "]";
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Integer getNoOfPlayer() {
		return noOfPlayer;
	}

	public void setNoOfPlayer(Integer noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
