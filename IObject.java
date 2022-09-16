package inheritance;

public interface IObject {
	
	public String toString();
	
	public default String Welcome() {
		//TODO: default method in an interface
		return "This is a default method in the interface";
	}

}
