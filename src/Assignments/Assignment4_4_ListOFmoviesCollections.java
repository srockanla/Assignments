package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_4_ListOFmoviesCollections {

	public static void main(String[] args) {
        //**4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.**//
		
		  List<String> movies = new ArrayList<>();
		  
		  movies.add("Bahubali");
		  movies.add("RRR");
		  movies.add("Amaran");
		  movies.add("URI");
		  movies.add("HIT");
		  
		  System.out.println("Third highest grossing movie is  " + movies.get(3));
		 

	}

}
