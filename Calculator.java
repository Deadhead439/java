import java.util.*;
class Calculator{
public static void main (String [] args){
Scanner sc = new Scanner(System.in);
char choice='y';
while(choice=='y'|| choice=='Y') 
{
System.out.println("*******Calculator Menu*******");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.println("Enter your choice:");
int ch =sc.nextInt();
double n1,n2,result;
System.out.println("Enter first number");
n1=sc.nextDouble();
System.out.println("Enter Second Number");
n2=sc.nextDouble();

switch(ch){

case 1:
result=n1+n2;
System.out.println("Addition is : " +result);
break;
case 2:
result = n1-n2;
System.out.println("Subtraction is: "+result);
break;
case 3:
result=n1*n2;
System.out.println("Multiplication is: "+result);
break;
case 4:
while(n2==0){
System.out.println("Division by zero is not allowed");
System.out.println("Enter the number greater than 0 ");
n2=sc.nextDouble();

}
result=n1/n2;
System.out.println("Division is : "+result);
break;
default:
System.out.println("Invalid Choice! enter 1 to 4 choice ");

}
System.out.println("Do you want to continue(y/n)");
choice=sc.next().charAt(0);


}
System.out.println("Thank you");
}


}