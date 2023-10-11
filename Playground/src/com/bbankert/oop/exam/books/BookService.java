package com.bbankert.oop.exam.books;

public class BookService {
	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		
		if(books == null) {
			return new Book[0];
		}
		
		int filteredBookLength = 0;
		for(Book book: books) {
			if(book.hasAuthor(author)) {
				filteredBookLength++;
			}
		}
		
		Book[] filteredBooks = new Book[filteredBookLength];
		int filterIndex = 0;
		for(Book book: books) {
			if(book.hasAuthor(author)) {
				filteredBooks[filterIndex] = book;
				filterIndex++;
			}
		}
		return filteredBooks;
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		
		if(books == null) {
			return new Book[0];
		}
		
		int filteredBookLength = 0;
		for(Book book: books) {
			if(book.hasPublisher(publisher)) {
				filteredBookLength++;
			}
		}
		
		Book[] filteredBooks = new Book[filteredBookLength];
		int filterIndex = 0;
		for(Book book: books) {
			if(book.hasPublisher(publisher)) {
				filteredBooks[filterIndex] = book;
				filterIndex++;
			}
		}
		return filteredBooks;
	}

	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		
		if(books == null) {
			return new Book[0];
		}
		
		int filteredBookLength = 0;
		for(Book book: books) {
			if(book.getPublishingYear() >= yearFromInclusively) {
				filteredBookLength++;
			}
		}
		
		Book[] filteredBooks = new Book[filteredBookLength];
		int filterIndex = 0;
		for(Book book: books) {
			if(book.getPublishingYear() >= yearFromInclusively) {
				filteredBooks[filterIndex] = book;
				filterIndex++;
			}
		}
		return filteredBooks;
	}
}
