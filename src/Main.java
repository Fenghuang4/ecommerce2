import Modules.Book;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book javaBook = new Book("ISNB0001, How to program in Java, John Doe, 21.2");
        javaBook.printBookDetails();

        Book javaScriptBook = new Book("ISNB0002, How to program in JavaScript, Sally Smith, 19.2");
        javaScriptBook.printBookDetails();
    }
}