package com.xywei.observer.demo;

import java.util.Observable;
import java.util.Observer;

/**
 * 订阅者
 * 
 * @author wodoo
 *
 */
public class SubcribeUser implements Observer {

	/**
	 * TODO 但是有个缺点，博客文章可以通过o或者arg 都可以取到，需要改进
	 */
	@Override
	public void update(Observable o, Object arg) {

		System.out.println("博主发布新博客了");

		BlogUser user = (BlogUser) o;
		Article article = (Article) arg;
		System.out.println("博主：" + user.getName());
		System.out.println("文章标题：" + article.getTitle());
		System.out.println("文章内容：" + article.getContent());

	}

}
