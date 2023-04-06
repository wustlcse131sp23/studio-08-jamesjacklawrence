package studio8;

import java.awt.datatransfer.SystemFlavorMap;

import java.util.LinkedList;

import java.util.Objects;



public class Appointment {

	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}




	private Date date;
	
	private Time time; 




	/**
	 * @param date
	 * @param time
	 */
	private Appointment(Date date, Time time) {
		
		super();
		
		this.date = date;
		
		this.time = time;
	}




	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}




	public static void main (String[] args) {
		
		Date d1 = new Date (11, 9, 2001, false);
		
		Date d2 = new Date (8, 29, 1998, false);
		
		Date d3 = new Date (8, 12, 2003, false);
		
		Date d4 = new Date (7, 4, 1776, true);
		
		Date d5 = new Date (10, 1, 1949, true);
		
		Time t1 = new Time (20, 10);

		Time t2 = new Time(12, 0);
		
		Time t3 = new Time (17, 9);
		
		Time t4 = new Time (13, 30);
		
		Time t5 = new Time (3, 5);
		
		Appointment a1 = new Appointment (d1, t1);
		
		Appointment a2 = new Appointment (d2, t2);
		
		Appointment a3 = new Appointment (d3, t3);
		
		Appointment a4 = new Appointment (d4, t4);
		
		Appointment a5 = new Appointment (d5, t5);
		
		LinkedList <Appointment> list = new LinkedList <Appointment>();
		
		list.add(a1);
		
		list.add(a2);
		
		list.add(a3);
		
		list.add(a4);
		
		list.add(a5);
		
		System.out.println(list);
				
		
	}
	
	

}
