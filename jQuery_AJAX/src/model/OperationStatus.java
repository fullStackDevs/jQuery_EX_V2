package model;

public class OperationStatus {
	private boolean status;
	private int insertedID;
	private String message;
	
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getInsertedID() {
		return insertedID;
	}
	public void setInsertedID(int insertedID) {
		this.insertedID = insertedID;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
