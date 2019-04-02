package com.xywei.factoryMethod;

/**
 * 具体产品
 * 
 * @author nuller
 *
 */
public class Apple implements Fruit {

	@Override
	public void get() {
		System.out.println("拿到了苹果");
	}

}
