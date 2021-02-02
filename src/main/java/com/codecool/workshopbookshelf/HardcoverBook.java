package com.codecool.workshopbookshelf;

public class HardcoverBook extends Book {

    private final static int PAGE_WEIGHT = 10;
    private final static int COVER_WEIGHT = 100;

    public HardcoverBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * PAGE_WEIGHT + COVER_WEIGHT);
    }


}
