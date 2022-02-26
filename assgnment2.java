package introduction;
import java.util.Scanner;
class Car{
	int speed;
	float regularPrice;
	String color;
	void setSaleprice(float f) {
		regularPrice=f;
	}
	float getSaleprice() {
		return regularPrice;
	}
	Car(int s,float r,String c){
		speed =s;
		regularPrice=r;
		color=c;
	}
	void display(){
		System.out.println("car:- audi "+"speed:- "+speed+"km/hr"+ " regularPrice:- "+regularPrice+"rupees"+ " color:- "+color+"\n");
	}
    }
    class Truck extends Car{
	Truck(int s, float r, String c,int weight) {
		super(s, r, c);
		this.weight=weight;
		// TODO Auto-generated constructor stub
	}
	int weight;
	float getSaleprice() {
		if(weight>2300) {
			return(float) ((float)regularPrice*0.9);
		}
		return(float) ((float)regularPrice*0.8);
	}
	void display(){
		System.out.println("Truck:- mahindra "+"weight:- "+ weight+"kg"+" speed:- "+speed+"km/hr"+" regularPrice:- "+regularPrice+"rupees"+" color:- "+color+"\n");
	}
}

    public class assgnment2 {

	  public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter speed of the audi:- ");
		int speed1 = sc1.nextInt();  
		System.out.println("Enter price of the audi");
		int price1 = sc1.nextInt();	
		System.out.println("Enter color of car 1:- ");
		String color1 = sc1.next();
	    System.out.println("Enter weight of mahindra truck:- ");
		int truckweight=sc2.nextInt();
		System.out.println("Enter speed of truck mahindra:- ");
		int speed2 = sc2.nextInt();
		System.out.println("Enter price of truck mahindra:- ");
		int price2 = sc2.nextInt();
		System.out.println("Enter color of Truck mahindra:- ");
		String color2 = sc2.next();
		Car audi= new Car(speed1,price1,color1);
		Truck mahindra = new Truck(speed2,price2,color2,truckweight);
		mahindra = new Truck(80,mahindra.getSaleprice(),color2,truckweight);
		audi.display();
		mahindra.display();
	}

}
