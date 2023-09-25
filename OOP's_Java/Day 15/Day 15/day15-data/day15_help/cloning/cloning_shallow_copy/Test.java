package cloning_shallow_copy;

public class Test {

	public static void main(String[] args) throws Exception {
		Student s1 = new Student(100);// s1 ---> 1st student obj , CP , rollNo=100, adr=null
		Address a1 = new Address("pune");// a1 ---> Addres instance --CP , city ---> string obj --> "pune"
		s1.setAdr(a1);// adr --> Addres instance --CP , city ---> string obj --> "pune"
		System.out.println(s1);// 100 pune
		// clone of s1
		Student s2 = s1.clone();// s2 ---> another student (clone) : shallow copy , rollNO =100 , adr -->
								// earlier adr obj
		System.out.println(s2);//100 pune
		System.out.println(s1 == s2);//false
		s1.setRollNo(200);//making changes to state of the 1st obj
		s1.getAdr().setCity("mumbai");//pune --> mumbai
		System.out.println(s1);//200 mumbai
		System.out.println(s2);//100 mumbai

	}

}
