package com.xywei.flyweight;

/**
 * 构造型？，站在共享内存角度看是！但是战场new角度就是创建性，而享元模式的目的就是共享内存
 * 
 * @author wodoo
 *
 */
public class TestMain {

	public static void main(String[] args) {

		FlyWeightFactory factory = new FlyWeightFactory();

		MyCharacter myCharacter1 = factory.getCharacter("xxxa");
		MyCharacter myCharacter11 = factory.getCharacter("xxxD");
		MyCharacter myCharacter111 = factory.getCharacter("xxxX");
		MyCharacter myCharacter1111 = factory.getCharacter("xxxX");

		myCharacter1.doSomething();
		myCharacter11.doSomething();
		myCharacter111.doSomething();
		myCharacter1111.doSomething();

	}

}
