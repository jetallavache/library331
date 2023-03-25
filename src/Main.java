public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();
        reader.setName("Пётр");

        Librarian librarian = new Librarian();
        librarian.setName("Анатолий");

        Supplier supplier = new Supplier();
        supplier.setName("Антон");

        Administrator admin1 = new Administrator();
        admin1.setName("Николай");

        Administrator admin2 = new Administrator();
        admin2.setName("Дмитрий");

        Book book1 = new Book();
        book1.setName("Зелёная миля");

        Book book2 = new Book();
        book2.setName("Война и мир");

        librarian.orderBook(supplier, book1);
        supplier.bringBook(librarian, book1);
        reader.takeBook(admin1, book1);
        admin1.findBook(reader, book1);
        admin1.overdueNotification(reader, book1);
        reader.returnBook(admin1, book1);

        librarian.orderBook(reader, book2); // Демонстрация полиморфизма (представляем Читателя в качестве Поставщика)
        reader.bringBook(librarian, book2); // Демонстрация совмещения роли Reader и Supplier
        admin1.takeBook(admin2, book2); // Демонстрация совмещения роли Reader и Administrator
        admin2.findBook(admin1, book2); // Демонстрация полиморфизма (представляем Администратора в качестве Читателя)
        admin2.overdueNotification(admin1, book2); // Демонстрация полиморфизма (представляем Администратора в качестве Читателя)
        admin1.returnBook(admin2, book2); // Демонстрация совмещения роли Reader и Administrator
    }
}
