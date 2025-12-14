package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql {
	private String url="jdbc:mysql://localhost:3306/haj_said";
	private String user="root";
	private String ps="";
  public Connection connect() {
	  try {
		return DriverManager.getConnection(url,user,ps);
	  } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	  }
  }
}
