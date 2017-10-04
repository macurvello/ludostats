/**
 * 
 */
package model;

import java.util.Set;

/**
 * @author Marco Curvello
 *
 */
public class Team implements ConsistentData {

	private String name;
	private Set<PlayerInfo> players;
	
	/**
	 * 
	 */
	public Team() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see model.ConsistentData#isConsistent()
	 */
	@Override
	public boolean isConsistent() {
		// TODO Auto-generated method stub
		return false;
	}

}
