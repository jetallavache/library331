public class Administrator extends AbstractUser implements iAdministrator, iReader {

    @Override
    public void overdueNotification(iReader reader, Book book) {
        System.out.printf("Администратор %s уведомляет читателя %s о времени возврата книги %s%n",
                this.getName(), reader.getName(), book.getName());
    }

    @Override
    public void findBook(iReader reader, Book book) {
        System.out.printf("Администратор %s находит и выдаёт книгу %s читателю %s%n",
                this.getName(), book.getName(), reader.getName());
    }

    @Override
    public void takeBook(iAdministrator administrator, Book book) {
        System.out.printf("Администратор %s берёт книгу %s у администратора %s%n",
                this.getName(), book.getName(), administrator.getName());
    }

    @Override
    public void returnBook(iAdministrator administrator, Book book) {
        System.out.printf("Администратор %s возвращает книгу %s администратору %s%n",
                this.getName(), book.getName(), administrator.getName());
    }
}
