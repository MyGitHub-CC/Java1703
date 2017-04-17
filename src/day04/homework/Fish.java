package day04.homework;

public class Fish extends Animal{
		private int lin;
		
		public Fish() {
			super();
		}

		public Fish(String name, String color, int lin) {
			super(name, color);
			this.lin = lin;
		}

		public int getLin() {
			return lin;
		}

		public void setLin(int lin) {
			this.lin = lin;
		}
		
	public void blowBubbles() {
		System.out.println(getColor() + lin + "片鱼鳞的"+ getName() + "会吹泡泡！");
	}
}
