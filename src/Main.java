public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("J.", "Kong");
        Author author2 = new Author("Lu", "Kang");
        Book vinni = new Book("VinniPooh", author1, 1975);
        Book warAndPeace = new Book("Война и мир", author2, 1901);
        System.out.println(warAndPeace.getPublicationYear());
        System.out.println(author2.getFirstName() + " "+ author2.getLastName());
    }
}

