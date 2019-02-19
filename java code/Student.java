import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Student 
{
	String name[] = new String[100];
	String UID[] = new String[100];
	String email[] = new String[100];
	String phone[] = new String[100];
	Double cgpa[] = new Double[100];
	Scanner sc = new Scanner(System.in);
	public void addStudent(int n )
	{
		for(int i=0;i<n;i++)
		{
			String ui,em;
			String ph;
			double cg;
			boolean flag = true;
			System.out.println("Insert the details for student"+(i+1)+" : ");
			System.out.print("Enter the name: ");
			name[i] = sc.next();
			while(flag)
			{
				System.out.print("Enter the uid in format (16BCS1147): ");
				ui = sc.next();
				if(authUID(ui))
				{
					UID[i] = ui;
					flag = false;
				}
				else
				{
					System.out.println("You have entered the wrong UID. Please enter the valid one.");
				}
			}
			flag = true;
			while(flag)
			{
				System.out.print("Enter the email: ");
				em = sc.next();
				if(authEmail(em))
				{
					email[i] = em;
					flag = false;
				}
				else
				{
					System.out.println("you have enetered the wrong email. Please enter the valid email again.");
				}
			}
			flag = true;
			while(flag)
			{
				System.out.print("Enter the phone: ");
				ph = sc.next();
				if(authPhone(ph))
				{
					phone[i] = ph;
					flag = false;
				}
				else
				{
					System.out.println("you have enetered the wrong phone. Please enter the valid phone again.");
				}
			}
			flag = true;
			while(flag)
			{
				System.out.print("Enter the cgpa: ");
				cg = sc.nextDouble();
				if(cg>0 && cg<10.0)
				{
					cgpa[i] = cg;
					flag = false;
				}
				else
				{
					System.out.println("You have entered the wrong cgpa. Please enter the valid cgpa again.");
				}
			}
		}
		System.out.println("Your data entered successfully.....\n");
	}
	
	public void display(int n)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("\nThe details of student"+(i+1)+"are: ");
			System.out.println("The name of student: "+name[i]);
			System.out.println("The UID of student: "+UID[i]);
			System.out.println("The CGPA of student: "+cgpa[i]);
			System.out.println("The email of student: "+email[i]);
			System.out.println("The phone of student: "+phone[i]);
		}
	}
	public boolean authUID(String roll)
	{
		if(roll.length()==9)
			return true;
		else
			return false;
	}
	public boolean authEmail(String mail)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
		Pattern pat = Pattern.compile(emailRegex); 
		if (mail == null) 
			return false; 
		return pat.matcher(mail).matches(); 
	}
	public boolean authPhone(String phone)
	{
		Pattern p = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
        Matcher m = p.matcher(phone); 
        return (m.find() && m.group().equals(phone)); 
	}
}
