package org.mpsomaha.GridWorld;
import java.awt.Color;
import java.util.*;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class AssassinCritter extends Critter {
	//override removeselffromgrid
	//getCurrentlocation and store
	//moveto random empty location
	
		
	
	public AssassinCritter(Color initialcolor) {
		super(initialcolor);
	
		// TODO Auto-generated constructor stub
	}

	@Override
	public void removeSelfFromGrid() {
		Location currentLocation = this.getLocation();
		
		Random random = new Random();
		
		boolean emptyLocationFound = false;
		Location newLoc = new Location(0,0);
		
		while (emptyLocationFound == false) {
			int randomColumn = random.nextInt(getGrid().getNumRows() + 1);
			int randomRow = random.nextInt(getGrid().getNumCols() + 1);
			
			newLoc = new Location(randomRow, randomColumn);
			
			if (getGrid().get(newLoc) == null) {
				emptyLocationFound = true;
				return;
			}
		}
		
		
		
		//if this location is empty, move there, otherwise we need to regenerate our random numbers (you'll have to do a loop)
		
		this.moveTo(newLoc);
		
		ArrayList<Location> adjacents = getGrid().getValidAdjacentLocations(currentLocation);
		ArrayList<Location> additionalAdjacents = new ArrayList<Location>();
		//loop through adjacents, find additional valid locations
		
		for(Location loc: adjacents) {
			additionalAdjacents.addAll(getGrid().getValidAdjacentLocations(loc));
		}
		
		adjacents.addAll(additionalAdjacents);
		
		
		//add them to adjacents
		
		//loop through adjacents, remove any actors;
		
		for(Location loc: adjacents) {
			Actor temp = getGrid().get(loc); 
			if(temp != null && !(temp.equals(this)))
				temp.removeSelfFromGrid();
		}
		
		
		//The AssassinCritter processes actors by randomly removing any neighboring actor from the grid(50%).
		
		//?????maybe override the act method and if it runs into another actor, there is a 50% chance to remove that actor?
		
		
		
	}
	//
}