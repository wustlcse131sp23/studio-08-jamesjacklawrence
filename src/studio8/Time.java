package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Time {
	
	private int hour;
	
	private int minute;	

	/**
	 * @param hour
	 * @param minute
	 */
	public Time(int hour, int minute) {
		
		super();
		
		this.hour = hour;
		
		this.minute = minute;
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;
		
		if (getClass() != obj.getClass())
			
			return false;
		
		Time other = (Time) obj;
		
		return hour == other.hour && minute == other.minute;
	}

	@Override
	public String toString() {
		
		return "Time [hour=" + hour + ", minute=" + minute + "]";
		
	}

	public static void main(String[] args) {
 
		
		Time t1 = new Time (20, 10);

		Time t2 = new Time(12, 0);
		
		Time t3 = new Time (17, 9);
		
		Time t4 = new Time (13, 30);
		
		Time t5 = new Time (3, 5);
		
		LinkedList <Time> list = new LinkedList <Time>();
		
		list.add(t1);
		
		list.add(t2);
		
		list.add(t3);
		
		list.add(t4);
		
		list.add(t5);
		
		System.out.println(list);
		
		HashSet <Time> set = new HashSet <Time>();
		
		set.add(t1);
		
		set.add(t2);
		
		set.add(t3);
		
		set.add(t4);
		
		set.add(t5);
		
		System.out.println(set);
    	
    }

	/**
	 * @return the hour
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * @param hour the hour to set
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}

}