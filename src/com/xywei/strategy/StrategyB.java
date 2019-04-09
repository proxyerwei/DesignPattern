package com.xywei.strategy;

public class StrategyB implements Strategy {

	@Override
	public void doWork() {

		System.out.println("根据客户端算法选择B");
	}

}
