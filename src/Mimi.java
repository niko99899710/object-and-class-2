public class Mimi {
    private Author author;
    String nameBook;
    int ageBook;

    public Mimi(String nameBook, Author author, int ageBook) {
        this.nameBook = nameBook;
        this.author = author;
        this.ageBook = ageBook;
    }

    public Mimi (String nameBook, Author author) {
        this.nameBook = nameBook;
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAgeBook(int ageBook) {
        this.ageBook = ageBook;
    }
}
