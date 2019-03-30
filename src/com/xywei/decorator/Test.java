package com.xywei.decorator;

/**
 * 装饰模式的出来，是继承关系的一种替代方案，防止每次拓展功能都要新建一个子类。
 * @author wodoo
 *
 */
public class Test {

	public void test1() {

		Car car = new NewCar();
		RunCar runCar = new RunCar(car);
		FlyCar flyCar = new FlyCar(runCar);
		//目标效果能跑能飞
		flyCar.show();
	}

	public static void main(String[] args) {
		new Test().test1();
	}
}
