package org.gradle;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.list.GrowthList;

public class Person {
	private final String name;
	private final List<String> blah = new ArrayList<>();

	public Person(String name) {
		this.name = name;
		new GrowthList();
	}

	public String getName() {
		return name;
	}
}
