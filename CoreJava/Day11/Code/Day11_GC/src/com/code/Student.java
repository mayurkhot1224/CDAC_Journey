package com.code;

import java.util.Date;

public class Student {

	Date d;

	public Student() {
		d = new Date();
		System.out.println("--object created on heap----");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		d = null;
		System.out.println("remove obj from heap");
	}

}
