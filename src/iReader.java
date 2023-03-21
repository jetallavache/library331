interface iReader<T extends User> {
    void takeBook(Book book); // взять книгу
    void returnBook(Book book); // вернуть книгу
}
