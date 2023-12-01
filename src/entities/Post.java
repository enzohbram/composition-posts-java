package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private LocalDateTime dateTime;
	private String title;
	private String content;
	private Integer likes;
	
	List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}


	public Post(LocalDateTime dateTime, String title, String content, Integer likes) {
		this.dateTime = dateTime;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}


	public LocalDateTime getDateTime() {
		return dateTime;
	}


	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	//Novidade
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(dateTime + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for(Comment c: comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
}
