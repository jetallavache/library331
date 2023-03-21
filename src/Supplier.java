public class Supplier extends User implements iSupplier<Supplier> {
    @Override
    public void bringBook(Book book) {
        System.out.println(" <приносит книгу \"" + book.getName() + "\"> ");
    }
}
