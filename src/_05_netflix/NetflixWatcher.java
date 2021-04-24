package _05_netflix;



public class NetflixWatcher {
public static void main(String[] args) {
	Movie m=new Movie("Avengers", 5);
	Movie n=new Movie("Star Wars IV", 4);
	Movie o=new Movie("Toy Story", 3);
	Movie p=new Movie("New Mutants LMAOOOO", 1);
	Movie q=new Movie("Twilight which is apparently really bad", 2);
	System.out.println(m.getTicketPrice());
	System.out.println(n.getTicketPrice());
	System.out.println(o.getTicketPrice());
	System.out.println(p.getTicketPrice());
	System.out.println(q.getTicketPrice());
	
	NetflixQueue netflix=new NetflixQueue();
	netflix.addMovie(m);
	netflix.addMovie(n);
	netflix.addMovie(o);
	netflix.addMovie(p);
	netflix.addMovie(q);
	netflix.printMovies();
	netflix.sortMoviesByRating();
	System.out.println("The best movie is " + netflix.getBestMovie());
	System.out.println("The second best movie is " + netflix.getMovie(1));
}
}
