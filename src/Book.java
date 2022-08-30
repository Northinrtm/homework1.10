import java.util.Objects;

class Book {
    Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    private String name;
    private Author author;
    private int year;

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Название книги - '" + name + '\'' + ", author - " + author + ", year - " + year;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        if (this.author != ((Book) obj).author) {
            return false;
        }
        if ((this.year == ((Book) obj).year) && (this.name == ((Book) obj).name)) {
            b = true;
        }
        return b;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
