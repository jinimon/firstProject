package com.yedam.exam;

public class Post {
	private int pnum;
	private String postId;
	private String title;
	private String contents;
	private String postDate;

	public Post() {

	}

	public Post(String postId, String title, String contents) {
		super();
		this.postId = postId;
		this.title = title;
		this.contents = contents;
	}

	public int getPnum() {
		return pnum;
	}

	public void setPnum(int pnum) {
		this.pnum = pnum;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "\t" + pnum + "\t" + title + "\t\t" + postId;
	}

	public String toStringDetail() {
		return "제목 : " + title + "\n내용 : " + contents + "\n작성자 : " + postId + "\n등록일 : " + postDate;
	}
}
