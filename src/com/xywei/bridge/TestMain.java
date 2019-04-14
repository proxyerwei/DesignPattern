package com.xywei.bridge;

public class TestMain {

	public static void main(String[] args) {

		Engine bigEngine = new Engine2200();
		Car bigCar = new BigCar(bigEngine);
		bigCar.installEngine();

		Engine smallEngine = new Engine2000();
		Car smallCar = new SmallCar(smallEngine);
		smallCar.installEngine();

	}
}
