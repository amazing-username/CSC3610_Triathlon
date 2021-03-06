
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Triatholon_DBaseDriver {
		private int i=1;
		private int j=1;
		private Connection csc3610conn;
	
		public Triatholon_DBaseDriver(String dbURL, String user, String password) throws SQLException {
				
		csc3610conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ath_info", "root", "password");	
		}
	
	
	public void shutdown() throws SQLException {
		if(csc3610conn != null){
			csc3610conn.close();
		}
	}
	
	public List<Triatholon_Info> getMaleAthleteInfo() throws SQLException {
		try(
			
			Statement stmt = csc3610conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from male_athletes");
				) {
			List<Triatholon_Info> athList = new ArrayList<>();
			while (rs.next()){
				int Place = i;
				String FirstNames = rs.getString("FirstName");
				String LastNames = rs.getString("LastName");
				String Number = rs.getString("Number");
				String RunTime = rs.getString("RunTime");
				String RunSpeed = rs.getString("RunSpeed");
				String BikeTime = rs.getString("BikeTime");
				String BikeSpeed = rs.getString("BikeSpeed");
				String SwimTime = rs.getString("SwimTime");
				String SwimSpeed = rs.getString("SwimSpeed");
				String TotalTime = rs.getString("TotalTime");
				String Gender = rs.getString("Gender");

				Triatholon_Info athInfo = new Triatholon_Info(Place, FirstNames, LastNames, Number,
						RunTime, RunSpeed, 
						BikeTime, BikeSpeed, 
						SwimTime, SwimSpeed,
						TotalTime, Gender);
				athList.add(athInfo);
				i++;
			}
			return athList;
		}
		
	}
	
	public List<Triatholon_Info> getFemaleAthleteInfo() throws SQLException {
		try(
			Statement stmt = csc3610conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from female_athletes");
				) {
			List<Triatholon_Info> athleteList = new ArrayList<>();
			while (rs.next()){
				int Place = j;
				String FirstNames = rs.getString("FirstName");
				String LastNames = rs.getString("LastName");
				String Number = rs.getString("Number");
				String RunTime = rs.getString("RunTime");
				String RunSpeed = rs.getString("RunSpeed");
				String BikeTime = rs.getString("BikeTime");
				String BikeSpeed = rs.getString("BikeSpeed");
				String SwimTime = rs.getString("SwimTime");
				String SwimSpeed = rs.getString("SwimSpeed");
				String TotalTime = rs.getString("TotalTime");
				String Gender = rs.getString("Gender");

				Triatholon_Info athInfo = new Triatholon_Info(Place, FirstNames, LastNames, Number, 
						RunTime, RunSpeed, 
						BikeTime, BikeSpeed,
						SwimTime, SwimSpeed,
						TotalTime, Gender);
				athList.add(athInfo);
				j++;
				}
			
			return athleteList;
		}


		
	}
}
