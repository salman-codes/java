import java.sql.*;
import java.util.*;
class StudentInfo {
	int enrol_no;
	String name,course,m_no,email_id,session;
	void addNewRecord() {
		Scanner in=new Scanner(System.in);
		System.out.println("How many records you want to enter? ");
		int n=in.nextInt();
		try {
			Statement st=con.createStatement();
			for(int i=0; i<n; i++) {
				System.out.println("Enter name: ");
				name=in.next();
				System.out.println("Enter enrol_no: ");
				enrol_no=in.nextInt();
				System.out.println("Enter course: ");
				course=in.nextLine();
				System.out.println("Enter Session: ");
				session=in.nextLine();
				System.out.println("Enter mobile no: ");
				m_no=in.next();
				System.out.println("Enter email_id: ");
				email_id=in.nextLine();
				String query="INSERT INTO Student"+" VALUES("+'name','course',enrol_no,'session','m_no','email_id'+")";
				st.execute(query);
			}
		}catch(SQLException s) {
				System.out.println("Can not connect to the database. "+s);
		}
	}
	void modifyRecord() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the enrolment number for which you want to modify the record: ");
		int n=in.nextInt();
		System.out.println("Enter new records: ");
		try {
			Statement st=con.createStatement();
			System.out.println("Enter name: ");
			name=in.next();
			System.out.println("Enter course: ");
			course=in.nextLine();
			System.out.println("Enter Session: ");
			session=in.nextLine();
			System.out.println("Enter mobile no: ");
			m_no=in.next();
			System.out.println("Enter email_id: ");
			email_id=in.nextLine();
			String query="UPDATE TABE Student SET VALUES("+'name','course','session','m_no','email_id'+")"+"WHERE enrol_no="+n;
			st.execute(query);
		}catch(SQLException s) {
			System.out.println("Can not connect to the database. "+s);
		}
	}
	void deleteRecord() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the enrolment number for which you want to delete the record: ");
		int n=in.nextInt();
		try {
			Statement st=con.createStatement();
			String query="DELETE FROM Student WHERE enrol_no="+n;
			st.execute(query);
		}catch(SQLException s) {
			System.out.println("Can not connect to the database. "+s);
		}
	}
	void searchRecord() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the enrolment number for which you want to search the record: ");
		int n=in.nextInt();
		try {
			Statement st=con.createStatement();
			String query="SELECT * FROM Student WHERE enrol_no="+n;
			st.execute(query);
		}catch(SQLException s) {
			System.out.println("Can not connect to the database. "+s);
		}
	}
	void displayRecord() {
		try {
			Statement st=con.createStatement();
			String query="SELECT * FROM Student";
			st.execute(query);
		}catch(SQLException s) {
			System.out.println("Can not connect to the database. "+s);
		}
	}
}
class TestStudentInfo {
	public static void main(String[] args) {
		String driver="sun.jdbc.odbc.JdbcOdbcDriver";
		String url="jdbc:odbc:JavaTest";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url);
			do {
				System.out.println("M   E   N   U");
				System.out.println("1.Add a new record");
				System.out.println("2.Modify a record");
				System.out.println("3.Delete record");
				System.out.println("4.Search record");
				System.out.println("5.Display all record");
				System.out.println("6.Exit");
			}
			st.close();
			con.close();
		}catch(ClassNotFoundException e){
			System.out.println("Unable to load JDBC/ODBC bridge. "+e);
			System.exit(1);
		}catch(SQLException s) {
			System.out.println("Can not connect to the database. "+s);
		}
	}
}