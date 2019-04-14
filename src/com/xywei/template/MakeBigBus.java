package com.xywei.template;

public class MakeBigBus extends MakeBus {

	@Override
	public void makeHead() {

		System.out.println("大车头");
	}

	@Override
	public void makeBody() {
		System.out.println("大车身");

	}

	@Override
	public void makeTail() {

		System.out.println("大车尾");
	}

}
