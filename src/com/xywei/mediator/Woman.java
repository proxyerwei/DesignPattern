package com.xywei.mediator;

public class Woman extends Person {

	public Woman(String name, Integer condition, Mediator mediator) {
		super(name, condition, mediator);
	}

	public void marry(Person person) {

		this.getMediator().setWoman(this);
		this.getMediator().marry(person);
	}

}
