package com.xywei.proxy.second;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.xywei.proxy.RealPublic;
import com.xywei.proxy.Subject;

public class MyHandler implements InvocationHandler {

	// 不能hardcode，这样无法动态代理
	// private Subject subject = new RealPublic();

	private Subject subject;

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	/**
	 * @param proxy
	 *            被代理类
	 * @param method
	 *            被代理类的方法
	 * @param args
	 *            被代理类的方法参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		Object resulet = null;
		dazhe();
		resulet = method.invoke(subject, args);
		travle();
		return resulet;

	}

	public void dazhe() {
		System.out.println("卖书之前给你打折");
	}

	public void travle() {
		System.out.println("买书之后给你旅行券");
	}
}
