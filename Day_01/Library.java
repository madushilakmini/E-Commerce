abstract class Book {

    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public abstract void displayDetails();
}

class PrintedBook extends Book {

    private final int pageCount;

    public PrintedBook(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Printed Book: " + getTitle() + " by " + getAuthor() + ", Pages: " + pageCount);
    }
}

class EBook extends Book {

    private final double fileSize;

    public EBook(String title, String author, double fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("E-Book: " + getTitle() + " by " + getAuthor() + ", File Size: " + fileSize + "MB");
    }
}

class AudioBook extends Book {

    private final double duration;

    public AudioBook(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Audio Book: " + getTitle() + " by " + getAuthor() + ", Duration: " + duration + " hours");
    }
}

public class Library {

    public static void main(String[] args) {
       Book printedBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 180);
       Book eBook = new EBook("1984", "George Orwell", 1.2);
       Book audioBook = new AudioBook("To Kill a Mockingbird", "Harper Lee", 12.5);

        printedBook.displayDetails();
        eBook.displayDetails();
        audioBook.displayDetails();
    }
}