package review.enumDemo;

public enum EnumDemo {
	// MALE,FEMALE;
	
	MALE("男"),FEMALE("女");
	
	private String value;
	
	private EnumDemo(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
