package com.xywei.decorator;

public class FlyCar extends AbstractCar {

	private Car car;

	public FlyCar() {
	}

	public FlyCar(Car car) {
		this.car = car;
	}

	@Override
	public void show() {
		car.show();
		this.fly();
	}

	public void fly() {
		System.out.println("now,I can fly!");
	}

}
