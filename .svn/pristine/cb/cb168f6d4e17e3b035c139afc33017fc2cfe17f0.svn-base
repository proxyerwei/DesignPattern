package com.xywei.singleton;

public class SingletonPerson2Thread implements Runnable {

	private String personName = null;

	public SingletonPerson2Thread() {
	}

	public SingletonPerson2Thread(String name) {
		this.personName = (name == null ? "A" : name);
	}

	@Override
	public void run() {
		Person2 person2 = Person2.getInstance();
		System.out.println(person2);
		person2.setName(personName);
		System.out.println(person2.getName());
	}

}
