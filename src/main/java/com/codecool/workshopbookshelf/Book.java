package com.codecool.workshopbookshelf;

public class Book {

    private final String TITLE;
    private final String AUTHOR;
    private final int RELEASE_YEAR;
    private final int NUMBER_OF_PAGES;
    private final int WEIGHT_IN_GRAM;

    public Book(String title, String author, int releaseYear, int numberOfPages, int weightInGram) {
        TITLE = title;
        AUTHOR = author;
        RELEASE_YEAR = releaseYear;
        NUMBER_OF_PAGES = numberOfPages;
        WEIGHT_IN_GRAM = weightInGram;
    }

    public String getBookInfo() {
        return AUTHOR + ": " + TITLE + " (" + RELEASE_YEAR + ")";
    }

    public int getReleaseYear() {
        return RELEASE_YEAR;
    }



}
