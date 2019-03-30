package com.xywei.proxy.first;

import com.xywei.proxy.Subject;

public class TestFirst {

	public static void main(String[] args) {
		Subject subject = new ProxySubject();
		subject.sellBook();
	}
}
