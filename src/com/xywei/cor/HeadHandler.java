package com.xywei.cor;

public class HeadHandler extends Handler {

	@Override
	public void makeCar() {
		System.out.println("制作车头");
		if (this.handler != null) {
			this.handler.makeCar();

		}
	}

}
