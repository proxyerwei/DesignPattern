package com.xywei.template;

public class TestMain {

	public static void main(String[] args) {
		MakeBus bigBus = new MakeBigBus();
		bigBus.makeBus();

		MakeBus smallBus = new MakeSmallBus();
		smallBus.makeBus();

	}
}
