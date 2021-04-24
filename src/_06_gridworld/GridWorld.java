package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
/*    1. Figure out how to get a World to show.

    2. Figure out how to add a Bug to the world (clue: you will need the Bug and Location objects)

    3. Add another bug at a random location in the world.

    4. Change the color of that bug to blue.

    5. Make the bug face to the right.

    6. Add flowers to the left and right of the bug.

    7. Fill the whole world with flowers!

    8. [Optional] Color the flowers in rows like the American flag (red & white)

    9. [Optional] Use a new class to make an X out of bugs.
*/
public static void main(String[] args) {
	World world=new World();
	world.show();
	Bug bug1=new Bug();
	Location location1=new Location(5,6);
	world.add(location1, bug1);
	Random ran=new Random();
	int x=ran.nextInt(10);
	int y=ran.nextInt(10);
	Location location2=new Location(x,y);
	Bug bug2=new Bug();
	bug2.setColor(Color.blue);
	world.add(location2, bug2);
}	

	
	
}
