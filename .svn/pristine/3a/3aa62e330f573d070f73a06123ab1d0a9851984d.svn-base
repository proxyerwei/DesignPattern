package com.xywei.decorator;

public class RunCar extends AbstractCar {

	private Car car;

	public RunCar() {
	}

	public RunCar(Car car) {
		this.car = car;
	}

	@Override
	public void show() {
		car.show();
		this.run();
	}

	public void run() {
		System.out.println("now,I can run!");

	}

}
