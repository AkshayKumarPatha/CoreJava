package inheritanceFromOops;

public class MainForEmployer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployerRegistration s=new EmployerRegistration();
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
        System.out.println("::::EmployerRegistration::::::");
        System.out.println("EmployId::::: "+s.EmployId);
        System.out.println("CompanyName::::: "+s.CompanyName);
        System.out.println("Role::::: "+s.Role);
        System.out.println("SalaryPreYear::::: "+s.SalaryPreYear);
        System.out.println("SalaryPreMonth::::: "+s.SalaryPreMonth);
        System.out.println("YearOfJoin::::: "+s.YearOfJoin);

}
}
