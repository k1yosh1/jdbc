package fk_lesson;

import java.util.Date;

public class forumPosts {
	private int id;
	private int idSubcategory;
	private int idUser;
	private int parentPost;
	private String title;
	private String content;
	private boolean isPoll;
	private Date date;
	private String ip;
	private forumSubcategories forumSubCat;
	private users users;
	
	public forumPosts(int id, int idSubcategory, int idUser, int parentPost, String title, String content,
			boolean isPoll, Date date, String ip, forumSubcategories forumSubCat, fk_lesson.users users) {
		super();
		this.id = id;
		this.idSubcategory = idSubcategory;
		this.idUser = idUser;
		this.parentPost = parentPost;
		this.title = title;
		this.content = content;
		this.isPoll = isPoll;
		this.date = date;
		this.ip = ip;
		this.forumSubCat = forumSubCat;
		this.users = users;
	}
	
	
}

package fk_lesson;

import java.sql.Date;

public class forumSubcategories {
	private long id;
	private long idCategory;
	private String title;
	private String description;
	private Date date;
	private String ip;
	private forumCategories forumCat;
	
	public forumSubcategories(long id, long idCategory, String title, String description, Date date, String ip,
			forumCategories forumCat) {
		super();
		this.id = id;
		this.idCategory = idCategory;
		this.title = title;
		this.description = description;
		this.date = date;
		this.ip = ip;
		this.forumCat = forumCat;
	}
}

package fk_lesson;

import java.sql.Date;

public class forumCategories {
	private int id;
	private String title;
	private String description;
	private Date date;
	private String ip;
	
	public forumCategories(int id, String title, String description, Date date, String ip) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.date = date;
		this.ip = ip;
	}
	
}

package fk_lesson;

import java.util.Date;

public class users {
	private int id;
	private String nick;
	private String password;
	private String email;
	private Date date;
	private float karma;
	private String ip;
	
	public users(int id, String nick, String password, String email, Date date, float karma, String ip) {
		super();
		this.id = id;
		this.nick = nick;
		this.password = password;
		this.email = email;
		this.date = date;
		this.karma = karma;
		this.ip = ip;
	}
}

package fk_lesson;

import java.util.Date;

public class forumPollsOptionsVotes {
	private int id;
	private int idPollOption;
	private int idUser;
	private Date date;
	private String ip;
	private users users;
	
	public forumPollsOptionsVotes(int id, int idPollOption, int idUser, Date date, String ip, fk_lesson.users users) {
		super();
		this.id = id;
		this.idPollOption = idPollOption;
		this.idUser = idUser;
		this.date = date;
		this.ip = ip;
		this.users = users;
	}
	
	
}

package fk_lesson;

import java.util.Date;

public class forumPollsOptions {
	private int id;
	private int idPost;
	private forumPosts forumPosts;
	private String title;
	private Date date;
	
	public forumPollsOptions(int id, int idPost, fk_lesson.forumPosts forumPosts, String title, Date date) {
		super();
		this.id = id;
		this.idPost = idPost;
		this.forumPosts = forumPosts;
		this.title = title;
		this.date = date;
	}
	
	
}
