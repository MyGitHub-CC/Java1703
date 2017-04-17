package day05.homework;
/**
 * 定义SingleChoice类，继承Question类，表示单选题，该类有两个属性，
 * 一个属于是String[]类型options，表示选项，另一个是String类型answerId，表示答案,提供该类的两个构造方法。
 */
public class SingleChoice extends Question{
	private String[] options;
	private String answerId;
	
	public SingleChoice() {
		super();
	}
	
	public SingleChoice(String text, String[] options, String answerId) {
		super(text);
		this.options = options;
		this.answerId = answerId;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}
	
}
