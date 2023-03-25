public class Supplier extends AbstractUser implements iSupplier {

    @Override
    public void bringBook(iLibrarian librarian, Book book) {
        System.out.printf("Поставщик %s приносит книгу %s библиотекарю %s%n",
                this.getName(), book.getName(), librarian.getName());
    }
}
