
public class UsedCar extends Car {
	
	private int mileage;
	
	public UsedCar(double price, int m) {
		super(price);
		mileage = m;
	}
	public void display(){
		System.out.println("price = $" + price*2 + "," + "mileage" + " = " + mileage);
	}
	public boolean equals(UsedCar car2){
			
			if (getPrice () == car2 .getPrice()) {
				if(mileage == car2.mileage){
					return true;
				}
				
			} else {
				return false;
			}
			return true;
		}

	}
