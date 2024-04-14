package org.mpsomaha.GridWorld;
import info.gridworld.actor.*;

import java.awt.Color;
import java.util.ArrayList;
import info.gridworld.grid.Location;

public class MemeCritter extends Critter {
		public MemeCritter(Color initialColor) {
		super(initialColor);
		super.act();
		meme = false;
		}




		protected boolean meme;
		
		@Override
		public void processActors(ArrayList<Actor> actors) {
			for(Actor a : actors) {
			if(!(a instanceof MemeCritter)){
			setColor(Color.BLUE);
			}
				else if(a instanceof Rock) {
							meme = true;
						}
				}
			
		}
		@Override
		public void act() {
		super.act();
			if(meme == true) {
				new memetwo(null).putSelfInGrid(getGrid(), getLocation());
			}
			
}
		
		
		
	
public class memetwo extends MemeCritter{
		public memetwo(Color initialColor) {
		super(initialColor);
		// TODO Auto-generated constructor stub
	}
		protected Location origin;
		public void MemeCritterTwo(Location origin) {
		this.origin = origin;
		}
		public void processActors(ArrayList<Actor> actors) {
		for(Actor a : actors) {
		if(!(a instanceof MemeCritter)){
		setColor(Color.RED);
			}
			else if(a instanceof Rock) {
							meme = true;
						}
				
				
				
		
		}
			
			
			}
			@Override
			public void act() {
			super.act();
			if(meme == true) {
					new memethree(null).putSelfInGrid(getGrid(), getLocation());
					}
					
			
			
			}
			
				
				
}
public class memethree extends MemeCritter {
	
	public memethree(Color initialColor) {
		super(initialColor);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void act() {
	super.act();
		if(meme == true) {
			new MemeCritter(Color.GREEN).putSelfInGrid(getGrid(), getLocation());
		}
}
	
}

}