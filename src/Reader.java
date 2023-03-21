public class Reader extends User implements iReader<Reader> {
    @Override
    public void takeBook(Book book) {
        System.out.println(" <берет книгу \"" + book.getName() + "\"> ");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(" <возвращает книгу \"" + book.getName() + "\"> ");
    }

}
