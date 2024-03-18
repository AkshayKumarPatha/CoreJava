package list;

public class Student {
	
	String name;
	Integer sID;
	Long mNO;
	String email;
	Character gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public Long getmNO() {
		return mNO;
	}
	public void setmNO(Long mNO) {
		this.mNO = mNO;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sID=" + sID + ", mNO=" + mNO + ", email=" + email + ", gender=" + gender
				+ "]";
	}

}
