package model;

import java.text.Collator;

import settings.GlobalSettings;

public class Player implements Comparable<Player>, ConsistentData, Persistable {
	private String name;
	private boolean me = false; // TODO should this be unique?
	//private Image pic;
	
	public Player(String name) {
		this.name = name;
	}
	
	@Override
	public int compareTo(Player p) {
		Collator col = GlobalSettings.getCollator();
		return col.compare(this.getName(), p.getName());
	}
	
	@Override
	public boolean isConsistent() {
		if( this.name == "" ||
				this.name == null ) {
			return false;
		}
		return true;
	}
	
	@Override
	public void persist() {
		//TODO
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMe() {
		return me;
	}

	public void setMe(boolean me) {
		this.me = me;
	}

	
}
