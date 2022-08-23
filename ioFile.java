import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ioFile {
	
	public void readFile()
	{
		ArrayList<YourObjectAthletes> listAth = new ArrayList<YourObjectAthletes>();
		try 
		{
			File f = new File("Athletes.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			  String line = br.readLine();
	            while(line != null) 
	            {
	            	  String arr[] = line.split("[|]+");
	            	  YourObjectAthletes yourAth = new YourObjectAthletes(arr[0],arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[3]),Double.parseDouble(arr[4]));
	            	  yourAth.outputInformation();
	            	  listAth.add(yourAth);
	            	  line = br.readLine();
	            }
	            br.close();
	            fr.close();
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	 }
	
	public void writeFile(List<YourObjectAthletes> listAth)
	{
		
		try 
		{
			File f = new File("Athletes.txt");
			FileWriter fw = new FileWriter(f,true);
			 PrintWriter pw = new PrintWriter(fw);
			 for(YourObjectAthletes ath: listAth) 
			 {
				 String line = "|"+ath.getIdAthletes()+"|"+ath.getFullName()+"|"+ath.getYourAge()+"|"+ath.getYearOfBirth()+"|"+ath.getYourSalary();
				 pw.println(line);
			 }
				 pw.close();
	            fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
