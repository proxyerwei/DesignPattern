package com.xywei.observer.demo;

public class MainTestDemo {

	public static void main(String[] args) {

		Article article = new Article();
		article.setId(1);
		article.setTitle("test title");
		article.setContent("just test");

		BlogUser user = new BlogUser();
		user.setId(1);
		user.setName("RT");
		user.addObserver(new SubcribeUser());
		user.writeArticle(article);

		System.out.println(article);
	}

}
