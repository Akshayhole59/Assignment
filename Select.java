
public class PreparedSelect {
	public static void main(String vivek[]) 
	{

	try {
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","01071995");
		
				PreparedStatement stmt=con.prepareStatement("Select * from student");
				ResultSet rs=stmt.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getString(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
				}
				stmt.close();
				con.close();
	}
	
	catch(Exception xe)
	{
		xe.printStackTrace();
	}
	}