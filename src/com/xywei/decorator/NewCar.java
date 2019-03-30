package com.xywei.decorator;

public class NewCar implements Car {

	@Override
	public void show() {
		System.out.println("I an new Car! I can't run!I can't fly!");
	}

}
