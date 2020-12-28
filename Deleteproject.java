import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class ScaneerPre {
	public static void main(String vivek[]) 
	{

	try {
		Scanner sc=new Scanner(System.in);
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","01071995");
		
				PreparedStatement stmt=con.prepareStatement("Delete from  Student where PRJ_NO='1'");
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
