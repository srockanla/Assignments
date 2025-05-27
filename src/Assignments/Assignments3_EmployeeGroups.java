package Assignments;

public class Assignments3_EmployeeGroups {

	public static void main(String[] args) {
		Employees obj = new Employees();
		String[] employeeNames = { obj.empName, obj.empName2, obj.empName3};
		int[] employeeIDs = { obj.empId ,obj.empId2 , obj.empId3};
		System.out.println(employeeNames[0] + ":" + employeeIDs[0]);
	}

}
