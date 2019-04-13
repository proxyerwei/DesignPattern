package com.xywei.builder;

/**
 * 建造公寓
 * 
 * @author wodoo
 *
 */
public class ApartmentBuilder implements HouseBuilder {

	House house = new House();

	@Override
	public void makeHouse() {
		house.setFloor("公寓地板");
		house.setWall("公寓墙壁");
	}

	@Override
	public House getHouse() {

		return house;
	}

}
