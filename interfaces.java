package javaexamplesday1;
@FunctionalInterface
interface laptops {
	void brand();
	 default void model() {
        System.out.println("realmeharddiskmodel1");
    }
	 static void model1()
	 {
		 
	 }
	 
}

interface realmemobile {
	void display();
}
class person implements laptops,realmemobile
{
	public void brand() {
        System.out.println("hp");
    }
    
	@Override
	public void display() {
		System.out.println("5.6 inch display");
		
	}

	

	
}

public class interfaces {

	public static void main(String[] args) {
		person x=new person();
		x.brand();
		x.display();
		x.model();

	}

}
