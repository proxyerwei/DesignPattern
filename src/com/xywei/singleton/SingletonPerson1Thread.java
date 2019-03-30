package com.xywei.singleton;

public class SingletonPerson1Thread implements Runnable {

	private String personName = null;

	public SingletonPerson1Thread() {
	}

	public SingletonPerson1Thread(String name) {
		this.personName = (name == null ? "A" : name);
	}

	@Override
	public void run() {
		Person1 person1 = Person1.getInstance();
		System.out.println(person1);
		person1.setName(personName);
		System.out.println(person1.getName());
	}

}
