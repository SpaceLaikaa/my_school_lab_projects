package lab_projects_Semester2.s2lab1;

//MAIN CLASS
public class DigitalArchive {
    public static void main (String[] args){

        Book book1 = new Book(978935300,"Animal Farm",280,10);
        Book book2 = new Book(957945044,"Dorian Gray's Portrait",350,22);
        Book book3 = new Book(856953456, "No Longer Human",145,7);
        Book book4 = new Book(456895043,"JoJo's Bizarre Adventure",760,50);//For addBook method

        Book[] initialBooks = new Book[5];
        initialBooks[0] = book1;
        initialBooks[1] = book2;
        initialBooks[2] = book3;

        Librarian librarian = new Librarian(22,"Zehra",18,initialBooks);

        for (Book b : librarian.showArchive()){
            if(b!=null ){ // null error handler
                b.displayBooks();
                System.out.println();
            }
        }
        System.out.println("====================");
        System.out.println("Adding New Books");
        librarian.addBook(book4);
        System.out.println("====================");
        System.out.println("New book list");

        for (Book b : librarian.showArchive()) {
            if (b != null) {
                b.displayBooks();
                System.out.println();
            }
        }
    }
}
