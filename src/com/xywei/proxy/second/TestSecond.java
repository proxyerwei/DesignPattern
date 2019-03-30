package com.xywei.proxy.second;

import java.lang.reflect.Proxy;

import com.xywei.proxy.RealPublic;
import com.xywei.proxy.Subject;

/**
 * 动态生成代理类
 * 
 * @since 2019.3.30
 * 
 * @author wodoo
 *
 */
public class TestSecond {

	public static void main(String[] args) {

		Subject subject = new RealPublic();
		// 设置被代理类
		MyHandler myHandler = new MyHandler();
		myHandler.setSubject(subject);

		// 生成代理类Proxy.newProxyInstance(loader, interfaces, h);
		/**
		 * @loader 代理类的类加载器
		 * @interface 代理类实现的接口
		 * @h 使用哪个handler
		 */
		Subject proxySubject = (Subject) Proxy.newProxyInstance(RealPublic.class.getClassLoader(),
				subject.getClass().getInterfaces(), myHandler);

		proxySubject.sellBook();

	}

}
