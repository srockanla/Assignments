package assignments;

public class Assignment7_ConditionStatement {

	public static void main(String[] args) {
		// Now based on below details, print whether user is eligible to get the loan or not
		// customerName = "John Doe";
		// creditScore = 720;
		// income = 55000.0;
		// isEmployed = true;
		// debtToIncomeRatio = 35.0;  ***//
		
		
		String name = "John Doe";
		int creditscore = 720;
		double income = 55000.0;
		boolean isEmployed = true ;
		double debtToIncomeRatio = 35.0 ;
		
		//***1. Credit Score:
		// If the credit score is above 750, the loan is automatically approved.
		// If the credit score is between 650 and 750, additional checks are performed.
		// If the credit score is below 650, the loan is denied.
		if (creditscore > 600) {
		System.out.println("The loan is approved for" + name);
	}
	else if (creditscore >= 650 && creditscore <= 750) {
	//For credit scores between 650 and 750, the customer’s income must be at least $50,000 for the loan to be considered.
if (income >= 50000) {
	// consider if the customer is employed or not
	if (isEmployed= true) {
		//check if customer DTI is 40
		if (debtToIncomeRatio < 40.0) {
			System.out.println("Loan is eligible" + name);
		}
		}else { System.out.println("Loan is not eligible as DTI is too high for" + name);
	}
	}else {
		System.out.println( name + "Loan is not eligible as he is unemployed");
	}
	} else 
	{System.out.println("income is less than 50000 for " + name);
	}
	}
	{ 	System.out.println("Loan is not eligible as credit score is below 650");
	}
	}