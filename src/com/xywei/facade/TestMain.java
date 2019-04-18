package com.xywei.facade;

public class TestMain {

	public static void main(String[] args) {
		Facade facade=new Facade();
		facade.doSomethingAB();
		System.out.println("=============");
		facade.doSomethindBC();
		System.out.println("=============");
		facade.doSomethingABC();
	}
}
