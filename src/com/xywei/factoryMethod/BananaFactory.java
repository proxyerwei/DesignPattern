package com.xywei.factoryMethod;

public class BananaFactory implements FruitFactory {

	@Override
	public Fruit getFruit() {
		return new Banan();
	}

}
