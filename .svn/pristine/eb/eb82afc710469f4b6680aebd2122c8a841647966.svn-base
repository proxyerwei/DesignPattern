package com.xywei.proxy.first;

import com.xywei.proxy.RealPublic;
import com.xywei.proxy.Subject;

/**
 * 代理类
 * 
 * @author wodoo
 *
 */
public class ProxySubject implements Subject {

	// 引用被代理类，给出版社卖书
	private RealPublic realPublic;

	@Override
	public void sellBook() {
		if (null == realPublic) {
			realPublic = new RealPublic();
		}
		dazhe();
		realPublic.sellBook();
		travel();
	}

	private void dazhe() {
		System.out.println("买书之前代理商给你打折了");

	}

	public void travel() {
		System.out.println("卖书之后代理商送你送旅行券了");
	}
}
