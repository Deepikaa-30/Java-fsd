package eml;

import java.util.*;
import java.util.regex.*;


public class EmailValidation {


	public static boolean isValid(String emails)
	 {
	 String mailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]"    //  Strict Regular Expression Validation 
	 		+ "+(\\.[A-Za-z0-9_-]+)*@"                   // is used , it will check both domain part 
	        +"[^-][A-Za-z0-9-]+"                         // and user part as well .
	        + "(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	 
	 Pattern patt = Pattern.compile(mailRegex);
	 if (emails == null)
	 return false;
	 return patt.matcher(emails).matches();
	 }


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> email= new ArrayList<String>();
		
		System.out.println("EMAILID VALIDATION");
		System.out.println();
		email.add("ritu@gmail.com");
		email.add("deepika@gmail.com");
		email.add("renuolk.com");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter email: ");
		String searchElement = input.nextLine(); 
				
		
        if((isValid(searchElement)) && (email.contains(searchElement))){
		    System.out.println("email ID" + searchElement + "found");
		}
		else{
		    System.out.println("email ID" + searchElement + "not found");
		}
		 
	
	}
}