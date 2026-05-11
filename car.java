import java.util.*;

abstract class vehicle{

abstract void model();

}

class car extends vehicle{
void model(){
System.out.println("M4 Series");
}
public static void main(String [] args ){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Car Name");
String comp=sc.nextLine();

car c1 = new car();
System.out.println("Car name: " +comp);
c1.model();

}
}
