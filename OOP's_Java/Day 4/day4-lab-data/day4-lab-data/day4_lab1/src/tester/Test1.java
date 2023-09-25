package tester;

import com.app.core.Emp;
import com.app.core.PermanentWorker;
import com.app.core.SalesMgr;
import com.app.core.TempWorker;
import com.app.core.Worker;

public class Test1 {

	public static void main(String[] args) {
		Emp e = new SalesMgr();// up casting
		System.out.println(e.computeSalary());
		System.out.println(e.getClass());// SalesMgr
		e = new TempWorker();//1 object (SalesMgr instance) marked for GC
		System.out.println(e.computeSalary());
		System.out.println(e.getClass());// TempWorker
		Object ref;
		ref = e;// up casting
		System.out.println(ref.getClass());// TempWorker
		System.out.println(((Emp) ref).computeSalary());// Object class DOES NOT have : computeSal
		System.out.println(((TempWorker) ref).computeSalary());// TempWorker's computeSal
		if (ref instanceof TempWorker)
			System.out.println(((TempWorker) ref).computeSalary());// class cast exc!
		else
			System.out.println("not the permanent worker!");
		

	}

}
