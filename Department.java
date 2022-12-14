import java.util.Scanner;

public class Department {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxcapacity=999;
	private String email;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String companySuffix="company.com";

	public static void main (String[] args) {
	}
	public void Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created:"+this.firstName+" "+this.lastName);
		
		this.department=setDepartment();
		System.out.println("Department: "+this.department);
		
		
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is:"+password);


		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@" +department+"."+companySuffix;
	     System.out.println("Your email is:"+email);
	}
	
	private String setDepartment() {
		System.out.print("New Worker: "+firstName + "\nDEPARTMENT CODES:\n1 for Techanical\n2 for Admin\n3 for HR\n4 for Legal\nEnter the department code: ");
		try (Scanner in = new Scanner(System.in)) {
			int depchoice=in.nextInt();
			if(depchoice==1) {
				return "Techanical";
			}
			else if(depchoice==2) {
				return "Admin";
			}
			else if(depchoice==3) {
				return "HR";
			}
			  else if(depchoice==4) {
			       return "Legal";
			  }  
			else {
				return "";
			}
		}
	}
	
	private String randomPassword(int length) {
		String passwordSet= "3636";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int) (Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxcapacity=capacity;
	}
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailboxCapacity() { return mailboxcapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getPassword() { return password; }
	
	public String showinfo() {
		return "DISPLAY NAME: "+firstName+" "+lastName+
				"\nCOMPANY EMAIL: "+email+
				"\nMAILBOX CAPACITY: "+mailboxcapacity+"mb"+"\n";
	}

}
