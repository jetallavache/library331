interface iReader extends iUser {

    void takeBook(iAdministrator administrator, Book book); // взять книгу

    void returnBook(iAdministrator administrator, Book book); // вернуть книгу
}
