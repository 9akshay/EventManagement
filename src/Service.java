
public class Service {
	public String name;
	public int price;
	public int tax;
	public int amount;
	
	Option op[];
	Adon ao[];
	
	Option opp;
	Adon aon[];
	
	public Service(String n, int p, int t,Option o[],Adon a[]) {
		name = n;
		price = p;
		tax = t;
		op = o;
		ao = a;
		amount = 0;
	}
	
	public void bookService(Option o, Adon a[]){
		
		opp = o;
		aon = a;
		amount= amount + price;
		amount= amount + o.price;
		
		for(int i=0; i<aon.length; i++){
			amount = amount + aon[i].price;
		}
	}
	
	public void printBill(){
		Debuger.Log("\nName : "+name);
		Debuger.Log("\nPrice : "+price);
		Debuger.Log("\nOption : "+opp.name);
		Debuger.Log("\nOption : "+opp.price);
		
		for(int i=0; i<aon.length; i++){
			Debuger.Log("\nAdon : "+aon[i].name+" Price : "+aon[i].price);
		}
		Debuger.Log("\nTotal : "+amount);
	}
}
