/**
 * 
 */
package com.xywei.observer.demo;

import java.util.Observable;

/**
 * @author wodoo 博主
 */
public class BlogUser extends Observable {

	private Integer id;

	private String name;

	private Article article;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Article getArticle() {
		return article;
	}

	public void writeArticle(Article article) {
		this.article = article;
		this.setChanged();
		this.notifyObservers(this.article);
	}

}
