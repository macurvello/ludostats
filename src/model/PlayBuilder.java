package model;

import java.time.Duration;
import java.util.Date;

public class PlayBuilder extends ConsistentDataBuilder {

	public PlayBuilder(long id, Game game, Date date) {
		Play play = new Play();
		play.setId(id);
		play.setGame(game);
		play.setDate(date);
		this.setData( play );
	}

	public PlayBuilder setDuration(Duration duration) {
		Play play = (Play) getData();
		play.setDuration(duration);
		return this;
	}

	public PlayBuilder setComments(String comments) {
		Play play = (Play) getData();
		play.setComments(comments);
		return this;
	}

	public PlayBuilder setLocation(Location location) {
		Play play = (Play) getData();
		play.setLocation(location);
		return this;
	}

	public PlayBuilder setIgnore(boolean ignore) {
		Play play = (Play) getData();
		play.setIgnore(ignore);
		return this;
	}

	public PlayBuilder setRounds(int rounds) {
		Play play = (Play) getData();
		play.setRounds(rounds);
		return this;
	}

	public PlayBuilder setPostedToBgg(boolean postedToBgg) {
		Play play = (Play) getData();
		play.setPostedToBgg( postedToBgg );
		return this;
	}
}
