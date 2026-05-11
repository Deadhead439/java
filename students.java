import java.util.*;
class person{
void displayname(String name){
System.out.println("Name : "+name);

}

}
class students extends person{
void displaycourse(String course){
System.out.println("Course: "+ course);
}
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Name: ");
String name=sc.nextLine();
System.out.println("Enter Course ");
String course=sc.nextLine();

students s1=new students();
s1.displayname(name);
s1.displaycourse(course);

}
}