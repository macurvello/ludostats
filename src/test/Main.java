package test;

import java.text.Collator;

import settings.GlobalSettings;

public class Main {

	public static void main(String[] args) {
//		Play play = new PlayBuilder().build();
//		System.out.println(play.getId());
//		System.out.println(play.getDuration());
//		System.out.println(play.isIgnore());
		
		Collator col = GlobalSettings.getCollator();

		String s="abc";
		String t="ábc";
		String w="cbc";
		
		System.out.println(col.compare(s, t));
		System.out.println(col.compare(s, w));
		System.out.println(col.compare(t, w));
		System.out.println(col.compare(w, t));
		System.out.println(null == "fdsa");
		
		//Game game = new GameBuilder(1, "").build();	
	}

}
