package settings;

import java.text.Collator;
import java.util.Locale;

public class GlobalSettings {
	private static final String defaultLanguage = "en"; // TODO load from configfile?
	private static Locale locale = new Locale(defaultLanguage);
	private static Collator collator = Collator.getInstance(locale);
	
	private GlobalSettings() {
	}
	
	private static void setCollator(Collator collator) {
		GlobalSettings.collator = collator;
	}

	public static Collator getCollator() {
		return collator;
	}


//	public static GlobalSettings current() {
//		return current;
//	}
	
	public static Locale getLocale() {
		return locale;
	}
	
	public static void setLocale(Locale locale) {
		GlobalSettings.locale = locale;
		Collator collator = Collator.getInstance(locale);
		setCollator(collator);
	}
	
}
