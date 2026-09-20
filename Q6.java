class Author {
    String name, email, gender;

    Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
}

class Book {
    String title;
    int price;
    Author author;

    Book(String t, int p, Author a) {
        title = t;
        price = p;
        author = a;
    }

    public String toString() {
        return "Book: " + title + "\nPrice: " + price +
               "\nAuthor: " + author.name + " (" + author.gender + "), Email: " + author.email;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Author a = new Author("Joshua Bloch", "jbloch@abc.com", "M");
        Book b = new Book("Effective Java", 550, a);
        System.out.println(b);
    }
}