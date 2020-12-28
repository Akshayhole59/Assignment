import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class ScaneerPre {
	public static void main(String vivek[]) 
	{

	try {
		Scanner sc=new Scanner(System.in);
		String Student_name=sc.next();
		String Student_DOB=sc.next();
		String Student_DOJ=sc.next();
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","01071995");
		
				PreparedStatement stmt=con.prepareStatement("insert into Student values(?,?,?)");
				stmt.setString(1,Student_name);
				stmt.setString(2,Student_DOB);
				stmt.setString(3,Student_DOJ);
				int count=stmt.executeUpdate();
				stmt.close();
				con.close();
	}
	
	catch(Exception xe)
	{
		xe.printStackTrace();
	}
	}
	}
