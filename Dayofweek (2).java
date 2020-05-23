package Home;

import java.time.LocalDate;
import java.util.Scanner;

public class Dayofweek {
	public static void main(String[] args){
		
		    LocalDate localDate = LocalDate.of(2020, 02,27);
		     
		    
		    java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		    System.out.println(localDate + " was a " + dayOfWeek);
		    LocalDate firstWorkingDay;
		     
		    
		    switch (dayOfWeek) {
		      case FRIDAY:firstWorkingDay = localDate.plusDays(3);
		        break;
		      case SATURDAY:firstWorkingDay = localDate.plusDays(2);
		        break;
		      default:firstWorkingDay=localDate.plusDays(1);
		        break;
		    }
		    
		}
		

}
