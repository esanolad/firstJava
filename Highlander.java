package inheritance;

public class Highlander extends Toyota {

	public Highlander(String color, int year, String engineType) {
		super(color, year, engineType);

	}
	
	@Override 
	public void increaseSpeed(int value) {
		int newSpeed = super.speed + value;
		if (newSpeed>25) {
			
			System.out.println("speed cannot be more than 25");
		} else {
			this.speed += newSpeed;
		}
		
	}
	
	public void playMusic() {
		System.out.println("I am moving with Highlander Engine " + engineType);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
