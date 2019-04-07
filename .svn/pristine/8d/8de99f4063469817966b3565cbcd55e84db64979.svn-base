/**
 * 
 */
package com.xywei.observer;

import java.util.Observable;

/**
 * @author wodoo 被观察者 setter要先设置改变再通知观察者
 */
public class MySubject extends Observable {

	private String title;
	private String authorName;
	private String content;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		this.setChanged();
		this.notifyObservers();
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
		this.setChanged();
		this.notifyObservers();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		this.setChanged();
		this.notifyObservers();
	}

	@Override
	public String toString() {
		return "[" + title + "," + authorName + "," + content + "]";
	}
}
