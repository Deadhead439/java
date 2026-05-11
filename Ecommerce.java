import java.util.*;
class product{
int productid;
String pname;
double price;
int quantity;

product(){
productid=101;
pname="Laptop";
price=75000;
quantity=2;

}

product(int pid, String name, double p, int quant){
productid=pid;
pname=name;
price=p;
quantity=quant;


}
double caltotal(){
return price* quantity;

}

}
class Ecommerce{
public static void main(String [] args){

Scanner sc=new Scanner(System.in);
product p1 = new product();
System.out.println("Enter Product id: ");
int id=sc.nextInt();
sc.nextLine();
System.out.println("Enter Product name: ");
String name=sc.nextLine();
System.out.println("Enter Price: ");
double price = sc.nextDouble();
System.out.println("Enter Quantity: ");
int quantity=sc.nextInt();

product p2= new product(id,name,price,quantity);


double total1=p1.caltotal();
double total2=p2.caltotal();
double grandtotal=total1+total2;

double discount =0;

if (grandtotal>5000){
discount=grandtotal*0.10;

}
else if(grandtotal>3000){

discount=grandtotal*0.05;
}
double finalamnt = grandtotal-discount;


System.out.println("Invoice");
System.out.println("Product 1 details: ");
System.out.println("Product ID:" +p1.productid);
System.out.println("Product Name: "+p1.pname);
System.out.println("Product Price: "+p1.price);
System.out.println("Product Quantity: "+p1.quantity);
System.out.println("Total:" +total1);

System.out.println("Product 2 details: ");
System.out.println("Product ID:" +p2.productid);
System.out.println("Product Name: "+p2.pname);
System.out.println("Product Price: "+p2.price);
System.out.println("Product Quantity: "+p2.quantity);
System.out.println("Total:" +total2);

System.out.println("Grand Total:" +grandtotal);
System.out.println("Discount : " +discount);
System.out.println("Final Amount:" +finalamnt);
System.out.println("Thank you for visiting the shop");
}

}