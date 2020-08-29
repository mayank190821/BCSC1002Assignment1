/*  Created by IntelliJ IDEA.
 *  User: Mayank Bhugra
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBooks = new Book[3];

    public Library() {
        Book book = new Book();
        book.setBookName("Book1");
        book.setAuthorName("Author1");
        book.setISBNNumber("12-8-9-7-6");
        availableBooks[0] = book;
        book.setBookName("Book2");
        book.setAuthorName("Author2");
        book.setISBNNumber("8-96-5-8-7");
        availableBooks[1] = book;
        book.setBookName("Book3");
        book.setAuthorName("Author3");
        book.setISBNNumber("15-48-29-37");
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBooks=" + Arrays.toString(availableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getAvailableBooks(), library.getAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBooks());
    }
}
