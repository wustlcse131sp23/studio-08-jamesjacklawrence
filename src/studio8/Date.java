package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month;
	
	private int day;
	
	private int year;
	
	private boolean isHoliday;

    /**
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		
		super();
		
		this.month = month;
		
		this.day = day;
		
		this.year = year;
		
		this.isHoliday = isHoliday;
		
	}
	
	@Override
	public String toString() {
		
		return "Date [month=" + month + ", day=" + day + ", year=" + year + ", isHoliday=" + isHoliday + "]";
		
	}
	
	

	@Override
	public int hashCode() {
		
		return Objects.hash(day, isHoliday, month, year);
		
	}



	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		Date other = (Date) obj;
		
		return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
		
	}



	public static void main(String[] args) {
		
		Date d1 = new Date (11, 9, 2001, false);

		Date d2 = new Date (8, 29, 1998, false);
		
		Date d3 = new Date (8, 12, 2003, false);
		
		Date d4 = new Date (7, 4, 1776, true);
		
		Date d5 = new Date (10, 1, 1949, true);
		
		LinkedList <Date> list = new LinkedList <Date>();
		
		list.add(d1);
		
		list.add(d2);
		
		list.add(d3);
		
		list.add(d4);
		
		list.add(d5);
		
		System.out.println(list);
		
		HashSet <Date> set = new HashSet <Date>();
		
		set.add(d1);
		
		set.add(d2);
		
		set.add(d3);
		
		set.add(d4);
		
		set.add(d5);

    }


}
