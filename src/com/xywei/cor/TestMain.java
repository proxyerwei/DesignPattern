package com.xywei.cor;

public class TestMain {

	public static void main(String[] args) {

		Handler head = new HeadHandler();
		Handler body = new BodyHandler();
		Handler tail = new TailHandler();

		head.setHandler(body).setHandler(tail);
		// body.setHandler(tail);

		head.makeCar();

	}
}
