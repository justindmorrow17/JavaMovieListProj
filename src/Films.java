import java.util.*;

public class Films {

	public String category;//initializing your variables
	public String title;

	public Films(String category, String title) { //Constructor
		this.category = category;
		this.title = title;
	}

	public static void main(String[] args) {

		System.out.println("Welcome to the Movie List Application.");
		System.out.println("Let's watch a movie.");

		String choice = "y"; //priming the loop

		Scanner sc = new Scanner(System.in); // declaring a Scanner variable and creating an instance of Scanner class

//		String[] movieArray = new String[20] combines both array statements into one
		Films[] movieArray; // declaring array of Strings
		movieArray = new Films[12]; // allocating an array of 12 objects

		movieArray[0] = new Films("scifi", "Avatar");
		movieArray[1] = new Films("drama", "The Godfather");
		movieArray[2] = new Films("animated", "The Incredibles");
		movieArray[3] = new Films("horror", "The Shining");
		movieArray[4] = new Films("scifi", "The Matrix");
		movieArray[5] = new Films("drama", "The Wolf of Wall Street");
		movieArray[6] = new Films("animated", "The Lion King");
		movieArray[7] = new Films("horror", "28 Days Later");
		movieArray[8] = new Films("scifi", "The Fifth Element");
		movieArray[9] = new Films("drama", "Shawshank Redemption");
		movieArray[10] = new Films("animated", "Finding Nemo");
		movieArray[11] = new Films("horror", "Scream");

		while (choice.equals("y")) {
			System.out.print("Are you interested in animated, drama, horror, or scifi?");
			String category = sc.nextLine(); //reads a string value from the user
//			System.out.println("Category is: " + category);   -->testing
			
			if (category.equals("animated")) {
				category = "animated";

			} else if (category.equals("drama")) {
				category = "drama";

			} else if (category.equals("horror")) {
				category = "horror";

			} else if (category.equals("scifi")) {
				category = "scifi";

			} else {
				System.out.println("Maybe next time");
			}
			//For loop to cycle thru the movieArray
			for (int i = 0; i < movieArray.length; i++) {
				if (category == movieArray[i].category) {
					System.out.println(movieArray[i].title);
				}
				
			}
			System.out.println("Do you want to select again? y/n:");
			choice = sc.nextLine();
		}
		System.out.println("Maybe next time.");
		sc.close();
	}
}


