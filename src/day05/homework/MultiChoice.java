package day05.homework;
/**
 * 定义MultiChoice类，继承Question类，表示多选题，该类有两个属性，
 * 一个属于是String[]类型options，表示选项，另一个是String[]类型answerIds，表示答案, 提供该类的两个构造方法。
 */
public class MultiChoice extends Question {
	private String[] options;
	private String[] answerIds;
	
	public MultiChoice() {
		super();
	}
	
	public MultiChoice(String text, String[] options, String[] answerIds) {
		super(text);
		this.options = options;
		this.answerIds = answerIds;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String[] getAnswerIds() {
		return answerIds;
	}

	public void setAnswerIds(String[] answerIds) {
		this.answerIds = answerIds;
	}
	
}
