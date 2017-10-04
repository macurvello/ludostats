package model;

public class BGGGame extends Game {

	private final long bggid;
	
	public BGGGame(long id, String name, long bggid) {
		super(id, name);
		this.bggid = bggid;
	}
	
	@Override
	public boolean isConsistent() {
		if ( this.bggid == 0 ) { // TODO is there a game with id 0 on bgg?
			return false;
		}
		
		return super.isConsistent();
	}
	
	public long getBggid() {
		return bggid;
	}
}
