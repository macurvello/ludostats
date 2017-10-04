package model;

import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;

public class Play implements ConsistentData, Persistable {
	private long id = 0; //TODO uniqueness
	private Game game;
	private SortedSet<PlayerInfo> playerInfo;
	private List<Team> teams;
	private Duration duration;
	private String comments;
	private Date date;
	private Location location;
	private boolean useTeams;	
	/**
	 * Ignore for statistics
	 */
	private boolean ignore;
	private int rounds;
	private boolean postedToBgg;
	
	//private static PlayerInfo anonymousPlayerInfo = new PlayerInfo();
	
	public Play() {		
		this.playerInfo = new java.util.TreeSet<PlayerInfo>();
		this.teams = new LinkedList<Team>();
	}
	
	public void addPlayerInfo(PlayerInfo player) {
		playerInfo.add(player);
	}
	
	public void removePlayerInfo(PlayerInfo playerInfo) {
		this.playerInfo.remove(playerInfo);
	}
	
	public void addTeam(Team team) {
		this.teams.add(team);
	}
	
//	public void addAnonymousPlayerInfo() {
//		playerInfo.add(new PlayerInfo());
//	}
	
	@Override
	public boolean isConsistent() {
		Iterator<PlayerInfo> it = getPlayerInfoIterator();
		while( it.hasNext() ) {
			PlayerInfo pi = it.next();
			if ( !pi.isConsistent() ) {
				return false;
			}
		}
		
		if( this.id == 0 ||
				this.game == null ||
				this.date == null ) {
			return false;
		}
		if ( !this.useTeams && !this.teams.isEmpty() ) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public void persist() {
		//TODO
	}
	
	public boolean isUseTeams() {
		return useTeams;
	}

	public void setUseTeams(boolean useTeams) {
		this.useTeams = useTeams;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Game getGame() {
		return game;
	}
	public void setGame(Game game) {
		this.game = game;
	}
	public Iterator<PlayerInfo> getPlayerInfoIterator() {
		return playerInfo.iterator();
	}

	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public boolean isIgnore() {
		return ignore;
	}
	public void setIgnore(boolean ignore) {
		this.ignore = ignore;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isPostedToBgg() {
		return postedToBgg;
	}
	public void setPostedToBgg(boolean postedToBgg) {
		this.postedToBgg = postedToBgg;
	}

}
