interface iAdministrator<T extends User> {
    void overdueNotification(Reader reader); // уведомить о времени возврата
    void findBook(Book book); // найти книгу

}
