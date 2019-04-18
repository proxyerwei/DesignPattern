package com.xywei.facade;

public class Facade {

	private SystemA systemA;
	private SystemB systemB;
	private SystemC systemC;

	public Facade() {
		this.systemA = new SystemA();
		this.systemB = new SystemB();
		this.systemC = new SystemC();

	}

	public void doSomethingAB() {
		systemA.doSomething();
		systemB.doSomething();
	}

	public void doSomethindBC() {
		systemB.doSomething();
		systemC.doSomething();
	}

	public void doSomethingABC() {
		systemA.doSomething();
		systemC.doSomething();
		systemB.doSomething();
	}

}
