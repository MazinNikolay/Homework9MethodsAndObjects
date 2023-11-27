public class App {
    public static int callBookCount = 0;

    public static void main(String[] args) {
        Author tolkien = new Author("John", "Tolkien");
        Author rowling = new Author("Joanne", "Rowling");
        Author king = new Author("Stephen", "King");
        Book theLord = new Book("The Lord of the Rings", tolkien, 1995);
        Book harryPotter = new Book("Harry Potter", rowling, 1997);
        Book theStand = new Book("The Stand", king, 1978);
        System.out.println("theLord.getNameBook() = " + theLord.getNameBook());
        System.out.println("theLord.getAuthor() = " + theLord.getAuthor());
        System.out.println("theLord.getPublishingYear() = " + theLord.getPublishingYear());
        System.out.println("harryPotter.getNameBook() = " + harryPotter.getNameBook());
        System.out.println("harryPotter.getAuthor() = " + harryPotter.getAuthor());
        System.out.println("harryPotter.getPublishingYear() = " + harryPotter.getPublishingYear());
        harryPotter.setPublishingYear(1999);
        System.out.println("harryPotter.getPublishingYear() = " + harryPotter.getPublishingYear());
        //Повышенная сложность #1
        Book[] books = new Book[5];
        putBookToArray(books, theLord);
        putBookToArray(books, harryPotter);
        putBookToArray(books, theStand);
        putBookToArray(books, theLord);
        putBookToArray(books, harryPotter);
        putBookToArray(books, theStand);
        printArrayBook(books);
        //Повышенная сложность #2
        Library library = new Library(4);
        library.putBookToArray(theStand);
        library.putBookToArray(theLord);
        library.putBookToArray(harryPotter);
        library.putBookToArray(theStand);
        library.putBookToArray(theLord);
        library.printArrayBook();
        library.printOnName(theStand.getNameBook());
        library.printOnName("aqwqw");
        library.changePublishingYearOnName(theLord.getNameBook(), 2000);
        library.printArrayBook();
    }

    public static void putBookToArray(Book[] books, Book book) {
        if (callBookCount < 5) {
            for (int i = 0; i < books.length; i++) {
                if (books[i] == null) {
                    books[i] = book;
                    callBookCount++;
                    return;
                }
            }
        } else {
            System.out.println("Метод вызывается более 5 раз");
        }
    }

    public static void printArrayBook(Book[] books) {
        for (Book bookIterator : books) {
            System.out.println("\"" + bookIterator.getAuthor() + ": " + bookIterator.getNameBook() + ": " + bookIterator.getPublishingYear() + "\"");
        }
    }
}

