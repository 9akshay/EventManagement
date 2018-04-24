
public class ServiceBooking {
	
	
	public static Adon ADSound = new Adon("Sound",100);
	public static Adon ADLight = new Adon("Light",100);
	
	public static Option OPairHall = new Option("Air Hall",200);
	public static Option OPacHall = new Option("AC Hall",500);
	
	public static Service HallBookingService;
	
	Service service;
	Option option;
	Adon adonList[];
	Person client;
	int days;
	
	public ServiceBooking(){
		Adon ADlist[] = new Adon[2];
		ADlist[0] = ADSound;
		ADlist[1] = ADLight;
		
		Option OPlist[] = new Option[2];
		OPlist[0] = OPairHall;
		OPlist[1] = OPacHall;
		
		HallBookingService = new Service("Hall Booking",1000,10,OPlist,ADlist);
	}
	
	
	public void init(Person per, Service ser, Option op, Adon al[]) {
		client = per;
		service = ser;
		option = op;
		adonList = al;
		days = 0;
	}

	public void bookService(){
		int amount = service.bookService(option, adonList);
		if(amount>0){
			Debuger.Log("------------- Client : "+client.name+" -------------");
			service.printBill();
		}
	}
}
