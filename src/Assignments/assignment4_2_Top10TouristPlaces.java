package assignments;

import java.util.HashSet;
import java.util.Set;

public class assignment4_2_Top10TouristPlaces {

	public static void main(String[] args) {
		
		//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.**/

		 Set<String> attractions = new HashSet<>();
	        attractions.add("NewZealand");
	        attractions.add("Japan");
	        attractions.add("NewYork");
	        attractions.add("Maldives");
	        attractions.add("Times Square");
	        attractions.add("Loandon");
	        attractions.add("Australia");
	        attractions.add("Niagara Falls");
	        attractions.add("Burj Khalifa");
	        attractions.add("Kashmir");
	        
	        System.out.println(attractions);
	        System.out.println("Total number of attractions: " + attractions.size());

	}

}
