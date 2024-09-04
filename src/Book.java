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


}
