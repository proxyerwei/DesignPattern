package com.xywei.memento;

/**
 * origintor 需要备份的类
 * 
 * @author wodoo
 *
 */
public class Person {

	private Integer age;
	private String name;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {

		return "[" + "age: " + age + ", name: " + name + "]";

	}

	// 设置备份
	public Memento setMemento() {
		return new Memento(getAge(), getName());
	}

	// 还原备份
	public void rollBack(Memento memento) {
		this.age = memento.getAge();
		this.name = memento.getName();
	}
}
