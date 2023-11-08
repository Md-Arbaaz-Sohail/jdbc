package test;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class book {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	try(s;){
		try {
			System.out.println("Enter the book: ");
			int code=s.nextInt();
			s.nextLine();
			System.out.println("Enter the book name: ");
			String name=s.nextLine();
			System.out.println("Enter the auther name : ");
			String author =s.nextLine();
			System.out.println("Enetr the price of the book:");
			int price =s.nextInt();
			s.nextLine();
			System.out.println("Enter the number of books in shalf:");
			int qunty=s.nextInt();
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					"system", "abcd");
			Statement stm=con.createStatement();
			int k= stm.executeUpdate("insert into book values('"+code+"','"+name+"','"+author+"','"+price+"','"+qunty+"')");
			if(k>0) {
				System.out.println("row is inserted succefull...");
			}
			con.close();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	}

}
