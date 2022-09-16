package inheritance;

public class Toyota extends Car {
	
	//TODO static members and functions
	public static String location = "Japan"; 
	public static void about() {
		System.out.println("I am a Toyota Class that extends the Car class");
	}
	
	
	public String engineType="";
	
	public Toyota(String color, int year, String engineType) {
		super(color, year);   //super keyword
		this.engineType=engineType;
		super.increaseSpeed(4);
		
	}
	
	public Toyota(String color, int year) {
		//TODO: overloads the constructor class
		super(color, year);   //super keyword
		this.engineType="V4";
		super.increaseSpeed(4);
		
	}
	
	// Toyota car can have up to 15 speed
	@Override
	public void increaseSpeed(int value) {
		int newSpeed = super.speed + value;
		if (newSpeed>15) {
			
			System.out.println("speed cannot be more than 15");
		} else {
			this.speed += newSpeed;
		}
		
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("Red",2020);
		
		Toyota myToyotarCar = new Toyota("Red",2020, "V4");
		
		myCar.moveCar(20);
		
		System.out.println(myCar.position);

	}

}
