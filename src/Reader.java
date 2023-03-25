public class Reader extends AbstractUser implements iReader, iSupplier {

    @Override
    public void takeBook(iAdministrator administrator, Book book) {
        System.out.printf("Читатель %s берёт книгу %s у администратора %s%n",
                this.getName(), book.getName(), administrator.getName());
    }

    @Override
    public void returnBook(iAdministrator administrator, Book book) {
        System.out.printf("Читатель %s возвращает книгу %s администратору %s%n",
                this.getName(), book.getName(), administrator.getName());
    }

    @Override
    public void bringBook(iLibrarian librarian, Book book) {
        System.out.printf("Читатель %s приносит книгу %s библиотекарю %s%n",
                this.getName(), book.getName(), librarian.getName());
    }
}
