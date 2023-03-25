public class Librarian extends User implements iLibrarian {

    @Override
    public void orderBook(iSupplier supplier, Book book) {
        System.out.println(" <заказывает книгу \"" + book.getName() + "\"> ");
    }
}
