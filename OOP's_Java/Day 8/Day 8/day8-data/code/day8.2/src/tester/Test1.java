package tester;

import java.util.ArrayList;
import java.util.List;

import com.app.core.Emp;
import com.app.core.Mgr;

public class Test1 {

	public static void main(String[] args) {
		/*
		 * List<Emp> emps; emps=new AL<Emp>(); AL<Mgr> mgrs=new AL<>();
		 * mgrs.add(m1).....m10
		 * 
		 * emps=mgrs;//no err ---ERROR!!!!!
		 */
		Emp e = new Mgr(12345);// up casting
		List<Emp> emps;
		emps = new ArrayList<Emp>();// up casting
		// create AL<Mgr>
		ArrayList<Mgr> mgrs = new ArrayList<>();
//		mgrs.add(new Mgr(1000));
//		mgrs.add(new Mgr(2000));
//		mgrs.add(new Mgr(3000));// populated mgr list
//		emps = mgrs;// => inheritance n up casting DOES NOT work in the same manner as earlier!!!!
		Object o=new Mgr(12345);
		List<Object> objects;
//		objects =mgrs; un comment to chk javac err

	}

}
