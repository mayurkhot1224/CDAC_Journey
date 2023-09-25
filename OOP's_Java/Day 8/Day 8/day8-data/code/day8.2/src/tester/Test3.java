package tester;

import static utils.GenericUtils.*;

import java.util.ArrayList;
import java.util.Arrays;

import com.app.core.Mgr;

public class Test3 {

	public static void main(String[] args) {
		// AL<Mgr>
		ArrayList<Mgr> mgrs = new ArrayList<>(Arrays.asList(new Mgr(1000), new Mgr(2000), new Mgr(3000)));
		double sumOfSalaries = computeSumOfSalriesFromList(mgrs);
		
	}

}
