package BusResv;
import java.sql.SQLException;

public class BusDemo {
	public static void main(String[] args) throws SQLException {
		
		BusDAO busdao = new BusDAO();
		busdao.displayBusInfo();   // available buses
		
		Booking booking = new Booking();   // user input (name, bus no, date)
		
		if(booking.isAvailable()) {
			BookingDAO bookingdao = new BookingDAO();
			bookingdao.addBooking(booking);
			System.out.println("Booking successful!");
		} else {
			System.out.println("Sorry, bus is full. Booking failed.");
		}
	}
}
