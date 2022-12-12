package com.xworkz.crud.dto;

import com.xworkz.crud.constant.TeamName;

public class IplDTO extends AbstractAuditDTO {
	private String wins;
	private String lose;
	private String capainName;
	private String subadinateNmae;
	private TeamName name=TeamName.RCB;
	private String teamcolor;

	public IplDTO() {
		System.out.println("calling no-args cont ");

	}

	@Override
	public String toString() {
		return "IplDTO [wins=" + wins + ", lose=" + lose + ", capainName=" + capainName + ", subadinateNmae="
				+ subadinateNmae + ", name=" + name + ", teamcolor=" + teamcolor + "]";
	}

	public String getWins() {
		return wins;
	}

	public void setWins(String wins) {
		this.wins = wins;
	}

	public String getLose() {
		return lose;
	}

	public void setLose(String lose) {
		this.lose = lose;
	}

	public String getCapainName() {
		return capainName;
	}

	public void setCapainName(String capainName) {
		this.capainName = capainName;
	}

	public String getSubadinateNmae() {
		return subadinateNmae;
	}

	public void setSubadinateNmae(String subadinateNmae) {
		this.subadinateNmae = subadinateNmae;
	}

	public TeamName getName() {
		return name;
	}

	public void setName(TeamName name) {
		this.name = name;
	}

	public String getTeamcolor() {
		return teamcolor;
	}

	public void setTeamcolor(String teamcolor) {
		this.teamcolor = teamcolor;
	}

	

}
