package day06;
/**
 * 定义老师Teacher类里面除了名字、年龄、性别外还有薪资，特有的方法是教学。
 */
public class Teacher extends Person{
	private int salary;
	
	public void show() {
		System.out.println( super.name + "年龄是：" + super.age + "薪资是：" + salary);
	}
}
