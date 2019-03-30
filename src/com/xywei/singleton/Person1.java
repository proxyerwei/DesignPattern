package com.xywei.singleton;

/**
 * 饿汉模式，加载的时候进行初始化实例，比较消耗资源，适合单线程/多线程，
 * 
 * @author wodoo
 *
 */
public class Person1 {
	// 下面的private public 都可以
	public static Person1 person1 = new Person1();
	// private static Person1 person1 = new Person1();

	private Person1() {
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public static Person1 getInstance() {
		return person1;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
