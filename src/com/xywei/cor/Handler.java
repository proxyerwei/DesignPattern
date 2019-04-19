package com.xywei.cor;

public abstract class Handler {

	protected Handler handler;

	public Handler setHandler(Handler handler) {
		this.handler = handler;
		return handler;
	}

	public abstract void makeCar();

}
