package com.xywei.memento;

public class MainTest {

	public static void main(String[] args) {

		Person person = new Person();
		person.setAge(28);
		person.setName("XX");
		System.out.println("新角色： " + person);

		// 思考：为什么需要careTaker？为什么不直接使用memento
		// 开始备份
		CareTaker careTaker = new CareTaker();
		careTaker.setMemento(person.setMemento());

		// 修改person
		person.setAge(30);
		person.setName("XXXXXXX");
		System.out.println("修改后： " + person);

		// 还原
		person.rollBack(careTaker.getMemento());
		System.out.println("还原后： " + person);

	}

}
