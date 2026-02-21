package lab_projects_Semester2.s2lab1;

public class Librarian {
    public int bookCount=0;
    private int employeeID;
    private String name;
    private int age;
    private Book[] books;

    public Librarian(int employeeID, String name, int age,Book[] comingBooks){
        this.employeeID = employeeID;
        this.name=name;
        this.age = age;
        this.books = new Book[5];

        int boundary=comingBooks.length;
        if(boundary>5){
            boundary=5;
        }
        for(int i =0;i< boundary;i++){
            bookCount++;
            this.books[i] = comingBooks[i];
        }
    }
    public void addBook(Book addBook){
        if(bookCount >= 5){System.out.println("Archive is full!");}
        else{books[bookCount]=addBook;
            bookCount++;
            System.out.println( addBook.getTitle()+" has been added to archive.");
        }
    }
    public void removeBook(String isbn){

    }

}
