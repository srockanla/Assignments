package assignments;

import java.util.ArrayList;
import java.util.List;

public class assignment4_CollectionsLargestCities {

	public static void main(String[] args) {
		
		List<String> cityNamesArrayList = new ArrayList<String>();
		cityNamesArrayList.add("Hyderabad");
		cityNamesArrayList.add("Banglore");
		cityNamesArrayList.add("Pune");
		cityNamesArrayList.add("Mumbai");
		cityNamesArrayList.add("Delhi");
		
		List<Double> cityAreaArrayList = new ArrayList<>();
		
		cityAreaArrayList.add(1234.9);
		cityAreaArrayList.add(2345.0);
		cityAreaArrayList.add(3456.8);
		cityAreaArrayList.add(4567.2);
		cityAreaArrayList.add(5678.3);
		
		//Combined city area for City 3 and City 4
		
double combinedCityArea = cityAreaArrayList.get(3) + cityAreaArrayList.get(4);
		
		//Print City 3 and 4 area
		
		System.out.println("The Combined area of City 3 and 4 is" +   combinedCityArea);

	}

}
