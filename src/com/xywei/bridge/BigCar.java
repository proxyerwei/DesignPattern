package com.xywei.bridge;

public class BigCar extends Car {

	public BigCar(Engine engine) {
		super(engine);
	}

	@Override
	public void installEngine() {
		System.out.println("大车安装发动机");
		this.getEngine().installEngine();
	}

}
