public class Librarian extends User implements iLibrarian<Librarian> {
    @Override
    public void orderBook(Book book) {
        System.out.println(" <заказывает книгу \"" + book.getName() + "\"> ");
    }
}
