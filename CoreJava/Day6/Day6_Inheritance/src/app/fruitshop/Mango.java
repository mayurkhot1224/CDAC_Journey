package app.fruitshop;

public class Mango extends Fruit {
	

	public Mango() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("-------Mango Constructor-----");
		
	}

	public void pulp() {
		System.out.println("-------Mango pulp extracted-----");
	}
	@Override
	public void taste() {
		System.out.println("Sweet");
	}
}
