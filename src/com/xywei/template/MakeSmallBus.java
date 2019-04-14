package com.xywei.template;

public class MakeSmallBus extends MakeBus {

	@Override
	public void makeHead() {

		System.out.println("小车头");
	}

	@Override
	public void makeBody() {
		System.out.println("小车身");

	}

	@Override
	public void makeTail() {
		System.out.println("小车尾");

	}

}
