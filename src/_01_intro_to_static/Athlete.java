package _01_intro_to_static;

public class Athlete {
		static int nextBibNumber;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        
	        bibNumber=nextBibNumber++;
	    }

	    public static void main(String[] args) {
	    Athlete bob = new Athlete("Bob", 3);
	    Athlete joe=new Athlete("Joe",2);
	    System.out.println(bob.name);
	    System.out.println(bob.bibNumber);
	    raceLocation="San Diego";
	    System.out.println(bob.raceLocation);
	    System.out.println(joe.name);
	    System.out.println(joe.bibNumber);
	    System.out.println(joe.raceLocation);
	    }
}
