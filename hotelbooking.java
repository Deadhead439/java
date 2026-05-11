import java.util.*;
class hotelbooking{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int rooms[][]= new int[3][4];
int choice;
do{
System.out.println("Hotel booking System");
System.out.println("1.View Rooms");
System.out.println("2.Book Room");
System.out.println("3.Exit");
System.out.println("Enter Your Choice");
choice=sc.nextInt();

switch(choice){
case 1:
System.out.println("Room status (0- available, 1-booked)");
for(int i=0;i<3;i++){
System.out.println("Floor: "+(i+1)+" ");
for(int j=0;j<4;j++){
System.out.print(rooms[i][j]+" ");

}
System.out.println( "\n");
}
break;

case 2:
System.out.println("Enter the Floor no(1-3)");
int f=sc.nextInt();
System.out.println("Enter Room no: ");
int r=sc.nextInt();

if(f>=1 && f<=3 || r>=1 && r<=4){
  if(rooms[f-1][r-1]==0){
rooms[f-1][r-1]=1;
System.out.println("Room booked Sccessfully");

}
else{
System.out.println("Room already book: ");
}

}
else{
System.out.println("Invalid Room no or floor no");
}
break;

case 3:
System.out.println("Exiting... ");
break;

default:
System.out.println("Invalid Choice");
}
}
while(choice!=3);

}

}
