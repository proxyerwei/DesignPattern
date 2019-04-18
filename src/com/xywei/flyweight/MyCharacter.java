package com.xywei.flyweight;

public class MyCharacter extends Character {

	String name = null;

	public MyCharacter(String name) {
		this.name = name;
	}

	@Override
	public void doSomething() {
		System.out.println("我是" + this.name);
		System.out.println("this=" + this + "================");
	}

}
