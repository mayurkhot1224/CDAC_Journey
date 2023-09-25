package tester;
import static utils.GenericUtils.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * Test cases :
	 * AL<String> , LL<Integer> , Vector<LocalDate> , HS<Double> , LHS,TS
		 */
		ArrayList<String> strings=new ArrayList<>();
		strings.add("one");strings.add("two");strings.add("three");
		printElementsFromCollection(strings);
		//Is Object a super type of String ? YES
		//Is Collection<Object> a super type of ArrayList<String> : NO
		//Does inheritance work in the same manner as earlier,  in generics ? NO
		//Collection<Object> c=new AL<String>(); javac err
		Vector<LocalDate> dates=new Vector<>();
		dates.add(LocalDate.parse("2020-12-20"));
		dates.add(LocalDate.parse("2020-02-20"));
		dates.add(LocalDate.parse("2021-12-20"));
		printElementsFromCollection(dates);
	//	HashSet<Double> hs=new HashSet<>(Arrays.asList(2,3,4,5,6,2,3,4));
		HashSet<Double> hs=new HashSet<>(Arrays.asList(2.0,3.5,4.2,5.6,4.5));
		System.out.println(hs);
		hs.add(1234.67);
		System.out.println("HS after add "+hs);
		printElementsFromCollection(hs);
		System.out.println("-------------------------");
		LinkedList<Integer> list2=new LinkedList<>(Arrays.asList(2,3,4,5,6,2,3,4));
		printElementsFromCollection2(list2);
		

	}

}
