import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YourMenuList {
	
	public static void main(String[] args)  throws Exception {
		
		ArrayList<YourObjectAthletes> listAth = new ArrayList<YourObjectAthletes>();
		
		Scanner input = new Scanner(System.in);
		
		boolean flag = true;
		
		int inputNumber,amountAth;
		
		AthletesManagement managementAth = new AthletesManagement();
		ioFile f = new ioFile();
		
		System.out.println("\t\t\t ATHLETES MANAGEMENT PROGRAM \t\t\t");
		
		do {
			 System.out.println("+----- \t\t\t Select The Function To Do \t\t    -----+");
		     System.out.println("| 1.View list of Athletes \t\t\t\t\t\t |");
		     System.out.println("| 2.View a list of Athletes sorted by salary ascending \t\t\t |");
		     System.out.println("| 3.View a list of Athletes sorted by salary ascending and age descending|");
		     System.out.println("| 4.Find Athletes by name \t\t\t\t\t\t |");
		     System.out.println("| 5.Add Athletes to the list \t\t\t\t\t\t |");
		     System.out.println("| 6.Delete Athlete by id \t\t\t\t\t\t |");
		     System.out.println("| 7.Edit Athlete by id \t\t\t\t\t\t\t |");
		     System.out.println("| 8.End program \t\t\t\t\t\t\t |");
		     System.out.println("+------------------------------------------------------------------------+");
		     inputNumber = input.nextInt();
		     
		     switch (inputNumber) {
		     		case 1:
		     			System.out.println("|ID\t|Name\t|Age\t|Year of Birth\t|Salary");
		     			System.out.println("-----------------------------------------------");
		     			managementAth.outputIn();
		     			System.out.println("Output file");
		     			f.readFile();
		     			break;
		     		case 2:
		     			System.out.println("Sort by Salary ascending");
		     			System.out.println("|ID\t|Name\t|Age\t|Year of Birth\t|Salary");
		     			System.out.println("-----------------------------------------------");
		     			managementAth.sortSalary();
		     			managementAth.outputIn();
		     			break;
		     		case 3:
		     			System.out.println("Sort by Salary ascending");
		     			System.out.println("|ID\t|Name\t|Age\t|Year of Birth\t|Salary");
		     			System.out.println("-----------------------------------------------");
		     			managementAth.sortSalary();
		     			managementAth.outputIn();
		     			System.out.println("");
		     			System.out.println("Sort by age descending");
		     			System.out.println("|ID\t|Name\t|Age\t|Year of Birth\t|Salary");
		     			System.out.println("-----------------------------------------------");
		     			managementAth.sortAge();
		     			managementAth.outputIn();
		     			break;
		     		case 4:
		     			managementAth.searchInformation();
		     			break;
		     		case 5:
		     			System.out.println("Enter the number of athletes:");
		     			amountAth = input.nextInt();
		     	 		System.out.println("Enter the following list:");
		     	 		for(int i =0; i<amountAth; i++)
		     	 		{
		     	 			YourObjectAthletes yourAth = new YourObjectAthletes();
		     	 			yourAth.inputInformation();
		     	 			managementAth.addAth(yourAth);
		     	 			listAth.add(yourAth);
		     	 		}
		     	 		f.writeFile(listAth);
	            		break;
		     		case 6:
		     			managementAth.deleteInformation();
		     			break;
		     		case 7:
		     			managementAth.editInformation();
		     			break;
		     		case 8:
		     			System.out.println("Goodbye");
	                    flag = false;
	                    break;
		     		default:
	                    System.out.println("Enter wrong!!!!!");
	                    System.out.println("Reset Program");
	                    flag = false;
	                    break;
		     
		     }
		    
			
		} while (flag);//end loop
		
	}
	
}
