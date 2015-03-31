package com.lm.domain.gen;

// Generated Mar 29, 2015 8:20:14 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * BookType generated by hbm2java
 */
@Entity
@Table(name = "BookType", catalog = "chorus")
public class BookType implements java.io.Serializable {

	private int bookTypeId;
	private String name;
	private Set<Book> books = new HashSet<Book>(0);

	public BookType() {
	}

	public BookType(int bookTypeId) {
		this.bookTypeId = bookTypeId;
	}

	public BookType(int bookTypeId, String name, Set<Book> books) {
		this.bookTypeId = bookTypeId;
		this.name = name;
		this.books = books;
	}

	@Id
	@Column(name = "bookTypeId", unique = true, nullable = false)
	public int getBookTypeId() {
		return this.bookTypeId;
	}

	public void setBookTypeId(int bookTypeId) {
		this.bookTypeId = bookTypeId;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "bookTypes")
	public Set<Book> getBooks() {
		return this.books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

}
