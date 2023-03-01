package entities.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import entities.exceptions.DomainException;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {		
		if (!checkOut.after(checkIn)){
			throw new DomainException( "Error in reservation: Check-out date must be after check-in date");	 			
		}else {		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		}
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getcheckOut() {
		return checkOut;
	}
	
	public long duration() {
		
		long diif = checkOut.getTime()- checkIn.getTime();
		return TimeUnit.DAYS.convert(diif, TimeUnit.MILLISECONDS);		
	}
	
	public void upDateDates(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Error in reservation: Reservation dates for update must be future date");		
		}else if (!checkOut.after(checkIn)){
			throw new DomainException( "Error in reservation: Check-out date must be after check-in date");	 			
		}else {				
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		}		
	}

	@Override
	public String toString() {
		return "Romm"
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn)
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights.";								
	}
	
	

}
