package model;

public class Classroom {

	private String building;
	private String roomNumber;
	private String campus;
	private String type;
	private int capacity;
	
	public Classroom() {
		super();
	}
	public Classroom(String building, String roomNumber, String campus, String type, int capacity) {
		super();
		this.building = building;
		this.roomNumber = roomNumber;
		this.campus = campus;
		this.type = type;
		this.capacity = capacity; 
	}
	@Override
	public String toString() {
		return "Classroom [Building=" + building + ", roomNumber=" + roomNumber + ", campus=" + campus + ", type="
				+ type + ", capacity=" + capacity + "]";
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	
	
}
