package lab_projects_Semester2.s2lab1;

//MAIN CLASS
public class DigitalArchive {
    public static void main (String[] args){
        Book[] books = new Book[5];
        Book book1 = new Book(978935300,"Animal Farm",280,10);
        Book book2 = new Book(957945044,"Dorian Gray's Portrait",350,22);
        Book book3 = new Book(856953456, "No Longer Human",145,7);

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        for (Book b : books){
            if(b!=null ){ // may happen a null error
                book1.displayBooks();
                System.out.println();
            }
        }

        Librarian librarian = new Librarian(22,"Zehra",18,books);

    }
}
