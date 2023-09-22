package app.fruitshop;

public class Orange extends Fruit {

	public void juice() {
		System.out.println("---orange juice------");
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("---orange De------");
		
	}

	@Override
	public void taste() {
		// TODO Auto-generated method stub
		super.taste();
	}
	
}
