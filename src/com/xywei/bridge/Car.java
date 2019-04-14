package com.xywei.bridge;

public abstract class Car {

	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public abstract void installEngine();
}
