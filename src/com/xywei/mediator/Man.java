package com.xywei.mediator;

public class Man extends Person {

	public Man(String name, Integer condition, Mediator mediator) {
		super(name, condition, mediator);
	}

	public void marray(Person person) {
		this.getMediator().setMan(this);
		this.getMediator().marry(person);
	}
}
