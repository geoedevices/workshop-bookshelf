package com.codecool.workshopbookshelf;

public class PaperbackBook extends Book {

    private final static int PAGE_WEIGHT = 10;
    private final static int COVER_WEIGHT = 20;

    public PaperbackBook(String title, String author, int releaseYear, int numberOfPages) {
        super(title, author, releaseYear, numberOfPages, numberOfPages * PAGE_WEIGHT + COVER_WEIGHT);
    }


}
