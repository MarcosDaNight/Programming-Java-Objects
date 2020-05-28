package model.entites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exceptions.mainExceptions;

public class Reservation {
	/**
	 * Creating variables to use in each assignment
	 */
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	/**
	 * This data was declared as static so that it is not instantiated for 
	 * each reservation object that the application has.
	 */
	private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
	
	/*Calling the class and an respective parameters */
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		if ( checkOut.before(checkIn)) {
			throw new mainExceptions("Checkout dates for update must be future days");
			
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}


	public Integer getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}


	public Date getCheckin() {
		return checkIn;
	}


	public Date getCheckout() {
		return checkOut;
	}


	public long duration() {
		/**
		 * Invoking a complex class / enums that can convert 
		 * milliseconds to days.
		 * @author Marcos Gostoso
		 */
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut){
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new mainExceptions("Reservation dates for update must be future days");
			
		}
		if ( checkOut.before(checkIn)) {
			throw new mainExceptions("Checkout dates for update must be future days");
			
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
	}
	
	@Override
	public String toString() {
		return  "Reservation: Room "
				+ roomNumber
				+ ", check-In: "
				+ sdf.format(checkIn)
				+ ", check-Out: "
				+ sdf.format(checkOut)
				+", "
				+ duration()
				+ " nights";
	}

}
