package day1;

public class Car {
	  String brand = "BMW";
	    int modelYear = 2025;

	    // Function 1 - String return type
	    public String carBrand() {
	        return "Car Brand: " + brand;
	    }

	    // Function 2 - Boolean return type
	    public boolean carType() {
	        return true;
	    }

	    // Function 3 - Void return type
	    public void carDetails() {
	        System.out.println("Model Year: " + modelYear);
	    }
	}

