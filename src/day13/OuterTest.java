package day13;


public class OuterTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		
		Outer.Inner inner = outer.new Inner();
		inner.show();
	}
}
