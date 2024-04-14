package org.mpsomaha.GridWorld;
import java.awt.Color;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;


public class CheckerCritter extends Critter {
	
	public CheckerCritter(Color initialColor) {
		super(initialColor);
		super.act();
		// TODO Auto-generated constructor stub
	}

	public void act() {
//		Location currentLocation =  this.getLocation();
//		int row = currentLocation.getCol();
//		int col = currentLocation.getRow();
//		Actor a = getGrid().get(new Location(row,col));
//		boolean evenodd;
//		while(evenodd = true) {	
//			a.setColor(Color.RED);
//			}
//		while(evenodd = false) {
//			a.setColor(Color.BLACK);
//		}
		moveTo(selectMoveLocation(getMoveLocations()));		
		for(int col = 0; col < getGrid().getNumCols(); col++) 
		{
			for(int row = 0; row < getGrid().getNumRows(); row++) {
				Location tempLoc = new Location(row,col);
				Actor maybe = getGrid().get(tempLoc); 
				if(maybe != null) {
			if(col % 2 == 0) {	
				if(row % 2 == 0) {
					//a.setColor(Color.RED);
					maybe.setColor(Color.WHITE);
				}
				else {
					//a.setColor(Color.BLACK);
					maybe.setColor(Color.BLACK);

				}
			}
			else {
				if(row % 2 == 1) {
					//a.setColor(Color.RED);
					maybe.setColor(Color.WHITE);
				}
				else {
					//a.setColor(Color.BLACK);
					maybe.setColor(Color.BLACK);

				}
			}
		
			
				}

		}
		}
		}
}