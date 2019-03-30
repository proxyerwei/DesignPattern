package com.xywei.singleton;

public class TestSingleton {

	/**
	 * 测试单例模式的恶汉模式
	 */
	public void test1() {

		Person1 person1 = Person1.person1;
		Person1 person2 = Person1.person1;
		System.out.println(person1 == person2);
		person1.setName("aaa");
		person2.setName("bbb");
		System.out.println(person1.getName() + "\n" + person2.getName());

	}

	/**
	 * 测试单例模式的恶汉模式，多线程下面
	 */
	public void test1_2() {
		SingletonPerson1Thread p1 = new SingletonPerson1Thread("p1");
		SingletonPerson1Thread p2 = new SingletonPerson1Thread("p2");
		SingletonPerson1Thread p3 = new SingletonPerson1Thread("p3");
		SingletonPerson1Thread p4 = new SingletonPerson1Thread("p4");
		SingletonPerson1Thread p5 = new SingletonPerson1Thread("p5");
		SingletonPerson1Thread p6 = new SingletonPerson1Thread("p6");
		SingletonPerson1Thread p7 = new SingletonPerson1Thread("p7");
		SingletonPerson1Thread p8 = new SingletonPerson1Thread("p8");
		SingletonPerson1Thread p9 = new SingletonPerson1Thread("p9");
		SingletonPerson1Thread p = new SingletonPerson1Thread("p");
		Thread thread1 = new Thread(p1);
		Thread thread2 = new Thread(p2);
		Thread thread3 = new Thread(p4);
		Thread thread4 = new Thread(p5);
		Thread thread5 = new Thread(p6);
		Thread thread6 = new Thread(p7);
		Thread thread7 = new Thread(p8);
		Thread thread8 = new Thread(p9);
		Thread thread9 = new Thread(p3);
		Thread thread = new Thread(p);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread.start();
		// 结果证明都是一个示例

	}

	/**
	 * 懒汉模式多线程测试
	 */
	public void test2() {
		SingletonPerson2Thread p1 = new SingletonPerson2Thread("p1");
		SingletonPerson2Thread p2 = new SingletonPerson2Thread("p2");
		SingletonPerson2Thread p3 = new SingletonPerson2Thread("p3");
		SingletonPerson2Thread p4 = new SingletonPerson2Thread("p4");
		SingletonPerson2Thread p5 = new SingletonPerson2Thread("p5");
		SingletonPerson2Thread p6 = new SingletonPerson2Thread("p6");
		SingletonPerson2Thread p7 = new SingletonPerson2Thread("p7");
		SingletonPerson2Thread p8 = new SingletonPerson2Thread("p8");
		SingletonPerson2Thread p9 = new SingletonPerson2Thread("p9");
		SingletonPerson2Thread p = new SingletonPerson2Thread("p");
		Thread thread1 = new Thread(p1);
		Thread thread2 = new Thread(p2);
		Thread thread3 = new Thread(p4);
		Thread thread4 = new Thread(p5);
		Thread thread5 = new Thread(p6);
		Thread thread6 = new Thread(p7);
		Thread thread7 = new Thread(p8);
		Thread thread8 = new Thread(p9);
		Thread thread9 = new Thread(p3);
		Thread thread = new Thread(p);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread.start();
	}

	public static void main(String[] args) {
		new TestSingleton().test2();
	}
}
