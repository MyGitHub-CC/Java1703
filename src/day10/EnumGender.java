package day10;

public enum EnumGender {
	// FEMALE, MALE;
	FEMALE("女"), MALE("男");
	private String value;
	
	private EnumGender(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
