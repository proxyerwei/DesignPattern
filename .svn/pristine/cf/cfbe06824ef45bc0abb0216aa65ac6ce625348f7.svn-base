package com.xywei.observer;

public class MainTest {

	public static void main(String[] args) {
		MySubject subject = new MySubject();
		// 可以有多个观察者
		subject.addObserver(new MyObserver());
		subject.setTitle("date");
		subject.setAuthorName("me");
		subject.setContent("test");
		System.out.println(subject);
	}
}
