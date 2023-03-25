public class Supplier extends User implements iSupplier {

    @Override
    public void bringBook(iLibrarian librarian, Book book) {
        System.out.println(" <приносит книгу \"" + book.getName() + "\"> ");
    }
}
