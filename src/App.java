public class App {
    public static void main(String[] args) {
        Author tolkien = new Author("John", "Tolkien");
        Author rowling = new Author("Joanne", "Rowling");
        Book theLord = new Book("The Lord of the Rings", tolkien, 1995);
        Book harryPotter = new Book("Harry Potter", rowling, 1997);
        System.out.println("theLord.getNameBook() = " + theLord.getNameBook());
        System.out.println("theLord.getAuthor() = " + theLord.getAuthor());
        System.out.println("theLord.getPublishingYear() = " + theLord.getPublishingYear());
        System.out.println("harryPotter.getNameBook() = " + harryPotter.getNameBook());
        System.out.println("harryPotter.getAuthor() = " + harryPotter.getAuthor());
        System.out.println("harryPotter.getPublishingYear() = " + harryPotter.getPublishingYear());
        harryPotter.setPublishingYear(1999);
        System.out.println("harryPotter.getPublishingYear() = " + harryPotter.getPublishingYear());
    }
}

