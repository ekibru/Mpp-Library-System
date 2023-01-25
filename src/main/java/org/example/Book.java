package org.example;

public class Book extends LendingItem{
    private String isbn;
    private String title;
    private String aFirstName;
    private String aLastname;

    public Book(String isbn, String title, String aFirstName, String aLastname) {
        this.isbn = isbn;
        this.title = title;
        this.aFirstName = aFirstName;
        this.aLastname = aLastname;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getaFirstName() {
        return aFirstName;
    }

    public void setaFirstName(String aFirstName) {
        this.aFirstName = aFirstName;
    }

    public String getaLastname() {
        return aLastname;
    }

    public void setaLastname(String aLastname) {
        this.aLastname = aLastname;
    }
}
