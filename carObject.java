package inheritance;

public class carObject {
	
	//TODO : creating a nested class
	
	public static class Engine {
		
	}

	public static void main(String[] args) {
		// TODO Create three object for same class
		
		Car firstCar= new Car("Red",2009);
		Car thirdCar = new Car("Blue",2018);
		Car secondCar = new Car("White",2020);
		
		// TODO print object for same class and demonstrate override toString
		System.out.println(firstCar.toString());
		System.out.println(secondCar.toString());
		System.out.println(thirdCar.toString());
		
		// TODO print static members and methods
		System.out.println(Toyota.location);
		Toyota.about();
		
		//TODO: demonstrate overloading
		Toyota raceCar = new Toyota("Black", 2022, "v8");
		Toyota saloonCar = new Toyota("Black", 2022);
		System.out.println(raceCar.toString());
		System.out.println(saloonCar.toString());
		
		//TODO: instantiating the nested class
		Engine e = new Engine();
		
		for (int i=1; i <=100; i++ ) {
			System.out.print(i + " ");
			if (i%10 == 0 ) System.out.println(" ");
			
		}
		
		

	}

}
