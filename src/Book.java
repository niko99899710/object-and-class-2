import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int age;

    public Book (String nameBook1, Author author, int age1) {
        this.nameBook = nameBook1;
        this.author = author;
        this.age = age1;
    }

    public String getName() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAge(int age) {
        this.age= age;
    }

    public String toString() {
        return "Название книги: " + this.nameBook + " Автор: " + this.author + " Год: " + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, age);
    }
}
