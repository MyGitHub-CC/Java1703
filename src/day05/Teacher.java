package day05;
/**
 * 定义老师Teacher类里面除了名字、年龄、性别外还有薪资，特有的方法是教学。
 */
public class Teacher extends Person{
	private int salary;

	public Teacher() {
		super();
	}

	public Teacher(String name, int age, char gender, int salary) {
		super(name, age, gender);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void teach() {
		System.out.println(super.getAge() + "岁月薪是" + salary +
				"元的" + super.getGender() + "教师" + super.getName() + "在教学。");
	}
}
