package com.test;

public class TestTest {
	int i=10;
	int j=18;
	public int test() {
		int g=(int) (i+j);
		System.out.println("---------叮咚----------");
		return g;
		
	}
	public static void main(String[] args) {
		System.out.println(new TestTest().test());
	}

}
