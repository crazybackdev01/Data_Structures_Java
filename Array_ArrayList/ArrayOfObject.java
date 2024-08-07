package Array_ArrayList;

import java.util.Arrays;

class Book {
    int isbn;
    String name;
    int price;

    public Book(int isbn, String name, int price) {
        this.isbn = isbn;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Book { " + "isbn= " + isbn + ", name= " + name + " price= " + price + " }";
    }
}

public class ArrayOfObject {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        books[1] = new Book(2, "C++", 5000);
        books[2] = new Book(3, "Python", 6000);
        books[0] = new Book(1, "Java", 3000);

        // System.out.println(books);
        System.out.println(Arrays.toString(books));

        Arrays.sort(books, (b1, b2) -> (b1.price - b2.price));
        System.out.println(Arrays.toString(books));
    }
}
