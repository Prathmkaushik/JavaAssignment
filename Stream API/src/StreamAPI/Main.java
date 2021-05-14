package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

class Main {

	public static void main(String[] args) {
		List<Fruit> fru = Arrays.asList(

				new Fruit("Apple", 98, 45, "Red"), new Fruit("Banana", 102, 30, "Yellow"),
				new Fruit("Strwabeery", 120, 55, "Red"), new Fruit("Blackberry", 78, 34, "Black"));

		List<News> news1 = Arrays.asList(

				new News(22, "Navin", "Asha", " the new budget lis is good"),
				new News(23, "Venky", "naga", "Finally ipl Started"),
				new News(23, "Venky", "Naga", "I supported to MI "), new News(24, "Ashish", "Narhsa", "wbu 12 exam"),
				new News(22, "Navin", "Yallesh", "without budget list face too much problem"),
				new News(23, "Venky", "Naga", "ipl india ka festival"));
		List<Trader> Trade = Arrays.asList(

				new Trader("Manoj", "Pune"), new Trader("Sanjay", "Mumbai"), new Trader("Pankaj", "Delhi"),
				new Trader("Omkar", "Pune"), new Trader("Naveen", "Delhi"), new Trader("Jatin", "Pune"));
		List<Transaction> Tran = Arrays.asList(

				new Transaction(new Trader("Manoj", "Pune"), 2014, 20000),
				new Transaction(new Trader("Sanjay", "Mumbai"), 2012, 21000),
				new Transaction(new Trader("Pankaj", "Delhi"), 2019, 70000),
				new Transaction(new Trader("Omkar", "Pune"), 2017, 22222),
				new Transaction(new Trader("Naveen", "Delhi"), 2014, 19999),
				new Transaction(new Trader("Jatin", "Pune"), 2015, 17000));
 
		System.out.println("Acoording to <less calories ");
		fru.stream().filter(t -> (t.FruitCalories < 100)).collect(Collectors.toList())
				.forEach(t -> System.out.println(t));

		
		System.out.println("\nSort according to color");
		fru.stream().sorted((p1, p2) -> p1.FruitColor.compareTo(p2.FruitColor)).forEach(System.out::println);

		
		System.out.println("\nSort Red color fruits sorted withprice in ascending");
		fru.stream().filter(t -> t.FruitColor.equals("Red")).forEach(t -> System.out.println(t));

		
		System.out.println("\nnewsId which has received maximum comments");
		int p = news1.stream().min((p1, p2) -> {
			return (int) p1.getNewsID() + p2.getNewsID();
		}).get().getNewsID();
		System.out.println(p);

		
		System.out.println("\nthe word 'budget' arrived in user comments ");

		news1.stream().filter(t -> t.NewsComment.contains("budget")).forEach(t -> System.out.println(t));

		
		System.out.println("\nwhich user has posted maximum comments");
		String n = news1.stream().max((p1, p2) -> {
			return (int) p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser());
		}).get().getNewsCommentbyUser();

		System.out.println(n);


		System.out.println("\ncommentByUser wise number of comments");
		news1.stream().sorted((p1, p2) -> p1.getNewsCommentbyUser().compareTo(p2.getNewsCommentbyUser()))
				.collect(Collectors.toList())
				.forEach(t -> System.out.println(t.NewsCommentbyUser + "=" + t.NewsComment));

		
		System.out.println("\ntransactions in the year 2011 and sort them by value (small to high).");
		Tran.stream().filter(t -> (t.getYear() == (2014)))
				.forEach(t -> System.out.println("year=" + t.year + " value=" + t.value));

		
		System.out.println("\nall the unique cities where the traders work");

		Trade.stream()

				.forEach(t -> System.out.println("Cityies=" + t.TradeCity));

		
		System.out.println("\ntraders from Pune and sort them by name");
		Trade.stream().filter(t -> t.TradeCity.equals("Pune"))
				.sorted((p1, p2) -> p1.TraderName.compareTo(p2.TraderName))
				.forEach(t -> System.out.println(t.TradeCity + "=" + t.TraderName));

		
		System.out.println("\nstring of all traders’ names sorted alphabetically");
		Trade.stream().sorted((p1, p2) -> p1.TraderName.compareTo(p2.TraderName))
				.forEach(t -> System.out.println(t.TraderName));

		
		System.out.println("\nany traders based in Indore?");
		boolean a = Trade.stream().anyMatch(t -> t.TraderName.equals("indore"));
		System.out.println(a);

		
		System.out.println("\nall transactions’ values from the traders living in Delhi");

		Tran.stream().filter(t -> t.trader.TradeCity.equals("Delhi"))
				.forEach(t -> System.out.println(t.trader.TradeCity + "=" + t.value));

		
		System.out.println("\nhighest value of all the transactions");

		int b = Tran.stream().max((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(b);
		
		System.out.println("\ntransaction with the smallest value");
		int s = Tran.stream().min((p1, p2) -> p1.value - p2.value).get().getValue();

		System.out.println(s);

	}

}
