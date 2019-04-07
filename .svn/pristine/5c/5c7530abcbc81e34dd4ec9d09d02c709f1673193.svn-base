package com.xywei.prototype.deepCopy;

public class Student2 implements Cloneable {

	private String name;
	private Integer age;
	private Teacher2 teacher;

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

	public Teacher2 getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher2 teacher) {
		this.teacher = teacher;
	}

	/**
	 * 深度复制的核心在于把引用类型的也复制，放到独立的内存中，即使原型发生改变，也不影响目标类的引用类型
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {

		// 把引用类型独立出来
		Student2 student2 = (Student2) super.clone();
		
		Teacher2 teacher2 = new Teacher2();
		teacher2.setAge(student2.getTeacher().getAge());
		teacher2.setName(student2.getTeacher().getName());
		
		Student2 student3 = student2;
		student3.setTeacher(teacher2);
		return student3;
	}

	@Override
	public String toString() {
		return "[" + "student name=:" + name + ", student age=:" + age + ", teacher name=:" + teacher.getName()
				+ ", teacher age=:" + teacher.getAge() + "]";
	}
}
