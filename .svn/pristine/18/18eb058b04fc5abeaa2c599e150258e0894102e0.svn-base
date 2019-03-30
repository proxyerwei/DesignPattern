package com.xywei.singleton;

/**
 * 懒汉模式，需要的时候才加载初始化实例，注意多线程下的安全
 * 
 * @author wodoo
 *
 */
public class Person2 {
	// 下面的private public 都可以
	// public static Person2 person1 = null;
	private static Person2 person2 = null;

	private Person2() {
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public static Person2 getInstance() {
		// 两个if是为了防止多线程刚刚开始初始化的时候的安全问题，如果没有第二个null判断，也不会得到同一个实例
		if (person2 == null) {
			synchronized (Person2.class) {
				if (person2 == null) {
					person2 = new Person2();
				}
			}
		}
		return person2;

	}

	@Override
	public String toString() {
		return super.toString();
	}

}
