package inheritance;

public class Camry extends Toyota{

	public Camry(String color, int year, String engineType) {
		super(color, year,engineType);
	}

	//camry can play music
	public void playMusic() {
		System.out.println("I am moving with Camry Engine " + engineType);
	}
	//camry can have 20 speed
	@Override 
	public void increaseSpeed(int value) {
		int newSpeed = super.speed + value;
		if (newSpeed>20) {
			
			System.out.println("speed cannot be more than 20");
		} else {
			this.speed += newSpeed;
		}
		
	}
	
	public static void main(String[] args) {
		Camry myCar = new Camry("Blue", 2019, "V6");
		System.out.println(myCar.mySpeed());
		myCar.increaseSpeed(10);
		System.out.println(myCar.mySpeed());
		System.out.println(myCar.position);
		myCar.playMusic();

	}

}
