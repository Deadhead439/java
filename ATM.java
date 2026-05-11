import java.util.*;
class ATM {
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
double balance=1000;
int choice;
do{
System.out.println("---ATM---");
System.out.println("1.Check Balance");
System.out.println("2.Deposit");
System.out.println("3.Withdraw");
System.out.println("4.Exit");
System.out.println("Enter Your Choice: ");
choice=sc.nextInt();

try{
switch (choice){
case 1:
System.out.println("Balance: "+balance);
break;

case 2:
System.out.println("Enter Amount to deposit: ");
double deposit=sc.nextDouble();
if(deposit<=0){
throw new IllegalArgumentException("Invalid Amount");
}
balance += deposit;
System.out.println("Amount Deposited Successfully");
break;

case 3:
System.out.println("Enter Amount to withdraw");
double withdraw = sc.nextDouble();
if(withdraw > balance){
throw new ArithmeticException("Insufficient Funds");
}
if(withdraw<=0){
throw new IllegalArgumentException("Invalid Withdrawal Amount");
}
balance -= withdraw;
System.out.println("Amount Withdrawal Successful");
break;

case 4:
System.out.println("Thank you for Visiting the bank");
break;
default:
System.out.println("Invalid Choice ");

}


}
catch(ArithmeticException e)
{
System.out.println(e.getMessage());
}
catch(IllegalArgumentException e){
System.out.println(e.getMessage());

}

finally{
System.out.println("Transaction Successful");
}
}
while(choice!=4);

}


}