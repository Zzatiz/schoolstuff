package org.mpsomaha.GridWorld;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

public class CreatureHopper extends Rock {
	
	private Actor storedActor = new Actor();
	//override act
	//get occupied adjacent location
	//if no locations, do nothing
	//else get first in list
	//remove object at that location, move there, save object
	//If we have an object stored, place at location moved from
	
	@Override
	public void act() {
		ArrayList<Location> locs = getGrid().getOccupiedAdjacentLocations(this.getLocation());
		Actor removalActor = new Actor();
		
		Location previousLoc = this.getLocation();
		
		if(locs.isEmpty()) {
			//we didnt find anything, dont move
		} else {
			Location cur = getLocation();
			Location loc = locs.get(0);
			removalActor = getGrid().get(loc);
			this.moveTo(loc);
			storedActor.putSelfInGrid(getGrid(), cur);
			storedActor = removalActor;
		}
	}

}
