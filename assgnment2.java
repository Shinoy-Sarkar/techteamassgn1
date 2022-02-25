package introduction;

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
		Car audi= new Car(130,7500000,"red");
		int truckweight=2400;
		Truck mahindra = new Truck(80,0,"grey",truckweight);
		mahindra.setSaleprice(1800000);
		mahindra = new Truck(80,mahindra.getSaleprice(),"grey",truckweight);
		audi.display();
		mahindra.display();
	}

}
