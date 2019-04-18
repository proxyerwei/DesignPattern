package com.xywei.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

	private Map<String, MyCharacter> pool = null;

	public FlyWeightFactory() {
		pool = new HashMap<String, MyCharacter>();
	}

	public MyCharacter getCharacter(String name) {
		MyCharacter character = pool.get(name);
		if (character == null) {
			character = new MyCharacter(name);
			pool.put(name, character);

		}
		return character;
	}

}
