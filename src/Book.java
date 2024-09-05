import java.util.Objects;

public class Book{
    private final String named;
    private int publicationYear;
    private final Author author;
    public Book(String named, Author author, int publicationYear){
        this.named = named;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNamed() {
        return named;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String toString(){
        return "Название:" + named + " Автор:"+ author.toString()+ " Год выпуска - "+publicationYear;
    }

    @Override
    public boolean equals(Object named) {
        if (this == named) return true;
        if (named == null || getClass() != named.getClass()) return false;
        Book book = (Book) named;
        return Objects.equals(this.named, book.named);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(named);
    }
}
