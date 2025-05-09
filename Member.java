package LibraryManagement;

public class Member {
    private int memberId;
    private String name;
    private Book borrowedBook;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void borrowBook(Book book) {
        borrowedBook = book;
        System.out.println(name + " borrowed \"" + book.getTitle() + "\".");
    }

    public void returnBook() {
        if (borrowedBook != null) {
            System.out.println(name + " returned \"" + borrowedBook.getTitle() + "\".");
            borrowedBook = null;
        } else {
            System.out.println(name + " has no book to return.");
        }
    }

    public void showBorrowedBook() {
        if (borrowedBook != null) {
            System.out.println(name + " has borrowed: " + borrowedBook);
        } else {
            System.out.println(name + " has not borrowed any book.");
        }
    }
}