package day08.Interface;

public class Geese extends AbstractBird implements IFly{

	@Override
	public void egg() {
		System.out.println("Geese egg()");
	}

	@Override
	public void fly() {
		System.out.println("Geese fly()");
	}

}
