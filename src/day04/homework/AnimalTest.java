package day04.homework;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog("小狗", "黑色", 4);
		dog.move();
		dog.bite();
		System.out.println("-------------");
		Fish fish = new Fish("小鱼", "黄色", 300);
		fish.move();
		fish.blowBubbles();
		
	}
}
