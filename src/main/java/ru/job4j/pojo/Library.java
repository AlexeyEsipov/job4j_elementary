package ru.job4j.pojo;

public class Library {

    public void printLibrary(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + " " + books[i].getName() + " "
                    + books[i].getPages() + " pages");
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book();
        book1.setName("Book One");
        book1.setPages(150);
        Book book2 = new Book();
        book2.setName("Book Two");
        book2.setPages(200);
        Book book3 = new Book();
        book3.setName("Book Three");
        book3.setPages(100);
        Book book4 = new Book();
        book4.setName("Clean Code");
        book4.setPages(500);
        Book[] libr = new Book[4];
        libr[0] = book1;
        libr[1] = book2;
        libr[2] = book3;
        libr[3] = book4;
        library.printLibrary(libr);
        Book tmp = libr[0];
        libr[0] = libr[3];
        libr[3] = tmp;
        library.printLibrary(libr);
        for (int i = 0; i < libr.length; i++) {
            if (libr[i].getName().equals("Clean Code")) {
                System.out.println("Book " + (i + 1) + " " + libr[i].getName() + " "
                        + libr[i].getPages() + " pages");
            }
        }
    }
}
