public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("J.", "Kang");
        Author author2 = new Author("Lu", "Kang");
        Author author3 = new Author("Lev", "Tolstoy");
        Book vinni = new Book("VinniPooh", author1, 1975);
        Book warAndPeace = new Book("Война и мир", author2, 1901);
        Book warWithoutPeace = new Book("Война и мир", author3, 1901);
        System.out.println(vinni.getPublicationYear());
        vinni.setPublicationYear(1911);
        System.out.println(vinni.getPublicationYear());
        System.out.println(vinni.getAuthor());
        System.out.println(author2);
        System.out.println(vinni);
        System.out.println(warWithoutPeace.equals(warAndPeace));
        System.out.println(author2.equals(author1));
    }
}

