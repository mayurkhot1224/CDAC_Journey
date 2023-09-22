package com.code;

public class Test {
	public static void main(String[] args) {

		A a = new A();
		Integer x = (Integer) a.getNumber();// Number---->Integer:DownCasting
		System.out.println(x);

		B b1 = new B();

		Double d = b1.getNumber();
		System.out.println(d);
	}
}
