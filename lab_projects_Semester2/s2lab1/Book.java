package lab_projects_Semester2.s2lab1;

public class Book {
    private long isbn; //International Standard Book Number
    private String title;
    private int pageCount;
    private int price; //May be float ?

    public Book(long isbn, String title, int pageCount, int price){
        this.isbn = isbn;
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    public void displayBooks(){
        System.out.printf("ISBN: %d | Title: %s | Page Count: %d | Price: $%d",isbn,title,pageCount,price);
    }
}
