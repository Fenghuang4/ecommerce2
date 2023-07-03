import Modules.Book;
import Modules.Cart;

public class ECommerceSimple {

    public static void main(String[] args) {
        Book javaBook = new Book("ISNB0001", "How to program in Java", "John Doe", 24.5);
        javaBook.printBookDetails();

        Book cPlusPlusBook = new Book("ISNB0002", "How to program in c Plus Plus", "Sally Smith", 19.9);
        cPlusPlusBook.printBookDetails();

        Book bookInitializedFromLine = new Book("ISNB0003, How to program in JavaScript, Adam, 21.2");



        Cart myCart = new Cart();
        myCart.addBook(javaBook);
        myCart.addBook(cPlusPlusBook);
        myCart.addBook(bookInitializedFromLine);

        double cartTotal = myCart.getTotal();

        System.out.println("Cart Total: " + cartTotal);
    }
}