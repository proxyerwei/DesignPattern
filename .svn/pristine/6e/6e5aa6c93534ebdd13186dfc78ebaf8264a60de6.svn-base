package com.xywei.builder;

/**
 * c创建复合对象的过程隐藏起来
 * 
 */
public class TestMain {

	public static void main(String[] args) {

		// 建造平楼
		HouseBuilder houseBuilder = new PeaceBuilder();

		HouseDirector houseDirector = new HouseDirector();
		houseDirector.makeHouseBuilder(houseBuilder);

		House house = houseBuilder.getHouse();
		System.out.println("建立的房子是：" + house);

		// 建造公寓
		HouseBuilder houseBuilder2 = new ApartmentBuilder();

		HouseDirector houseDirector2 = new HouseDirector();
		houseDirector2.makeHouseBuilder(houseBuilder2);

		House house2 = houseBuilder2.getHouse();
		System.out.println("建立的房子是：" + house2);

	}
}
