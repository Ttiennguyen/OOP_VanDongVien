import java.util.Comparator;

public class SortSalary implements Comparator<YourObjectAthletes> {
	@Override
	public int compare(YourObjectAthletes o1, YourObjectAthletes o2) {
		if(o1.yourSalary>o2.yourSalary)
		{
			return 1;
		}
		return -1;
	}

}
