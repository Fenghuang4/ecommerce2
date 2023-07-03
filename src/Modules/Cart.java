package Modules;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
    private ArrayList bookList;
    private double total;

    private Book temp;

    public Cart() {
        ArrayList bookList;
        double total;
        Book temp;
    }
    public void addBook(Book inputBook) {
        bookList.add(inputBook);
    }

    public double getTotal() {
        Iterator bookIterator = bookList.iterator();

        while(bookIterator.hasNext()) {
            temp = (Book) bookIterator.next();
            total += temp.getCost();
        }
        return total;
    }
}
