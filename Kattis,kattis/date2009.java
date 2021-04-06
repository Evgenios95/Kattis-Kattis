import java.util.*;

public class date2009 {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		int month = sc.nextInt();
		
		String[] days = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int i = 0; i < month  -1; i++) {
			day += months[i];
		}
		
		System.out.print(days[day % 7]);
	}
	

}
