package com.xywei.prototype.shalloCopy;

public class Student implements Cloneable {

	private String name;
	private Integer age;
	private Teacher teacher;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}

	@Override
	public String toString() {
		return "[" + "student name=:" + name + ", student age=:" + age + ", teacher name=:" + teacher.getName()
				+ ", teacher age=:" + teacher.getAge() + "]";
	}
}
