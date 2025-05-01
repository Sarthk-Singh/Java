/*
class  library
name address

clsss Book
title autor isbn
displayInfo()

interface libraryOperations
addBook()
listBooks()
searchBook()
*/
import java.util.*;
interface libraryOperations
{
    public void addBook(int count);
    public void listBooks(int count);
    public boolean searchBook(int isbn,int count);
}
class Book
{
    String title;
    String author;
    int isbn;
    void setInfo(String title, String author,int isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    void displayInfo()
    {
        System.out.println("Title:"+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+isbn);
    }
}
class library implements libraryOperations
{
    String name;
    String address;
    Scanner sc=new Scanner(System.in);

    Book ob[]=new Book[100];
    

    library(String name,String address)
    {
        this.name=name;
        this.address=address;
    }
    public void addBook(int count)
    {
        System.out.print("Enter the title: ");
        String title=sc.next();
        System.out.print("Enter the author: ");
        String author=sc.next();
        System.out.print("Enter the ISBN: ");
        int isbn=sc.nextInt();
        ob[count] = new Book();
        ob[count].setInfo(title,author,isbn);
    }
    public void listBooks(int count)
    {
        for(int i=0;i<count;i++)
        {
            System.out.println("--------------------");
            System.out.println("Book "+(i+1));
            ob[i].displayInfo();
        }
    }
    public boolean searchBook(int isbn,int count)
    {
        for(int i=0;i<count;i++)
        {
            if(ob[i].isbn==isbn)
                return true;
        }
        return false;
    }
}
class LibraryManagementSystem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        library ob=new library("Sam's LB", "GEHU");
        int count=0;    //number of books in the library
        boolean go=true;
        System.out.println("*****Library Management System*****");
        while(go)
        {
            System.out.println("--------------------");
            System.out.println("Press\n1 to add a book\n2 to list the books in library\n3 to dearch a book\n0 to EXIT");
            System.out.println("--------------------");
            System.out.print("Input:");
            int input=sc.nextInt();

            switch(input)
            {
                case 1: 
                    ob.addBook(count);
                    count++;
                    System.out.println("Book Added!");
                    break;
                case 2:
                    ob.listBooks(count);
                    break;
                case 3:
                    System.out.print("Enter the ISB of the book to search: ");
                    int isbn=sc.nextInt();
                    if(ob.searchBook(isbn, count))
                        System.out.println("FOUND!");
                    else
                        System.out.println("NOT FOUND!");
                    break;
                case 0:
                    go=false;
                    break;
                default:
                    System.out.println("Invalid Output...Try Again!");
            }
        }
        sc.close();
    }
}