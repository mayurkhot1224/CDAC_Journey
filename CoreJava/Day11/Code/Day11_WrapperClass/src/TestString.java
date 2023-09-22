
public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 90;

		String str1 = "abc";
		System.out.println(str1);
		System.out.println("Length=" + str1.length());
		System.out.println("Contains:" + str1.contains("@"));// false
		System.out.println("Contains:" + str1.contains("b"));// true
		System.out.println("EndsWith:" + str1.endsWith(".com"));// false
		System.out.println("EndWith:" + str1.endsWith("c"));// true

		String str2 = "abc";
		if (str1 == str2) {
			System.out.println("str1==str2");
		} else
			System.out.println("str1!=str2");
//   expression ?true :false
		System.out.println(str1.equals(str2) ? "Same" : "diff");

		String str3 = "abc";
		// str1==str3---------->true

		String str4 = new String("abc");

		if (str1 == str4)
			System.out.println("str1==str4");
		else
			System.out.println("str1!=str4");

		str1 = "new abc";
		System.out.println(str1 + "    " + str2);

		str1 = str1.concat("  ");

		System.out.println("----------------");
		StringBuffer buf1 = new StringBuffer("IACSD");
		System.out.println(buf1);
		System.out.println(buf1.hashCode());
		buf1 = buf1.append(" ,Akurdi");
		System.out.println(buf1 + "     " + buf1.hashCode());

	}

}
