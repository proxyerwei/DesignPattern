package com.xywei.template;

/**
 * 相同的操作步骤和过程，具体实现细节不同
 * 
 * @author wodoo
 *
 */
public abstract class MakeBus {

	public abstract void makeHead();

	public abstract void makeBody();

	public abstract void makeTail();

	public void makeBus() {
		this.makeHead();
		this.makeBody();
		this.makeTail();
	}

}
