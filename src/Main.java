public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setName("The Green Mile");

        Book book2 = new Book();
        book1.setName("Pet Sematary");

        Reader reader1 = new Reader();
        reader1.setName("Bay");

        User reader2 = new Reader();
        reader2.setName("Alex");

        reader1.takeBook(book1);
        reader1.returnBook(book2);

        Administrator admin1 = new Administrator();
        admin1.overdueNotification(reader1);

    }
}