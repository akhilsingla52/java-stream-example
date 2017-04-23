package com.stream.dao;

public class Comment {
	String comment;
	String postedBy;
	
	public Comment() {
		this("","");
	}

	public Comment(String comment, String postedBy) {
		this.comment = comment;
		this.postedBy = postedBy;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getPostedBy() {
		return postedBy;
	}


	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}


	@Override
	public String toString() {
		return "Comment [comment=" + comment + ", postedBy=" + postedBy + "]";
	}
}
