package lab_projects_Semester2.s2lab1;


//MAIN CLASS
public class DigitalArchive {
    public static void main (String[] args){
        Book[] books = new Book[5];
        Book book1 = new Book(978935300,"Animal Farm",280,10);
        Book book2 = new Book(95794504,"Dorian Gray's Portrait",350,22);
        book1.displayBooks();

    }
}
