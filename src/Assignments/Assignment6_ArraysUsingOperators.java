package assignments;

public class Assignment6_ArraysUsingOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//***Create arrays for Student names and Original Marks ***
		
		 String[] studentNames = {"Suresh", "Mahesh", "Naresh"};
	        int[] originalMarks = {75, 80, 82};
	        
	        //*** Add 10 marks to each student marks before printing so use the + before variable**//
	        originalMarks[0] +=10 ;
	        originalMarks[1] +=10 ;
	        originalMarks[2] +=10 ;
	        
	        //**Print updated marks as expected output in assignment 6**///
	        //** Updated Marks
	        //** StudentName : Original Marks
	        //** e.g., Suresh : 75
	        System.out.println("Updated Marks");
	        System.out.println(studentNames[0] + ":" + originalMarks[0]);
	        System.out.println(studentNames[1] + ":" + originalMarks[1]);
	        System.out.println(studentNames[2] + ":" + originalMarks[2]);
	        

	}

}
