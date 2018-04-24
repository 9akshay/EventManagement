
public class EventManagement {
	public static void main(String[] args) {
		
		Person akshay = new Person("Akshay Gaonkar");
		
		ServiceBooking booking = new ServiceBooking();
		
		Adon alist[] = new Adon[2];
		alist[0] = booking.ADLight;
		alist[1] = booking.ADSound;
		
		booking.init(akshay,
				booking.HallBookingService,
				booking.OPacHall,
				alist
				);
		
		booking.bookService();
	}
}
