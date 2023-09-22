package com.app;

public interface MathOperatoins {
	int myConst = 90;

	int add(int i, int j);// public abstract method

	 default int max(int i, int j) {
		if (i > j)
			return i;
		else
			return j;
	}
}
