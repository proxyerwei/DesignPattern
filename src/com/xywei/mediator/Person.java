package com.xywei.mediator;

public class Person {

	private String name;
	private Integer condition;
	private Mediator mediator;

	public Person(String name, Integer condition, Mediator mediator) {
		this.name = name;
		this.condition = condition;
		this.mediator = mediator;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCondition() {
		return condition;
	}

	public void setCondition(Integer condition) {
		this.condition = condition;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void marray(Person woman) {
		
	}

}
