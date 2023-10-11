package com.bbankert.oop.exam.books;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Objects;

public class Book {
	int id;
	String name;
	Author[] authors;
	Publisher publisher;
	int publishingYear;
	int amountOfPages;
	BigDecimal price;
	CoverType coverType;
	
	public Book(int id, String name, Author[] authors,
			Publisher publisher, int publishingYear,
			int amountOfPages, BigDecimal price,
			CoverType coverType) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.publishingYear = publishingYear;
		this.amountOfPages = amountOfPages;
		this.price = price;
		this.coverType = coverType;
	}
	
	public boolean hasAuthor(Author authorToSearchFor) {
		for(Author author: authors) {
			if(author.equals(authorToSearchFor)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean hasPublisher(Publisher publisher) {
		return this.publisher.equals(publisher);
	}
	
	public int getPublishingYear() {
		return this.publishingYear;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(authors);
		result = prime * result + Objects.hash(amountOfPages, coverType, id, name, price, publisher, publishingYear);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return amountOfPages == other.amountOfPages && Arrays.equals(authors, other.authors)
				&& coverType == other.coverType && id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(price, other.price) && Objects.equals(publisher, other.publisher)
				&& publishingYear == other.publishingYear;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authors="
				+ Arrays.toString(authors) + ", publisher=" + publisher
				+ ", publishingYear=" + publishingYear + ", amountOfPages="
				+ amountOfPages + ", price=" + price + ", coverType=" + coverType + "]";
	}
	
}
