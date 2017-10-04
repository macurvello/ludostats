package model;

public class BGGPlayer extends Player {
	private final String bggUsername;
	
	public BGGPlayer(long id, String name, String bggUsername) {
		super(name);
		this.bggUsername = bggUsername;
	}
	
	public String getBggUsername() {
		return bggUsername;
	}
}
