package com.xywei.factoryMethod;

/**
 * 抽象产品工厂
 * 
 * @author nuller
 *
 */
public class AppleFactory implements FruitFactory {

	@Override
	public Fruit getFruit() {
		return new Apple();
	}

}
