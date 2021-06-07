package com.nt.singleton;

public class Test {
	public static void main(String[] args) {
		DatabaseLayer s = DatabaseLayer.getInstance();
		DatabaseLayer s1 = DatabaseLayer.getInstance();
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}
