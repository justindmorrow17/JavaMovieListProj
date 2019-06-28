import java.util.*;

public class MovieList {

	public static void main(String[] args) {

		System.out.println("Welcome to the Movie List Application");
		System.out.println("There are 20 movies in the list");
		System.out.println("Let's watch a movie.");

		String choice = "y";

		Scanner sc = new Scanner(System.in); // declaring a Scanner variable and creating an instance of Scanner class

//Stores the movies in a list by category
		ArrayList<String> animated = new ArrayList<>();
		animated.add("Toy Story");
		animated.add("Finding Nemo");
		animated.add("Up");
		animated.add("Lion King");
		animated.add("The Incredibles");

		ArrayList<String> drama = new ArrayList<>();
		drama.add("The Godfather");
		drama.add("Pulp Fiction");
		drama.add("The Wolf of Wall Street");
		drama.add("The Shawshank Redemption");
		drama.add("Fight Club");

		ArrayList<String> horror = new ArrayList<>();
		horror.add("Scream");
		horror.add("The Shining");
		horror.add("Psycho");
		horror.add("Silence of the Lambs");
		horror.add("28 Days Later");

		ArrayList<String> scifi = new ArrayList<>();
		scifi.add("The Matrix");
		scifi.add("Star Wars: Empire Strikes Back");
		scifi.add("Star Trek: The Wrath of Khan");
		scifi.add("Avatar");
		scifi.add("The Fifth Element");

		while (choice.equals("y")) {
			System.out.print("Are you interested in animated, drama, horror, or scifi?");
			String category = sc.nextLine();
//			System.out.println("Category is: " + category);
			if (category.equals("animated")) {
				System.out.println(animated);

			} else if (category.equals("drama")) {
				System.out.println(drama);

			} else if (category.equals("horror")) {
				System.out.println(horror);

			} else if (category.equals("scifi")) {
				System.out.println(scifi);

			} else {
				System.out.println("Maybe next time");
			}

			System.out.println("Continue? y/n): ");
			choice = sc.nextLine();
		}
		System.out.println("Maybe next time.");
		sc.close();
	}
}
