interface iAdministrator extends iUser {

    void overdueNotification(iReader reader, Book book); // уведомить читателя о времени возврата книги

    void findBook(iReader reader, Book book); // найти и выдать книгу
}
