package model;

import java.awt.Image;

public class GameBuilder extends ConsistentDataBuilder {
	
	public GameBuilder(long id, String name) {
		setData( new Game(id, name) );
	}
	
	public GameBuilder setCooperative(boolean coop) {
		Game game = (Game) getData();
		game.setCooperative(coop);
		return this;
	}
	
	public GameBuilder set(Image image) {
		Game game = (Game) getData();
		game.setImage(image);
		return this;
	}
	
	public GameBuilder setScoring(Game.Scoring scoring) {
		Game game = (Game) getData();
		game.setScoring(scoring);
		return this;
	}
	
	public GameBuilder setTeamsByDefault(boolean teamsByDefault) {
		Game game = (Game) getData();
		game.setTeamsByDefault(teamsByDefault);
		return this;
	}
	
	public GameBuilder set() {
		return this;
	}
}
