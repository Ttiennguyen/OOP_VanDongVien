import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AthletesManagement {
	
	 int amountAth; 
	
	 YourObjectAthletes yourAth = new YourObjectAthletes();
	 ioFile f = new ioFile();
	 public List<YourObjectAthletes> listAth; // create array
	 
	 Scanner input = new Scanner(System.in);
	 
	 public AthletesManagement()
	 {
		 listAth = new ArrayList<>();
	 }
	 
	 public void addAth(YourObjectAthletes athletes)
	 {
		 listAth.add(athletes);
	 }
	 
	 public void outputIn()
	 {
		for(YourObjectAthletes ath: listAth)
			{
				ath.outputInformation();
			}
	 }
	 
	 public void searchInformation()
	 {
		System.out.println("Enter the name of the athlete you want to search:");
		String checkName = input.nextLine();		
			for(YourObjectAthletes ath: listAth)
			{
				if(ath ==null)
					continue;
				if(checkName.equals(ath.fullName)) // check name equal
				{
					ath.outputInformation();
				}
			}
	 }
	 
	 public void editInformation()  
	 {
		 System.out.println("Enter the athlete id to edit:");
		 String checkId = input.nextLine();
		 int index = 0;
		 for(int i =0; i<listAth.size(); i++) //test loop
		  {
			 YourObjectAthletes ath = listAth.get(i);				
			  if(checkId.equals(ath.idAthletes)) // check id equal
			  {	
					index = i;
					ath.inputInformation();					
					break;
				}
				else 
				{
					System.out.println("No Information");
				}
				listAth.remove(index);
				f.writeFile(listAth);
		  }		 
		}
	 
	 public void deleteInformation()
	 {
		 System.out.println("Enter the athlete id you want to delete:");
		 String checkId = input.nextLine();
		 int index = 0;
		 for(int i =0; i<listAth.size(); i++)
		 {
			 YourObjectAthletes ath = listAth.get(i);
			 if(checkId.equals(ath.idAthletes)) // check id equal
			 {	
				 index = i;
				 break;
			 }				
		 }
		 listAth.remove(index);
		 f.writeFile(listAth);
	  }
	 
	 public void sortSalary() {
		  //Sort up ascending
		  Collections.sort(listAth, new SortSalary());
	 }
	 
	 public void sortAge() {
		  //Sort descending
		  Collections.sort(listAth, new SortAge());
	 }
	 
}
