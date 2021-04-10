package _05_netflix;

public class NetflixWatcher {
public static void main(String[] args) {
	Movie m=new Movie("Avengers", 6);
	Movie n=new Movie("Star Wars IV", 3);
	Movie o=new Movie("Toy Story", 3);
	Movie p=new Movie("Some Really Bad Movie", 1);
	Movie q=new Movie("Twilight which is apparently really bad", 2);
	System.out.println(m.getTicketPrice());
	System.out.println(n.getTicketPrice());
	System.out.println(o.getTicketPrice());
	System.out.println(p.getTicketPrice());
	System.out.println(q.getTicketPrice());
}
}
