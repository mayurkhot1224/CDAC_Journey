
public class TestWrapperClass {

	public static void display(Object obj) {
		System.out.println(obj.toString());//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;// a get stored on stack 10 will get stored on stack

		System.out.println(a);// primitive type
		// convert primitive into Object
		// HOW:use wrapper classes
		// for primitive int type use Integer wrapper class

		Integer intObj = new Integer(a);// converting int a into Object Integer type
		// Boxing:converting primitive into Object
		System.out.println("IntObj=" + intObj);// 10

		// UnBoxing:convering object type into premitive type
		int b = intObj.intValue();// convert object type into int type
		System.out.println(b);

		// AutoBoxing
		Integer intObj2 = a;// AutoBoxing

		System.out.println(intObj2);

		// AutounBoxing
		int c = intObj2;// AutoUnboxing

		display(intObj);// int---->Integer----->Object
		// or
		display(a);
		// or
		display(56767);

	}

}
