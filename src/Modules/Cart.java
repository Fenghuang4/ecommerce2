package Modules;

import java.util.ArrayList;
import java.util.Iterator;
//Make Cart Genaric
public class Cart {
    private ArrayList productList;
    private double total;

    private Product temp;

    public Cart() {
        this.productList = null;
        this.total = 0.0;
        this.temp = null;
    }
    public void addProduct(Product inputProduct) {

        productList.add(inputProduct);
    }

    public double getTotal() {
        Iterator bookIterator = productList.iterator();

        while(bookIterator.hasNext()) {
            temp = (Product) bookIterator.next();
            total += temp.getCost();
        }
        return total;
    }
}
