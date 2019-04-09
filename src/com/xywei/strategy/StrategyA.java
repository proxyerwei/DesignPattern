package com.xywei.strategy;

public class StrategyA implements Strategy {

	@Override
	public void doWork() {

		System.out.println("根据客户端选择A算法");
	}

}
