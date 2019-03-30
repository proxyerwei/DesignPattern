package com.xywei.decorator;

/**
 * 抽象装饰类 decorator 组件，持有compoment引用。
 * 
 * @author wodoo
 *
 */
public abstract class AbstractCar implements Car {

	private Car car;

	public AbstractCar() {
	}

	public AbstractCar(AbstractCar abstractCar) {
		this.car = abstractCar;
	}

	@Override
	public void show() {
		car.show();
	}

}
