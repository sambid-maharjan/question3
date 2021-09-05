import java.sql. * ;

class Connect {
    public static void main(String args[]) {
        System.out.println("haha");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myconnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/oracle","inspiron","ubuntu");
            Statement mystatement = myconnection.createStatement();
	   ResultSet myresultset = mystatement.executeQuery("select * from eve");
            System.out.println("Connected");
            if (myresultset.next()) {
                System.out.println("user Id: " + myresultset.getString("id"));
                System.out.println("user Name: " + myresultset.getString("last_name"));
                System.out.println("user Name: " + myresultset.getString("first_name"));
                // System.out.println("Employee ID : " + myresultset.getString("ID"));
		// // System.out.println("Employee Age : " + myresultset.getString("AGE"));
                // System.out.println("Employee Name : " + myresultset.getString("FIRST_NAME") + " " + myresultset.getString("LAST_NAME"));
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
