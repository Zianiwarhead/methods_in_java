import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        Methods methods = new Methods();
        methods.findLargestAndSmallest();
    }

    public void findLargestAndSmallest() {
        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = inputDevice.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = inputDevice.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = inputDevice.nextInt();

        int maximumValue, minimumValue;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            maximumValue = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            maximumValue = secondNumber;
        } else {
            maximumValue = thirdNumber;
        }

        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            minimumValue = firstNumber;
        } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            minimumValue = secondNumber;
        } else {
            minimumValue = thirdNumber;
        }

        System.out.println("The smallest number: " + minimumValue);
        System.out.println("The largest number: " + maximumValue);
        System.out.println(maximumValue + " is your largest and " + minimumValue + " is your smallest number.");

        inputDevice.close();
    }
}
