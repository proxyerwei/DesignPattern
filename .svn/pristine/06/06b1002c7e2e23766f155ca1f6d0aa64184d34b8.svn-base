/**
 * 
 */
package com.xywei.prototype.deepCopy;

/**
 * @author wodoo
 *
 */
public class MainTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("===深度复制测试 start===");

		Teacher2 teacher2 = new Teacher2();
		teacher2.setAge(20);
		teacher2.setName("原型老师");

		Student2 student2 = new Student2();
		student2.setAge(10);
		student2.setName("学生");
		student2.setTeacher(teacher2);

		Student2 deep = null;
		try {
			deep = (Student2) student2.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// 预期：值相同
		// 结果：如上，值相同
		System.out.println("测试深度复制student2与deep的内容");
		System.out.println("student2: " + student2);
		System.out.println("deep: " + deep);

		// 预期：不相同
		// 结果：如上，不相同
		System.out.println("测试student2与deep地址是否一致");
		System.out.println("student2==deep?: " + (student2 == deep));

		// 预期：不一致
		// 结果：地址是相同的，因为student2 clone方法中没有重新teacher的age，name没有重新setter
		System.out.println("查看student2与deep中teacher的地址是否一致");
		System.out.println("student2.teacher==deep.teacher?: " + (student2.getTeacher() == deep.getTeacher()));

		// 预期：不影响
		// 结果：影响，原因，因为上面clone()出错。
		System.out.println("修改student2中的teacher，查看是否影响deep中teacher的值");
		student2.getTeacher().setAge(30);
		student2.getTeacher().setName("修改深度复制老师名字");
		System.out.println("student2: " + student2);
		System.out.println("deep: " + deep);

		System.out.println("===深度复制测试 end===");

	}

}
