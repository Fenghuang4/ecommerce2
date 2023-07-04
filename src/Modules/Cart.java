package Modules;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {
    private ArrayList bookList;
    private double total;

    private Book temp;

    public Cart() {
        this.bookList = null;
        this.total = 0.0;
        this.temp = null;
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
