package inheritance;


//TODO : implements abstract class
public class TestAbstractClass extends AbstractClass{
	
	int speed = 2;
	int position = 0;

	
	@Override
	public void moveCar(int distance) {
		this.position = this.position + (distance*this.speed);
		
	}

	@Override
	public void increaseSpeed(int value) {
		this.speed += value;
		
	}

	@Override
	public void decreaseSpeed(int value) {
		this.speed -= value;
		
	}
	
	public static void main(String[] args) {
		//TestAbstractClass a = new TestAbstractClass();
		AbstractClass f = new TestAbstractClass();
		
		
		
	}


}
