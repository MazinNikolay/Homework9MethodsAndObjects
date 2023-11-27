public class Library {
    private Book[] library;
    public int callBookCount = 0;

    public Library(int booksLength) {
        this.library = new Book[booksLength];
    }

    public void putBookToArray(Book book) {
        if (callBookCount < 5 && callBookCount < library.length) {
            for (int i = 0; i < library.length; i++) {
                if (library[i] == null) {
                    library[i] = book;
                    callBookCount++;
                    return;
                }
            }
        } else {
            System.out.println("Метод вызывается более 5 раз");
        }
    }

    public void printArrayBook() {
        for (Book bookIterator : library) {
            System.out.println("\"" + bookIterator.getAuthor() + ": " + bookIterator.getNameBook() + ": " + bookIterator.getPublishingYear() + "\"");
        }
    }

    public void printOnName(String name) {
        for (Book bookIterator : library) {
            if (name.equals(bookIterator.getNameBook())) {
                System.out.println("\"" + bookIterator.getNameBook() + " by " + bookIterator.getAuthor() + " was published in " + bookIterator.getPublishingYear() + "\"");
                return;
            }
        }
        System.out.println("Такой книги нет");
    }

    public void changePublishingYearOnName(String name, int newPublishingYear) {
        for (Book bookIterator : library) {
            if (name.equals(bookIterator.getNameBook())) {
                bookIterator.setPublishingYear(newPublishingYear);
                return;
            }
        }
        System.out.println("Такой книги нет");
    }
}
