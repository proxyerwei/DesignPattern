/**
 * 
 */
package com.xywei.prototype.shalloCopy;

/**
 * 浅克隆 ，只克隆基本数据类型， 1,不会克隆引用类型？？（这点有疑问） 2,当复制的时候，原型上的引用类型会不会也复制到目标类
 * 3，当改变原型的时候，目标类是否也会被改变（区别深浅复制）
 * 
 * @author wodoo
 *
 */
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Teacher teacher = new Teacher();
		teacher.setAge(20);
		teacher.setName("浅老师");

		Student student1 = new Student();
		student1.setAge(10);
		student1.setName("浅学生");
		student1.setTeacher(teacher);

		Student student2 = null;
		// 复制第二个学生
		try {
			student2 = (Student) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// 结果是：引用类型的值也一样
		System.out.println("测试 student1与student2的数据是否一样.浅复制中的引用类型的值是否一样");
		System.out.println("student1：" + student1);
		System.out.println("student2：" + student2);

		// 结果是：不一样
		System.out.println("测试两者内存地址是否一样");
		System.out.print("student1==student2?");
		System.out.println(student1 == student2);

		// 结果是：基本类型复制过去了，但是引用类型指向了同一个对象
		System.out.println("测试两者的teacher引用是否相同");
		System.out.print("student1.teacher==student2.teacher?");
		System.out.println(student1.getTeacher() == student2.getTeacher());

		// 结果证明了基本类型是被复制了，但是引用类型是指向同一块地址
		System.out.println("测试修改studetn1 teacher 对象，student2的值，然后查看是否会影响到student2和student2的teacher");
		student1.getTeacher().setAge(30);
		student1.getTeacher().setName("修改浅复制老师名字");
		student2.setAge(20);
		student2.setName("浅复制学生");
		System.out.println("student1" + student1);
		System.out.println("student2" + student2);

		System.out.println("以上为浅复制 the end");
	}

}
