public class Administrator extends User implements iAdministrator<Administrator>, iReader<Reader> {
    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(" <уведомляет о времени возврата\" " + reader.getName() + "\"> ");
    }

    @Override
    public void findBook(Book book) {
        System.out.println(" <находит книгу \" " + book.getName() + "\"> ");
    }

    @Override
    public void takeBook(Book book) {
        System.out.println(" <берет книгу \" " + book.getName() + "\"> ");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(" <возвращает книгу \" " + book.getName() + "\"> ");
    }
}
