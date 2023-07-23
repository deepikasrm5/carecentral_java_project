package in.deepikasriram.carecentral.model;

public abstract class UserEntity implements Comparable<UserEntity>{
	private Integer userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	private boolean isActive = true;
	
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	
	
	public String fullName() {
		return firstName.concat(" ").concat(lastName);
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", password=" + password + ", isActive=" + isActive + "]";
	}
	
	@Override
	public int compareTo(UserEntity o) {

		if (this.getUserId() == o.getUserId()) {
			return 0;
		} else {
			if (this.getUserId() > o.getUserId()) {
				return 1;
			} else {
				return -1;
			}
		}
	}
	
}
