package day05.homework;

/**
 * 这个题目是选作： 定义Question类，表示问题，该类有一个String类型的属性text表示题干,提供该类的两个构造方法。
 */
public class Question {
	private String text;

	public Question() {
		super();
	}

	public Question(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
