class  Book {
    static int totalNoOfBooks;
    String author;
    String  title;
    String  isbn;
    boolean isBorrowed;
    static {
        totalNoOfBooks = 0;
    }
    { // object init
        totalNoOfBooks++;
    }
    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }
    static int getTotalNoBooks() {
        return totalNoOfBooks;
    }
    void borrowBook() {
        if (isBorrowed) {
            System.out.println("Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("enjoy the book");
        }
    }
    void returnBook() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("please give review");
        } else {
            System.out.println("in the lib");
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "autjor");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}