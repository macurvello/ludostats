package model;

/**
 * Represents a physical location where a game was played.
 * @author Marco Curvello
 * 
 */
public class Location implements ConsistentData, Persistable {
	private String name;
	
	public Location(String name) {
		this.name = name;
	}
	
	/**
	 * Checks if the locations's name exists and is not empty.
	 * @see model.ConsistentData#isConsistent()
	 */
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
}
