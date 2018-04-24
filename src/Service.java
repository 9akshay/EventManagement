
public class Service {
	public String name;
	public int price;
	public int tax;
	public int amount;
	
	Option OptionList[];
	Adon AdonList[];
	
	Option option;
	Adon adons[];
	
	public Service(String n, int p, int t,Option o[],Adon a[]) {
		name = n;
		price = p;
		tax = t;
		OptionList = o;
		AdonList = a;
		amount = 0;
	}
	
	public int bookService(Option o, Adon a[]){
		option = o;
		adons = a;
		return getTotalAmount();
	}
	
	public int getTotalAmount(){
		amount= amount + price;
		amount= amount + option.price;
		
		for(int i=0; i<adons.length; i++){
			amount = amount + adons[i].price;
		}
		return amount;
	}
	
	public void printBill(){
		Debuger.Log("\n\t Service Name : "+name);
		Debuger.Log("\n\t Service Price : "+price);
		Debuger.Log("\n\t Service Option : "+option.name);
		Debuger.Log("\n\t Service Option Price: "+option.price);
		
		for(int i=0; i<adons.length; i++){
			Debuger.Log("\n\t\t Adon : "+adons[i].name+" @Price : "+adons[i].price);
		}
		Debuger.Log("\n--------- Total : "+amount);
	}
}
