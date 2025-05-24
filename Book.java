public class Book {
    String title;
    String author;

    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + title);
        if (author != null) {
            System.out.println("Author: " + author);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984");
        Book b2 = new Book("To Kill a Mockingbird", "Harper Lee");

        b1.display();
        b2.display();
    }
}
