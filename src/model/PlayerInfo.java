package model;

public class PlayerInfo implements Comparable<PlayerInfo>, ConsistentData, Persistable {
	private Player player;
	private int score = 0;
	private String role = "";
	private boolean winner = false;
	private int rank = -1;
	private boolean startPlayer = false;
	private boolean newPlayer = false;
	//private Team team = null;
	private boolean anonymous = false;
	
	public PlayerInfo(Player player) {
		this.player = player;
	}	
	
	/**
	 * Creates an anonymous player
	 */
	public PlayerInfo() {
		this.anonymous = true;
		Player anon = new Player("Anonymous"); // TODO localization
		this.player = anon;
	}
	

	@Override
	public int compareTo(PlayerInfo pi) {
		return this.player.compareTo(pi.player);
	}
	
	/* (non-Javadoc)
	 * @see model.ConsistentData#isConsistent()
	 */
	@Override
	public boolean isConsistent() {
		if( this.player == null ) {
			return false;
		}
		return true;
	}
	
	@Override
	public void persist() {
		//TODO
	}

	public boolean isAnonymous() {
		return anonymous;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public boolean isStartPlayer() {
		return startPlayer;
	}

	public void setStartPlayer(boolean startPlayer) {
		this.startPlayer = startPlayer;
	}

	public boolean isNewPlayer() {
		return newPlayer;
	}

	public void setNewPlayer(boolean newPlayer) {
		this.newPlayer = newPlayer;
	}

	
	
	
}
