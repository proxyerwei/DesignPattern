package com.xywei.proxy;

/**
 * 出版社卖书
 * 被代理类
 * @author wodoo
 *
 */
public class RealPublic implements Subject {

	@Override
	public void sellBook() {
		System.out.println("卖书");
	}

}
