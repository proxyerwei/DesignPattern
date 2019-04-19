package com.xywei.mediator;

public class Mediator {

	private Man man;
	private Woman woman;

	public Man getMan() {
		return man;
	}

	public void setMan(Man man) {
		this.man = man;
	}

	public Woman getWoman() {
		return woman;
	}

	public void setWoman(Woman woman) {
		this.woman = woman;
	}

	public void marry(Person person) {

		if (person instanceof Man) {
			this.man=(Man) person;
		}
		if (person instanceof Woman) {
			this.woman=(Woman) person;

		}

		if (this.man != null && this.woman != null) {
			if (this.man.getCondition() == this.woman.getCondition()) {
				System.out.println("配对成功");
			} else {
				System.out.println("配对失败");
			}

		} else {
			System.out.println("没有找到配对的异性");
		}

	}

}
