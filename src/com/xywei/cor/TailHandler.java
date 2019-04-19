package com.xywei.cor;

public class TailHandler extends Handler {

	@Override
	public void makeCar() {

		System.out.println("制作车尾");
		if (this.handler != null) {
			this.handler.makeCar();

		}
	}

}
