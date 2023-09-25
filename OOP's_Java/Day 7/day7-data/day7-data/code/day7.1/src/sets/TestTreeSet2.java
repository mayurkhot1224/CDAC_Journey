package sets;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<>();
		String[] names= {"Shubham","Riya","Meera","Rama","Amish","Aniket","Rupa","Riya"};
		//populate the HS with names
		for(String s : names)
			System.out.println("Added "+list.add(s));
		//display set : toString , Iterator,for-each
		System.out.println("List contents "+list);
		//Q : display these names in desc manner (lexicographic : desc)
		TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		System.out.println("Sorted set "+ts);//[]
		ts.addAll(list);
		System.out.println("Sorted set "+ts);//no dups, desc strings
		
		
			

	}

}
