interface iReader extends iUser {
    
    void takeBook(iLibrarian librarian, Book book); // взять книгу
    void returnBook(iLibrarian librarian, Book book); // вернуть книгу
}
