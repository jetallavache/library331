public class Reader extends User implements iReader {

    @Override
    public void takeBook(iLibrarian librarian, Book book) {
        System.out.println(" <берет книгу \"" + book.getName() + "\"> ");
    }

    @Override
    public void returnBook(iLibrarian librarian, Book book) {
        System.out.println(" <возвращает книгу \"" + book.getName() + "\"> ");
    }
}
