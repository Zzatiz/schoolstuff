package org.mpsomaha.GridWorld;

import java.awt.Color;
import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class PlusCritter extends Critter {
	
	public PlusCritter(Color initialColor) {
		super(initialColor);

		// TODO Auto-generated constructor stub
	}

	@Override
	 public void act()  {
		if(getGrid()==null) {
			return;
		}
		
		Location currentLocation =  this.getLocation();
		int col = currentLocation.getCol();
		int row = currentLocation.getRow();
    
		for (int i = 0; i < getGrid().getNumCols(); i++) {
			Location removeLocation = new Location(row, i);
			//if instance of PlusCritter, and location != where we currently are, remove the critter
			Actor a = getGrid().get(removeLocation);
			
			if (a instanceof Rock && removeLocation != currentLocation) {
				a.removeSelfFromGrid();
			}
		}
		
		for (int i = 0; i < getGrid().getNumRows(); i++) {
			Location removeLocation = new Location(i, col);
			//if instance of PlusCritter, and location != where we currently are, remove the critter
			Actor a = getGrid().get(removeLocation);
			
			if (a instanceof Rock && removeLocation != currentLocation) {
				a.removeSelfFromGrid();
			}
		}
		
		//loop through the locations, if we find a pluscritter at that location
		//remove from grid
	        super.act();
	        
	        currentLocation =  this.getLocation();
			col = currentLocation.getCol();
			row = currentLocation.getRow();
			
			for (int i = 0; i < getGrid().getNumCols(); i++) {
				Location addLocation = new Location(row, i);
				Location removeLocation = new Location(row, i);

				//if instance of PlusCritter, and location != where we currently are, remove the critter
				Actor a = getGrid().get(removeLocation);
				
				//If there is nothing in the location, add a pluscritter
				if (a == null) {
					Rock plus = new Rock();
		    		plus.putSelfInGrid(getGrid(), addLocation);
				}
			}
			
			for (int i = 0; i < getGrid().getNumRows(); i++) {
				Location addLocation = new Location(i, col);
				Location removeLocation = new Location(i, col);

				//if instance of PlusCritter, and location != where we currently are, remove the critter
				Actor a = getGrid().get(removeLocation);
				
			if (a == null) {
					Rock plus = new Rock();
		    		plus.putSelfInGrid(getGrid(), addLocation);
			}
			}
	        
	        
	        //loop through locations again, add new plus critters if space is empthy?
	    }

	}
