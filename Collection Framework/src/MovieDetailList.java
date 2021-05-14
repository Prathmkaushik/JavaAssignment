
import java.util.*;
public class MovieDetailList {
	static Set<MovieDetails>mv =new TreeSet<MovieDetails>(new MovieNameComparator());
	static MovieDetails m1=new MovieDetails("Dhoom","John","Abhishek","Action");
	static MovieDetails m2=new MovieDetails("Baaghi","Tiger", "Shraddh","Action");
	static MovieDetails m3=new MovieDetails("Caption America","ChrisEvans","Natalie","Superhero");
	static MovieDetails m4=new MovieDetails("Kabir Singh","Shahid","Kiara","Romantic");
	
	
	public static void add_movie() {
		mv.add(m1);
		mv.add(m2);
		mv.add(m3);
		mv.add(m4);
		System.out.println("Movies Added:");
		for(MovieDetails m:mv) {
			System.out.println("Movie name: "+m.getMov_Name()+"Lead Actor Name: "+m.lead_actor+"Lead Actress Name:"+m.lead_actress+"Genre"+m.genre);
		}
	}
	public static void remove_movie() {
		mv.remove(m2);
		System.out.println(m2.mov_Name+"Movie details removed");
		}
	public static void remove_moviesAll() {
		mv.removeAll(mv);
		System.out.println("All Movie Details are Removed");
	}
	public static void remove_movie_by_mov_name(String n) {
		for(MovieDetails m:mv) {
			if(n.equalsIgnoreCase(m.mov_Name)) {
				System.out.println("Movie Name: "+m.mov_Name+"Lead Actor Name: "+m.lead_actor+"Lead Actress Name: "+m.lead_actress+"Genre"+m.genre+":");
			}
		}
		
	}
	public static void find_movie_by_movie_genre(String g) {
		for(MovieDetails m:mv) {
			if(g.equalsIgnoreCase(m.genre)) {
				System.out.println("Movie Name: "+m.mov_Name+"Lead Actor Name: "+m.lead_actor+"Lead Actress Name: "+m.lead_actress+"Genre"+m.genre+":");
			}
		}
	}
	public static void sortmov(String sort) {
		if(sort.equalsIgnoreCase("Movie Name: ")) {
			Set<MovieDetails>mvname = new TreeSet<MovieDetails>(new MovieNameComparator());
			MovieDetails mn1 = new MovieDetails("Dhoom","John","Abhishek","Action");
			MovieDetails mn2 = new MovieDetails("Baaghi","Tiger", "Shraddh","Action");
			MovieDetails mn3 = new MovieDetails("Caption America","ChrisEvans","Natalie","Superhero");
			MovieDetails mn4 = new MovieDetails("Kabir Singh","Shahid","Kiara","Romantic");
			mvname.add(mn1);
			mvname.add(mn2);
			mvname.add(mn3);
			mvname.add(mn4);
			System.out.println("Movies Added:");
			for(MovieDetails mn:mvname) {
				System.out.println("Movie Name: "+mn.mov_Name+"Lead Actor Name: "+mn.lead_actor+"Lead Actress Name: "+mn.lead_actress+"Genre"+mn.genre+":");
		}

		}
		else if(sort.equalsIgnoreCase("Actor Name: ")) {
			Set<MovieDetails>mvactor = new TreeSet<MovieDetails>(new ActorComparator());
			MovieDetails ma1 = new MovieDetails("Dhoom","John","Abhishek","Action");
			MovieDetails ma2 = new MovieDetails("Baaghi","Tiger", "Shraddh","Action");
			MovieDetails ma3 = new MovieDetails("Caption America","ChrisEvans","Natalie","Superhero");
			MovieDetails ma4 = new MovieDetails("Kabir Singh","Shahid","Kiara","Romantic");
			mvactor.add(ma1);
			mvactor.add(ma2);
			mvactor.add(ma3);
			mvactor.add(ma4);
			System.out.println("Movies Added:");
			for(MovieDetails ma:mvactor) {
				System.out.println("Movie Name: "+ma.mov_Name+"Lead Actor Name: "+ma.lead_actor+"Lead Actress Name: "+ma.lead_actress+"Genre"+ma.genre+":");
		}

		}
		else if(sort.equalsIgnoreCase("Actress Name: ")) {
			Set<MovieDetails>mvactress = new TreeSet<MovieDetails>(new ActressComparator());
			MovieDetails maa1 = new MovieDetails("Dhoom","John","Abhishek","Action");
			MovieDetails maa2 = new MovieDetails("Baaghi","Tiger", "Shraddh","Action");
			MovieDetails maa3 = new MovieDetails("Caption America","ChrisEvans","Natalie","Superhero");
			MovieDetails maa4 = new MovieDetails("Kabir Singh","Shahid","Kiara","Romantic");
			mvactress.add(maa1);
			mvactress.add(maa2);
			mvactress.add(maa3);
			mvactress.add(maa4);
			System.out.println("Movies Added:");
			for(MovieDetails maa:mvactress) {
				System.out.println("Movie Name: "+maa.mov_Name+"Lead Actor Name: "+maa.lead_actor+"Lead Actress Name: "+maa.lead_actress+"Genre"+maa.genre+":");
		}

		}
		else if(sort.equalsIgnoreCase("Genre: ")) {
			Set<MovieDetails>mvg = new TreeSet<MovieDetails>(new GenreComparator());
			MovieDetails g1 = new MovieDetails("Dhoom","John","Abhishek","Action");
			MovieDetails g2 = new MovieDetails("Baaghi","Tiger", "Shraddh","Action");
			MovieDetails g3 = new MovieDetails("Caption America","ChrisEvans","Natalie","Superhero");
			MovieDetails g4 = new MovieDetails("Kabir Singh","Shahid","Kiara","Romantic");
			mvg.add(g1);
			mvg.add(g2);
			mvg.add(g3);
			mvg.add(g4);
			System.out.println("Movies Added:");
			for(MovieDetails g:mvg) {
				System.out.println("Movie Name: "+g.mov_Name+"Lead Actor Name: "+g.lead_actor+"Lead Actress Name: "+g.lead_actress+"Genre"+g.genre+":");
		}

		}
	}
		public static void main(String [] args) {
			add_movie();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the movie name you want to find: ");
			String name= sc.nextLine();
			remove_movie_by_mov_name(name);
			System.out.println("Enter the movie genre you want to find: ");
			String genre=sc.nextLine();
			find_movie_by_movie_genre(genre);
			System.out.println("Enter on the basis you want to sort: ");
			String s=sc.nextLine();
			sortmov(s);
			remove_movie();
			remove_moviesAll();
	}

}
