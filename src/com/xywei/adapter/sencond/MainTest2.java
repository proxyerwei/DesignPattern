package com.xywei.adapter.sencond;

/**
 * 委让方式，如果要修改，直接修改adapter类即可
 * 
 * @author wodoo
 *
 */
public class MainTest2 {

	public static void main(String[] args) {
		Adapter2 adapter2 = new Adapter2(new Adaptee2());
		adapter2.use18V();
	}
}
