package day08.Interface;

public class InterfaceTest {
	public static void main(String[] args) {
		AbstractBird abstractBird = new Pigeon();
		abstractBird.egg();
		
		IFly fly = new Pigeon();
		fly.fly();
		
		Pigeon pigeon = new Pigeon();
		pigeon.egg();
		pigeon.fly();
	}
}
