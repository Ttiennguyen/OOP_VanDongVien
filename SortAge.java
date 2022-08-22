import java.util.Comparator;

public class SortAge implements Comparator<YourObjectAthletes> {

	@Override
	public int compare(YourObjectAthletes o1, YourObjectAthletes o2) {
		if(o1.yourAge>o2.yourAge)
		{
			return -1;
		}
		return 1;
	}
	

}
