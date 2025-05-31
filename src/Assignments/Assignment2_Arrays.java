package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		//3D Array: Semesters --> Subjects --->{Subject Name , Status/Marks}
		String[][][] data = {
				{//Semester 1
					{"Mathematics 1" ,"Pass(78)"}, //Index 0
					{"Physics", "Pass(85)"}, //Index 1
					{"Chemistry", "Fail(21)"}, //Index 2
					{"Computer Programming","Pass(74)"}, //Index 3
					{"Engineering Drawing","Pass(88)"}, //Index 4
					{"Basic Electrical Eng.","Pass(79)"} //Index 5
				},
				{//Semester 2
					{"Mathematics II","Pass(82)"}, //Index 0
					{"Mechanics","Pass(77)"}, //Index 1
					{"EnvironmentalSci.","Pass(93)"}, //Index 2
					{"Basic Electronics","Fail(19)"}, //Index 3
					{"Engineering Physics","Fail(24)"}, //Index 4
					{"Engineering Graphics","Pass(90)"} //Index 5
					},
				{//Semester 3
					{"Data Structures","Pass(88)"}, //Index 0
					{"Discrete Mathematics","Pass(81)"}, //Index 1
					{"Digital Electronics","Pass(76)"}, //Index 2
					{"Operating Systems","Fail(32)"}, //Index 3
					{"Signals and Systems","Pass(85)"}, //Index 4
					{"Object-Oriented Prog.","Pass(78)"} //Index 5
				},
				{//Semester 4
					{"Algorithms","Pass(91)"}, //Index 0 -Subj 1
					{"Computer Networks","Pass(73)"}, //Index 1 - subj2
					{"Database Systems","Fail(19)"}, //Index 2 - Subj 3
					{"Microprocessors","Pass(80)"}, //Index 3 - Subj 4
					{"Communication Eng.","Pass(76)"},//Index 4 - Subj 5
					{"Software Engineering","Pass(87)"}//Index 5 - Subj 6
				},
				{//Semester 5
					{"Probability & Stats","Pass(86)"},//Index 0
					{"Machine Learning","Pass(88)"},//Index 1
					{"Compiler Design","Pass(84)"},//Index 2
					{"Theory of Computation","Pass(95)"},//Index 3
					{"Embedded Systems","Pass(73)"},//Index 4
					{"Computer Graphics","Pass(90)"}//Index 5
				}
				};
		//Print Semester 2 Subject 4 and Subject 5 names
		System.out.println(data[1][3][0]);
		System.out.println(data[1][4][0]);
				
		//Print Status/Marks of Semester 4 Subject 3 and Subject 6
		System.out.println(data[3][2][1]);
		System.out.println(data[3][5][1]);
	}
}
