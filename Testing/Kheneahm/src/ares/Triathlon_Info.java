import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Triatholon_Info {
	
	public Triatholon_Info () {
		
	}

	public int getPlace() {
		return Place;
	}

	public void setPlace(int place) {
		Place = place;
	}
	private final StringProperty FirstNames = new SimpleStringProperty(this, "FirstName");

	private final StringProperty LastNames = new SimpleStringProperty(this, "LastName");

	private final StringProperty Number = new SimpleStringProperty(this, "Number");
	
	private final StringProperty RunTime = new SimpleStringProperty(this, "RunTime");
	
	private final StringProperty RunSpeed = new SimpleStringProperty(this, "RunSpeed");

	private final StringProperty BikeTime = new SimpleStringProperty(this, "BikeTime");
	
	private final StringProperty BikeSpeed = new SimpleStringProperty(this, "BikeSpeed");

	private final StringProperty SwimTime = new SimpleStringProperty(this, "SwimTime");

	private final StringProperty SwimSpeed = new SimpleStringProperty(this, "SwimSpeed");

	private final StringProperty TotalTime = new SimpleStringProperty(this, "TotalTime");
	
	private final StringProperty Gender = new SimpleStringProperty(this, "Gender");
	
	//private final StringProperty Rank = new SimpleStringProperty(this, "Rank");
	
	public StringProperty FirstNamesProperty() {
		return FirstNames;
	}
	
	public StringProperty LastNamesProperty() {
		return LastNames;
	}
	
	public StringProperty NumberProperty() {
		return Number;
	}
	
	public StringProperty RunProperty() {
		return RunTime;
	}
	
	public StringProperty RunSpeedProperty() {
		return RunSpeed;
	}
	
	public StringProperty BikeProperty() {
		return BikeTime;
	}
	
	public StringProperty BikeSpeedProperty() {
		return BikeSpeed;
	}
	
	public StringProperty SwimProperty() {
		return SwimTime;
	}
	
	public StringProperty SwimSpeedProperty() {
		return SwimSpeed;
	}
	
	public StringProperty TotalProperty() {
		return TotalTime;
	}
	
	public StringProperty GenderProperty() {
		return Gender;
	}
	
//	public StringProperty RankProperty() {
//		return Rank;
//	}
	
	public final String getFirstNames() {
		return FirstNamesProperty().get();
	}
	public final String getLastNames() {
		return LastNamesProperty().get();
	}
	
	public final String getNumber() {
		return NumberProperty().get();
	}
	
	public final String getRunTime() {
		return RunProperty().get();
	}
	
	public final String getRunSpeed() {
		return RunSpeedProperty().get();
	}
	
	public final String getBikeTime() {
		return BikeProperty().get();
	}
	
	public final String getBikeSpeed() {
		return BikeSpeedProperty().get();
	}
	
	public final String getSwimTime() {
		return SwimProperty().get();
	}
	
	public final String getSwimSpeed() {
		return SwimSpeedProperty().get();
	}
	
	public final String getTotalTime() {
		return TotalProperty().get();
	}
	
	public final String getGender() {
		return GenderProperty().get();
	}
	
//	public final String getRank() {
//		return RankProperty().get();
//	}
	public final void setFirstNames(String fnames) {
		FirstNamesProperty().set(fnames);
	}
	public final void setLastNames(String lnames) {
		LastNamesProperty().set(lnames);
	}
	
	public final void setNumber(String number) {
		NumberProperty().set(number);
	}
	
	public final void setRun(String runTime) {
		RunProperty().set(runTime);
	}
	
	public final void setRunSpeed(String runSpeed) {
		RunSpeedProperty().set(runSpeed);
	}
	
	public final void setBike(String bikeTime) {
		BikeProperty().set(bikeTime);
	}
	
	public final void setBikeSpeed(String bikeSpeed) {
		BikeSpeedProperty().set(bikeSpeed);
	}
	public final void setSwim(String swimTime) {
		SwimProperty().set(swimTime);
	}
	
	public final void setSwimSpeed(String swimSpeed) {
		SwimSpeedProperty().set(swimSpeed);
	}
	
	public final void setTotal(String totalTime) {
		TotalProperty().set(totalTime);
	}
	
	public final void setGender(String gender) {
		GenderProperty().set(gender);
	}
	
//	public final void setRank(String rank) {
//		RankProperty().set(rank);
//	}
	public Triatholon_Info(int Place, String FirstNames, String LastNames, String Number,
			String RunTime, String RunSpeed, 
			String BikeTime, String BikeSpeed,
			String SwimTime, String SwimSpeed,
			String TotalTime, String Gender) {
		setPlace(Place);
		setFirstNames(FirstNames);
		setLastNames(LastNames);
		setNumber(Number);
		setRun(RunTime);
		setRunSpeed(RunSpeed);
		setBike(BikeTime);
		setBikeSpeed(BikeSpeed);
		setSwim(SwimTime);
		setSwimSpeed(SwimSpeed);
		setTotal(TotalTime);
		setGender(Gender);
//		setRank(Rank);
		
	}
	
	
}

