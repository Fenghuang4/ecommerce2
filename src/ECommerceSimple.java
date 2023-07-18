import Modules.Book;
import Modules.Cart;
import Modules.Computer;
import Modules.Product;

public class ECommerceSimple {

    public static void main(String[] args) {
        Product javaBook = new Book("ISNB0001", "How to program in Java", 24.5,"John Doe");
        javaBook.printDetails();

        Product cPlusPlusBook = new Book("ISNB0002", "How to program in c Plus Plus", 19.9,"Sally Smith");
        cPlusPlusBook.printDetails();

        Product bookInitializedFromLine = new Book("ISNB0003", "How to program in JavaScript", 21.2,"Adam");

        Product T14 = new Computer("20UD", "Lenovo", 1000);
        /*
        Initialize cart object.
        */


        Cart myCart = new Cart();
        myCart.addProduct(javaBook);
        myCart.addProduct(cPlusPlusBook);
        myCart.addProduct(bookInitializedFromLine);
        myCart.addProduct(T14);

        double cartTotal = myCart.getTotal();

        System.out.println("Cart Total: " + cartTotal);

    }
}
