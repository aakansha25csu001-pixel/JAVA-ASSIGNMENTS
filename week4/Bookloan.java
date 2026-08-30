 package week4;

public class Bookloan {

    static class Book {
        private String title;
        private String author;
        private String bookCode;
        private boolean loaned;

        public Book(String title, String author, String bookCode) {

            if (title == null || title.isBlank()) 
            {
                throw new IllegalArgumentException("Title cannot be blank");
            }

            if (author == null || author.isBlank()) 
            {
                throw new IllegalArgumentException("Author cannot be blank");
            }

            if (bookCode == null || bookCode.isBlank()) 
            {
                throw new IllegalArgumentException("Book code cannot be blank");
            }

            this.title = title;
            this.author = author;
            this.bookCode = bookCode;
            this.loaned = false;
        }

        public boolean borrowBook() {
            if (!loaned) {
                loaned = true;
                return true;
            }
            return false;
        }

        public boolean returnBook() {
            if (loaned) {
                loaned = false;
                return true;
            }
            return false;
        }

        public boolean isAvailable() {
            return !loaned;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getBookCode() {
            return bookCode;
        }

        @Override
        public String toString() {
            return "Title: " + title +", Author: " + author +", Book Code: " + bookCode +", Available: " + isAvailable();
        }
    }

    public static void main(String[] args) {

        Book b1 = new Book("Java", "James", "B101");
        Book b2 = new Book("Python ", "Robin", "B102");
        System.out.println(b1.borrowBook());
        System.out.println(b1.borrowBook());
        System.out.println(b1.returnBook());
        System.out.println(b1.returnBook());
          System.out.println(b2.borrowBook());

        System.out.println(b1);
        System.out.println(b2);
    }
}