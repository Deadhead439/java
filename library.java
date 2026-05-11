import java.util.*;

class book {

int bookid;
String title;
String author;
Boolean issued=false;
static int totalbooks=0;

book(int id,String bname, String auth){

bookid=id;
title=bname;
author=auth;
totalbooks++;

}

void issuebook(){

if(!issued){

issued=true;
System.out.println(title+ " has been issued");

}

else{

System.out.println(title+ " is Already issued");
}

}

void showbooks(){

System.out.println("Book id: "+bookid);
System.out.println("Title: "+title);
System.out.println("Author: "+author);
System.out.println("Status: " +(issued ? "Issued" : "Available"));

}

void returnbook(){

if(issued){

issued=false;
System.out.println(title+ " has been returned");

}

else{

System.out.println(title+ " was not issued");
}

}

static void showtotalbooks(){

System.out.println("Total books are:" +totalbooks);

}

}

class library {

public static void main(String [] args){

Scanner sc=new Scanner(System.in);

book [] lib = new book[40];

int count=0;
int choice;

do{

System.out.println("---Library Menu---");
System.out.println("1.Add Book");
System.out.println("2.view books");
System.out.println("3.Issue Book");
System.out.println("4.Return Book");
System.out.println("5.Total books count");
System.out.println("6.exit");

System.out.println("Enter your choice: ");

choice=sc.nextInt();
sc.nextLine();

switch(choice){

case 1:

System.out.println("Enter Book id");

int bookid=sc.nextInt();
sc.nextLine();

System.out.println("Enter book title: ");

String title=sc.nextLine();

System.out.println("Enter Author");

String author= sc.nextLine();

lib[count]=new book(bookid, title, author);

count++;

System.out.println("Book Added Successfully");

break;

case 2:

if(count==0){

System.out.println("no books in library");

}

else{

for(int i=0;i<count;i++){

lib[i].showbooks();

}

}

break;

case 3:

System.out.println("Enter Book id to issue: ");

int issueid=sc.nextInt();

Boolean found = false;

for(int i=0;i<count;i++){

if(lib[i].bookid==issueid){

lib[i].issuebook();

found= true;

break;
}

}

if(!found){

System.out.println("Book Not found");

}

break;

case 4:

System.out.println("Enter the book id to return");

int returnid=sc.nextInt();

for(int i=0;i<count;i++){

if(lib[i].bookid==returnid){

lib[i].returnbook();

break;
}

}

break;

case 5:

book.showtotalbooks();

break;

case 6:

System.out.println("Exiting library system.");

break;

default:

System.out.println("Invalid Choice");

}

} 
while(choice!=6);

}

}