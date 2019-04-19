package com.xywei.mediator;

public class TestMain {

	public static void main(String[] args) {

		Mediator mediator = new Mediator();

		Person man = new Man("xx", 1, mediator);
		Person man2 = new Man("xx", 1, mediator);
		Person woman = new Woman("ww", 1, mediator);
		Person woman2 = new Woman("ww2", 2, mediator);

		man.marray(man2);
		// man.marray(man2);

		// woman.marry(man);
	}

}
