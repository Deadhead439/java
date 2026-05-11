import java.sql.*;
import java.util.*;

class StudentJDBC {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

String url = "jdbc:mysql://localhost:3306/college";
String user = "root";
String pass = "umk000me";

try {

Connection con = DriverManager.getConnection(url, user, pass);

con.setAutoCommit(false);

int choice;

do {

System.out.println("\n1 Add  2 View  3 Update  4 Delete  5 Exit");
System.out.print("Enter choice: ");
choice = sc.nextInt();

try {

switch(choice) {

case 1:

System.out.print("Enter ID: ");
int id = sc.nextInt();
sc.nextLine();

System.out.print("Enter Name: ");
String name = sc.nextLine();

System.out.print("Enter Marks: ");
double marks = sc.nextDouble();

String insert = "INSERT INTO student VALUES(?,?,?)";

PreparedStatement ps1 = con.prepareStatement(insert);

ps1.setInt(1, id);
ps1.setString(2, name);
ps1.setDouble(3, marks);

ps1.executeUpdate();

con.commit();

System.out.println("Record added");

break;

case 2:

String select = "SELECT * FROM student";

Statement st = con.createStatement();

ResultSet rs = st.executeQuery(select);

while(rs.next()) {

System.out.println(
rs.getInt(1) + " " +
rs.getString(2) + " " +
rs.getDouble(3)
);

}

break;

case 3:

System.out.print("Enter ID to update: ");
int uid = sc.nextInt();
sc.nextLine();

System.out.print("Enter new name: ");
String uname = sc.nextLine();

String update = "UPDATE student SET name=? WHERE id=?";

PreparedStatement ps2 = con.prepareStatement(update);

ps2.setString(1, uname);
ps2.setInt(2, uid);

ps2.executeUpdate();

con.commit();

System.out.println("Record updated");

break;

case 4:

System.out.print("Enter ID to delete: ");
int did = sc.nextInt();

String delete = "DELETE FROM student WHERE id=?";

PreparedStatement ps3 = con.prepareStatement(delete);

ps3.setInt(1, did);

ps3.executeUpdate();

con.commit();

System.out.println("Record deleted");

break;

case 5:

System.out.println("Program Ended");

break;

default:

System.out.println("Invalid Choice");

}

}

catch(Exception e) {

con.rollback();

System.out.println("Transaction failed, rolled back");

}

} while(choice != 5);

con.close();

}

catch(Exception e) {

System.out.println(e);

}

}

}