package com.xywei.bridge;

public class SmallCar extends Car {

	public SmallCar(Engine engine) {
		super(engine);
	}

	@Override
	public void installEngine() {
		System.out.println("小车安装发动机");
		this.getEngine().installEngine();
	}

}
