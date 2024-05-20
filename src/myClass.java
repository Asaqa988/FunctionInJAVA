
public class myClass {

//	static double printWelcomeMsgPlustheNameOfTheUser(String FirstName,int age,double salary) {
//		if(age>18) {
//			System.out.println("hello "+ FirstName +" you can enter welcome ");
//		}else {
//			System.out.println("sorry "+ FirstName + " you must be above 18");
//		}
//		
//		return salary +20 ; 
//		
	/*
	 * this is part two
	 */
//		if(age>18) {
//		System.out.println("hello "+ FirstName +" you can enter welcome ");
//		return salary +20 ; 
//
//	}else {
//		System.out.println("sorry "+ FirstName + " you must be above 18");
//		return salary ; 
//
//	}

//	}

	static double calculate_The_Tax(double salary, double tax) {

		if (salary >= 300) {

			return  salary * tax;
		}else {
			
			return salary-salary; 
		}
	}

	public static void main(String[] args) {

//System.out.println(printWelcomeMsgPlustheNameOfTheUser("ahmad", 25, 600));
		
		System.out.println(calculate_The_Tax(301, .16));
		System.out.println(calculate_The_Tax(200, 0));


	}
	
	// write a function that ask the user to enter 2 numbers and return the mod of those two numbers 

}
