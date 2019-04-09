package com.xywei.strategy;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void doWork() {
		this.strategy.doWork();
	}
}
