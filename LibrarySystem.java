import java.util.Date;

class Book {
    int bookId;
    String bookName;
    String bookAuthor;
    String yearPub;
    float price;
    String status;

    void addNewBooks() {}
    void deleteBooks() {}
    void displayBookDetails() {}
    void inquiryBook() {}
}

class Librarian {
    int id;
    String name;

    void searchBook(String name) {}
    boolean verifyMember(int id) { return true; }
    void orderBooks() {}
    void sellBooks() {}
}

class Publisher {
    int id;
    String name;
    String address;
    int phoneNo;

    void addPub() {}
    void modifyPub() {}
    void deletePub() {}
    void orderStatus() {}
}

class User {
    int userID;
    String userName;
    String userAddress;
    int phoneNo;

    void returnBooks() {}
    int payFine(Date dt) { return 0; }
    void addNewUser() {}
    void deleteUser() {}
    void updateDetails() {}
    void bookPurchase() {}
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book();
        Librarian librarian = new Librarian();
        Publisher publisher = new Publisher();
        User user = new User();

        book.displayBookDetails();
        librarian.searchBook("Java Programming");
        user.bookPurchase();
    }
}
