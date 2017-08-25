
public class NewCar extends Car {
	
	private String color;
	
	public NewCar(double price, String c) {
		super(price);	
		color= c;
	}
	
	public void display(){
		System.out.println("price = $" + price*2 + "," + "color" + " = " + color);
	}
	
	public boolean equals(NewCar car2){
		
		if (getPrice () == car2 .getPrice()) {
			if(color == car2.color){
				return true;
			}
			
		} else {
			return false;
		}
		return true;
	}
}
