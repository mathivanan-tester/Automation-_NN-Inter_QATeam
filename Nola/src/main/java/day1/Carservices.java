package day1;

public class Carservices {

	public static void main(String[] args) {
		
		  Car car = new Car();

	        // Calling Variables
	        System.out.println("Brand      : " + car.brand);
	        System.out.println("Model Year : " + car.modelYear);

	        // Calling Functions
	        System.out.println(car.carBrand());
	        System.out.println("Car Type   : " + car.carType());

	        car.carDetails();
	    }
	}
