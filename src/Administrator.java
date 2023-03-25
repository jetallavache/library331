public class Administrator extends User implements iAdministrator, iReader {
    
    @Override
    public void overdueNotification(iReader reader, Book book) {
        System.out.println(" <уведомляет о времени возврата\" " + reader.getName() + "\"> ");
    }

    @Override
    public void findBook(iReader reader, Book book) {
        System.out.println(" <находит книгу \" " + book.getName() + "\"> ");
    }

    @Override
    public void takeBook(iLibrarian librarian,  Book book) {
        System.out.println(" <берет книгу \" " + book.getName() + "\"> ");
    }

    @Override
    public void returnBook(iLibrarian librarian, Book book) {
        System.out.println(" <возвращает книгу \" " + book.getName() + "\"> ");
    }
}
