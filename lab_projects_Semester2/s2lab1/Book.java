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

    //IDK if We are going to use setter and getter methods but lab Wants it
    public long getISBN(){return isbn;}
    public String getTitle(){return title;}
    public int getPageCount(){return pageCount;}
    public int getPrice(){return price;}

    public void setISBN(long isbn){this.isbn = isbn;}
    public void setTitle(String title){this.title = title;}
    public void setPageCount(int pageCount){this.pageCount = pageCount;}
    public void setPrice(int price){this.price = price;}
}
