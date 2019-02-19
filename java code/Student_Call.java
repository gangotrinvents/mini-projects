import java.util.Scanner;
public class Student_Call {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter how much student's data you want to feed in: ");
		n = sc.nextInt();
		Student obj = new Student();
		obj.addStudent(n);
		int choice;
		System.out.println("Are you want to see the entered data of students(1-yes/0-no): ");
		choice = sc.nextInt();
		if(choice==1)
		{
			obj.display(n);
		}
		else
		{
			System.out.println("Thannks for using my system.....");
		}
		
	}

}
