package day11.productANDcustom;

public class Cake {
	private String name;

	public Cake() {
		super();
	}

	public Cake(String cake) {
		super();
		this.name = cake;
	}

	public String getCake() {
		return name;
	}

	public void setCake(String cake) {
		this.name = cake;
	}

	@Override
	public String toString() {
		return "Cake [cake=" + name + "]";
	}

}
