package org.mpsomaha.GridWorld;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import info.gridworld.actor.*;
import info.gridworld.grid.Location;

public class AlchemyCritter extends Critter {
	Random random = new Random();
	
	//Override the processActors method
	
	//if we find a flower, rock or critter that is not yellow
	
	//call Alchemy

	public AlchemyCritter(Color initialColor) {
		super(initialColor);
	}




	@Override
	public void processActors(ArrayList<Actor> actors) {
		for (Actor a : actors)
        {
            if ((a instanceof Flower || a instanceof Rock || a instanceof Critter) && a.getColor() != Color.YELLOW) {
            	alchemy();
            	return;
            } else if (!(a instanceof Rock) && !(a instanceof Critter)) {
                a.removeSelfFromGrid();
               return;
            }
               
        }
	}
	
	
	
	
	private void alchemy() {
		
		ArrayList<Actor> actors = new ArrayList<Actor>();
		//loop over all actors on the grid
		ArrayList<Location> locs = getGrid().getOccupiedLocations(); 
		for(Location currentLocation: locs) {
			Actor a = getGrid().get(currentLocation);
			if( !(a instanceof AlchemyCritter)  && !(a.equals(this))) {
				actors.add(a);
			}
			
		}
		
		//remove the actor from the grid,
		if(actors.size() == 0) {
			return;
		}
			for(Actor a: actors) {
				Location currentLocation = a.getLocation();

				
				
				int randomType = random.nextInt(3);
				int randomColor = random.nextInt(4);
				
				Color c = Color.YELLOW;
				Actor newActor = new Flower(c);
				
				switch (randomColor) {
	        	case 0:
	        		c = Color.YELLOW;
	        		
	        	case 1:
	        		c = Color.GRAY;
	        		
	        	case 2:
	        		c = Color.RED;
	        		
	        	case 3:
	        		c = Color.GREEN;
				
				}
				
				switch (randomType) {
	            	case 0:
	            		newActor = new Flower(c);
	            		
	            	case 1:
	            		newActor = new Rock(c);
	            		
	            	case 2:
	            		newActor = new Critter(c);
	            		
				}
				
	
				newActor.putSelfInGrid(getGrid(), getLocation());
				
		
		
		//call random number gen twice for color and type
		//switch statement for type,
		//switch statement for color'
		//create new actor
		
		//place on grid
	}
}
}
 