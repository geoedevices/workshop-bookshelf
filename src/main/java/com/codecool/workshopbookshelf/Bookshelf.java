package com.codecool.workshopbookshelf;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {

    private final List<Book> BOOK_STORAGE = new ArrayList<>();

    public void addBook(Book book) {
        BOOK_STORAGE.add(book);
    }

    public List<Book> getBooks(int releaseYear) {
        List<Book> listToReturn = new ArrayList<>();
        for (Book actualBook : BOOK_STORAGE) {
            if (actualBook.getReleaseYear() == releaseYear) {
                listToReturn.add(actualBook);
            }
        }
        return listToReturn;
    }

    public Book getLightestAuthor() {
        return BOOK_STORAGE.stream().min((i, j) -> i.getReleaseYear().compareTo(j));
    }

}
