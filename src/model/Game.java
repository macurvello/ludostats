package model;

import java.awt.Image;

public class Game implements ConsistentData, Persistable {
	public static enum Scoring {
		HIGHEST,
		LOWEST,
		NOPOINTS
	};
	
	private final long id;
	private String name;
	private boolean cooperative = false;
	private Image image = null;
	private Scoring scoring = Scoring.HIGHEST;
	private boolean teamsByDefault = false;
	
	public Game(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean isConsistent() {
		if(this.id == 0 ||
				this.name == "" ||
				this.name == null ) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public void persist() {
		//TODO
	}
	
	public long getId() {
		return id;
	}
//	public void setId(long id) {
//		this.id = id;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCooperative() {
		return cooperative;
	}
	public void setCooperative(boolean cooperative) {
		this.cooperative = cooperative;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public Scoring getScoring() {
		return scoring;
	}
	public void setScoring(Scoring scoring) {
		this.scoring = scoring;
	}
	public boolean isTeamsByDefault() {
		return teamsByDefault;
	}
	public void setTeamsByDefault(boolean teamsByDefault) {
		this.teamsByDefault = teamsByDefault;
	}
	
	
}
