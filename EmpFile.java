package Employee;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class EmpFile {
		
	static void addEmployee(Scanner sc) {
		try {
			 FileWriter fw=new FileWriter("C:\\Users\\nehap\\OneDrive\\Desktop\\Practice\\Project4\\src\\EmployeeFile.txt",true);
		
		System.out.println("Enter Employee ID:");
		int id=sc.nextInt();
		//fw.write(id);
		sc.nextLine();
		
		System.out.println("Enter Employee Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Employee Age:");
		int age=sc.nextInt();
		
		System.out.println("Enter Employee Salary:");
		double salary=sc.nextInt();
		
		fw.write(id+" "+name+" "+age+" "+salary +"\n");
		System.out.println();
		fw.close();
		}
		catch(IOException e) {
			System.out.println("File Write Error");
		}
	}
	static void displayDetails() {
		 try {
			 FileReader fr=new FileReader("C:\\\\Users\\\\nehap\\\\OneDrive\\\\Desktop\\\\Practice\\\\Project4\\\\src\\\\EmployeeFile.txt");
			 
			 int ch; 
             System.out.println("---Report---");

             while((ch=fr.read())!=-1) {
            	 System.out.print((char)ch);
             }
             System.out.println();
             System.out.println("---End Of Report---");
             fr.close();
		 }
		 catch(IOException e) {
			 System.out.println("No Employee Records found.");
		 }
		 
	}

	public static void main(String[] args) {
		
		try {
		   FileWriter fw=new FileWriter("C:\\Users\\nehap\\OneDrive\\Desktop\\Practice\\Project4\\src\\EmployeeFile.txt",true);
		}
		catch(IOException e) {
			System.out.println("Exception: "+e);
		}
		
		    Scanner sc=new Scanner(System.in);
		    int n;
	     do {
			System.out.println("Main Menu:");
			System.out.println("1.Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			
			System.out.println("Enter a number: ");
			 n=sc.nextInt();
			sc.nextLine();
			
			switch(n) {
			case 1:
				 addEmployee(sc);
				 break;
				
			case 2:
				displayDetails();
				break;
				
			case 3:
				System.out.println("Exiting the System");
				break;
			}
			
			}while(n!=3); 
			
		sc.close();
		
	}
	

	

}
