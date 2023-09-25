package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet {

	public static void main(String[] args) {
		Emp e1=new Emp("rnd-001", "Riya", 10000);
		Emp e2=new Emp("rnd-003", "Rakesh", 20000);
		Emp e3=new Emp("rnd-001", "Riya", 10000);
		//create empty HS to store Emp refs
		HashSet<Emp> emps=new HashSet<>();
		System.out.println("Added "+emps.add(e1));//t
		System.out.println("Added "+emps.add(e2));//t
		System.out.println("Added "+emps.add(e3));//f
		System.out.println("size "+emps.size());//2
		for(Emp e : emps)
			System.out.println(e);//no dups
//		System.out.println(e1.equals(e3));//t
//		System.out.println(e1.hashCode()+" "+e3.hashCode());//same
//		

	}

}
