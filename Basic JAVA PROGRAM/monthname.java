//write a program get month name and display he days of month using switch statement.
import java.util.*;
public class monthname
{ 
    public static void main(String[] args) 
    { 
        Scanner scn=new Scanner(System.in);
	System.out.println("Enter Month Name");
	String str = scn.nextLine(); 
        switch(str.toLowerCase()) 
        { 
            case "january":
		case "march":
		case "may":
		case "july":
		case "august":
		case "october":
		case "december": 
                	System.out.println("31 Days in a month"); 
                break;
             case "April":
		case "june":
		case "september":
		case "novmber":
                	System.out.println("30 Days in month"); 
                break; 
            case "Febuary": 
                System.out.println("28 Days in a month"); 
                break; 
            default: 
                System.out.println("no match"); 
        } 
    } 
} 