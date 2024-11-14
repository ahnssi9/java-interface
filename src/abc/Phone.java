package abc;

public abstract class Phone {
	String Owner;

	public Phone() {
		super();
	}

	public Phone(String owner) {
		super();
		Owner = owner;
	}

	public void turnOn() {
		System.out.println(" 전원 ");
	}
	public void turnOff() {
		System.out.println(" 끝!! ");
	}
	
}
