interface iAdministrator extends iUser {

    void overdueNotification(iReader reader, Book book); // уведомить о времени возврата
    void findBook(iReader reader, Book book); // найти книгу
}
