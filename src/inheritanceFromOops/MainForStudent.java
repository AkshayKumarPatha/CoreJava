package inheritanceFromOops;

public class MainForStudent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRegistration s=new StudentRegistration();
		System.out.println(":::::Student Details:::::");
		 System.out.println(":::PersonalInformation::::");
        System.out.println("Student FirstName::::: "+s.FirstName);
        System.out.println("Student LastName::::: "+s.LastName);
        System.out.println("Student Email::::: "+s.Email);
        System.out.println("Student MobileNumber::::: "+s.MobileNumber);
        System.out.println("Student Gender::::: "+s.Gender);
        System.out.println("Student DateOfBirth::::: "+s.DateOfBirth);
        System.out.println("Student BloodGroup::::: "+s.BloodGroup);
        System.out.println(":::Address Of Student::::");
        System.out.println("H-No::::: "+s.HouseNumber);
        System.out.println("Street::::: "+s.Street);
        System.out.println("LandMark::::: "+s.LandMark);
        System.out.println("District::::: "+s.District);
        System.out.println("State::::: "+s.State);
        System.out.println("Country::::: "+s.Country);
        System.out.println("PinCode::::: "+s.PinCode);
        System.out.println("::::StudentRegistration::::::");
        System.out.println("CollegeId::::: "+s.CollegeId);
        System.out.println("CollegeName::::: "+s.CollegeName);
        System.out.println("BranchName::::: "+s.BranchName);
        System.out.println("StudentId::::: "+s.StudentId);
        System.out.println("YearOfJoin::::: "+s.YearOfJoin);
        System.out.println("YearOfPass::::: "+s.YearOfPass);
	}
	
}
