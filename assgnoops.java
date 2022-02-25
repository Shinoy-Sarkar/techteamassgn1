package introduction;
import java.util.Scanner;
class Student{
	String name;
	int roll_number;
	float marks;
	int attendence;
    Student(String name,int roll_number,float marks,int attendence){
		this.name=name;
		this.roll_number=roll_number;
		this.marks=marks;
		this.attendence=attendence;
	}
    public void setName(String name) {
    	this.name=name;
    }
    public String getname(){
	    return name;
    }
    public void setrollnumber(int roll_number) {
    	this.roll_number=roll_number;
    }
    public int getrollnumber() {
	    return roll_number;
    }
    public void setmarks(float marks) {
    	if(marks<0) {
    		this.marks=0;
    	}else {
    		this.marks=marks;
    	}
    }
    public float getmarks() {
	    return marks;
    }
    public void setattendence(int attendence) {
    	this.attendence=attendence;
    }
    public int getattendence() {
	    return attendence;
    }
    void display() {
    	System.out.println("Name:- "+ name+"\n"+"Roll Number:- "+roll_number+"\n"+"Marks:- "+marks+"\n"+"Attendence:-"+attendence+"%"+"\n");
    	if(attendence>75) {
    		marks*=1.10;
    		if(marks>100) {
    			marks=100;
    		}
    		System.out.println("Data after attendence evaluation:---"+"\n"+"Name:- "+ name+"\n"+"Roll Number:- "+roll_number+"\n"+"Marks:- "+marks+"\n"+"Attendence:-"+attendence+"%"+"\n");
    	}
    	System.out.println("\n"+"--------------------------"+"\n");
    }
    
}
public class assgnoops {  
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter name of student 1:- ");
		String name1=sc1.nextLine();
		System.out.println("Enter marks of student1 :- ");
		float marks1=sc1.nextFloat();
		System.out.println("Enter attendence percentages of student1 :- ");
		int attendence1=sc1.nextInt();
		System.out.println("Enter rollnumber of student1 :- ");
		int roll_number1=sc1.nextInt();
		System.out.println("enter name of student 2:- ");
		String name2=sc2.nextLine();
		System.out.println("Enter marks of student 2 :- ");
		float marks2=sc2.nextFloat();
		System.out.println("Enter attendence percentages of student 2 :- ");
		int attendence2=sc2.nextInt();
		System.out.println("Enter rollnumber of student 2 :- ");
		int roll_number2=sc2.nextInt();
		Student s1 = new Student(name1,roll_number1,marks1,attendence1);
		Student s2 = new Student(name2,roll_number2,marks2,attendence2);
		s1.setmarks(marks1);
		s2.setmarks(marks2);
		s1.display();
		s2.display();
		

	}

}
