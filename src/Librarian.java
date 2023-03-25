public class Librarian extends AbstractUser implements iLibrarian {

    @Override
    public void orderBook(iSupplier supplier, Book book) {
        System.out.printf("Библиотекарь %s заказывает книгу %s у поставщика %s%n",
                this.getName(), book.getName(), supplier.getName());
    }
}
