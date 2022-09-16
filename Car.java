package inheritance;

// TODO implements abstraction through interface
// TODO multiple inheritance using interface 

public class Car implements ICar, IObject, IWheel{  

	private String color = "";
	private int year = 2000;
	protected int speed = 1;	
	int position =0;
	
	public Car(String color, int year) {
		this.year = year;
		this.color = color;
				
	}
	
	public void moveCar (int distance) {
		
		this.position = this.position + (distance * this.speed);
		
	}
	
	public void increaseSpeed(int value) {
		int newSpeed = this.speed + value;
		if (newSpeed>10) {
			
			System.out.println("speed cannot be more than 10");
		} else {
			this.speed += newSpeed;
		}
		
	}
	
	public void decreaseSpeed(int value) {
		int newSpeed = this.speed - value;
		if (newSpeed<1) {
			System.out.println("speed cannot be less than 1");
		} else {
			this.speed += newSpeed;
		}
		
	}
	
	public int mySpeed() {
		return this.speed;
	}
	
	@Override
	public String toString() {
		//TODO overrides to string function 
		return "My car is color " + this.color +  " manufactured in year " +
				this.year+ ". My position is " + this.position;
	}

	public static void main(String[] args) {
		// TODO to print interface implemented using default method
		Car n = new Car("Blue",2014);
		
		
		System.out.println(n.Welcome());

	}

	@Override
	public void turnLeft() {
		System.out.println("I am turning left");
	}

	@Override
	public void turnRight() {
		System.out.println("I am turning right");
	}
	}


