package day07;

public class CalTest {
	public static void main(String[] args) {
		Cal cal = new CalAdd(15, 6);
		int addResult = cal.getResult();
		System.out.println(addResult);

		cal = new CalSub(10, 2);
		cal.getResult();
		int subResult = cal.getResult();
		System.out.println(subResult);

		cal = new CalMulti(56, 5);
		cal.getResult();
		int multiResult = cal.getResult();
		System.out.println(multiResult);

		cal = new CalDiv(89, 5);
		cal.getResult();
		int divResult = cal.getResult();
		System.out.println(divResult);
	}
}
