import java.util.Scanner;


public class ComputeAreaWithConsoleInput {

	public static void main(String[] args) {
		System.out.println("Please Input a number :");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = radius * radius * 3.14159;
        System.out.println("The area for the circle of radius " + radius 
        		+ " is " + area);
        input.close();
	}

}
