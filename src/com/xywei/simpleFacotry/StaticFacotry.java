package com.xywei.simpleFacotry;

public class StaticFacotry {

	// 第一种

	public static Apple getApple() {
		return new Apple();
	}

	public static Banana getBanana() {
		return new Banana();
	}

	// 第二种
	public static Fruit getFruit(String fruitType) throws Exception {

		if ("Apple".equalsIgnoreCase(fruitType)) {
			// return new Apple();
			return Apple.class.newInstance();
		}

		if ("Banana".equalsIgnoreCase(fruitType)) {
			return new Banana();
		}

		return null;
	}

	// 第三种

	public static Fruit getFruit3(String fruitName) throws Exception {

		System.out.println("fruitName = " + fruitName);
		Class c = Class.forName(fruitName);

		return (Fruit) c.newInstance();
	}

}
