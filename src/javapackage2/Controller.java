package javapackage2;

public class Controller {
	//You could create a second controller,
	//and put the main method there,
	//then create a controller object.
	public static void main(String[] args) {
	//Initialize model
	Model number = new Model();
	//Execute business logic
	Controller.getSumAndAverage(number);
	//Set view
	View.printSum(number.sum, number.average);
	}
	//Logic method
	private static void getSumAndAverage(Model numbers){
	for (int i=1; i < 10; i++){
	//Here the controller interfaces with
	//the model
	numbers.sum = numbers.sum + i;
	numbers.average = numbers.sum/i;
	}
	}
	}
