package Modules;

import java.util.ArrayList;
import java.util.Iterator;

public class Book extends Product {

    //Instance Variables
    private String ISBN;
    private String title;
    private ArrayList authors;
    private double cost;

    public static int count = 0;

    //Constructor - initialize instance variables
    public Book(String isbnInput, String titleInput, double costInput, String authorInput) {
        super(isbnInput, titleInput, costInput);
        authors = new ArrayList();
        this.ISBN = isbnInput;
        this.title = titleInput;
        this.cost = costInput;
        this.count++;
        authors.add(authorInput.split(" "));
    }

//    public Book(String commaSeperatedLine) {
//        //your implementation
//        // look at split method in String,
//        // initialize instance variable
//
//        String[] bookDetails = commaSeperatedLine.split(",");
//        this.ISBN = bookDetails[0];
//        this.title = bookDetails[1];
//        this.cost = Double.parseDouble(bookDetails[3]);
//        this.count++;
//    }

    public void printDetails() {
        System.out.println(" ISBN Number :"+ISBN + " title : "+title+ " author: "+ " cost:"+cost);
        Iterator authorsIterator = authors.iterator();
        while (authorsIterator.hasNext()){
            System.out.print("Author:" + authorsIterator.next());
        }
    }

    public double getCost() {
        return cost;
    }


}