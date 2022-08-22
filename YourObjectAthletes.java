import java.util.Scanner;

public class YourObjectAthletes {

	public String idAthletes;
	public String fullName;
	public int yourAge;
	public int yearOfBirth;
	public double yourSalary;
	
	Scanner input = new Scanner(System.in);
	
	// getter setter 
	public String getIdAthletes() {
		return idAthletes;
	}
	public void setIdAthletes(String idAthletes) {
		this.idAthletes = idAthletes;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getYourAge() {
		return yourAge;
	}
	public void setYourAge(int yourAge) {
		this.yourAge = yourAge;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public double getYourSalary() {
		return yourSalary;
	}
	public void setYourSalary(double yourSalary) {
		this.yourSalary = yourSalary;
	}
	
	// constructor
	public YourObjectAthletes(String idAthletes, String fullName, int yourAge, int yearOfBirth, double yourSalary) {
		this.idAthletes = idAthletes;
		this.fullName = fullName;
		this.yourAge = yourAge;
		this.yearOfBirth = yearOfBirth;
		this.yourSalary = yourSalary;
	}
	
	public YourObjectAthletes() {
		
	}
	
	// method input and output information
	public void inputInformation() {
		System.out.println("Enter Athlete ID:");
		idAthletes = input.next();
		System.out.println("Enter Athlete's Name:");
		fullName = input.next();
		input.hasNextLine(); //stick line
		System.out.println("Enter Athlete's Age:");
		yourAge = input.nextInt();
		System.out.println("Enter Athlete's Year Of Birth:");
		yearOfBirth = input.nextInt();
		System.out.println("Enter Athlete Salary:");
		yourSalary = input.nextDouble();	
	}
	
	public void outputInformation() {
		System.out.println("|"+idAthletes+"\t|"+fullName+"\t|"+yourAge+"\t|"+yearOfBirth+"\t\t|"+yourSalary);
	}
	
	

}
