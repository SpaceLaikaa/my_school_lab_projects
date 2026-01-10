package lab_projects.lab7.L7Assignment3;

import java.util.Scanner;

public class Book {

    public String titles;
    public int pages;

    public Book(String titles, int pages){
        this.titles = titles;
        this.pages = pages;
    }


    public  int addPages(int pagesIncrement){

        Scanner sc = new Scanner(System.in);
        pages = pagesIncrement+pages;
        return pages;
    }

    public  void printBook(){
        System.out.println("Title: " + titles + "\nPages: " + pages);
    }
}
