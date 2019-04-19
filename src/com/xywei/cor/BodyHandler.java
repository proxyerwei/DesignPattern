package com.xywei.cor;

public class BodyHandler extends Handler {

	@Override
	public void makeCar() {

		System.out.println("制作车身");
		if (this.handler != null) {
			this.handler.makeCar();

		}
	}

}
