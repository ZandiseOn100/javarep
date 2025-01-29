import java.util.Scanner;

class Calculator{
 public static void main(String [] args){
     
     Scanner scannerInput = new Scanner(System.in);
     System.out.println("Enter the first number to add ");
     String userPromptOne = scannerInput.nextLine();
     
     System.out.println("Enter the second number to add ");
     String userPromptTwo = scannerInput.nextLine();
     
     System.out.println("Enter a third number multiply");
     String userPromptThree = scannerInput.nextLine();
     
     System.out.println("Enter 4th number to multiply");
     String userPromptFour = scannerInput.nextLine();
     
     System.out.println("Enter 5th number to devide ");
     String userPromptFive = scannerInput.nextLine();
     
     System.out.println("Enter 6th number to devide");
     String userPromptSix = scannerInput.nextLine();
     
     System.out.println("Enter 7th number to subtract ");
     String userPromptSeven = scannerInput.nextLine();
     
     System.out.println("Enter 8th number to subtract ");
     String userInputEight = scannerInput.nextLine();
     
     
     // converting strings to integers
     int numberOne = Integer.parseInt(userPromptOne);
     int numberTwo = Integer.parseInt(userPromptTwo);
     
     int numberThree = Integer.parseInt(userPromptThree);
     int numberFour = Integer.parseInt(userPromptFour);
     
     int numberFive = Integer.parseInt(userPromptFive);
     int numberSix = Integer.parseInt(userPromptSix);
     
     int numberSeven = Integer.parseInt(userPromptSeven);
     int numberEight = Integer.parseInt(userInputEight);
     
     
     int sum = numberOne + numberTwo;
     double product = numberThree * numberFour;
     float quotient = 0;
     //Prevent division by 0
     if(numberSix != 0){
         quotient = (float) numberFive / numberSix;
     }else {
            System.out.println("Error: Division by zero is not allowed.");
        }
     
     int difference = numberSeven - numberEight;
     
     System.out.println("Sum is " + sum);
     System.out.println("Product is " + product);
     if(numberSix != 0){
        System.out.println("Quotient is " + quotient);
     }
     System.out.println("Difference is " + difference);
 }   
}