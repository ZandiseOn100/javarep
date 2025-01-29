import java.util.*;

public class CustomerServiceApp {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("---Welcome to Customer services!---");
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("1. Zulu\n" + //
                "2. Xhosa\n" + //
                "3. Afrikaans\n" + //
                "4. English\n" + //
                "5. Pedi\n" + //
                "6. Tswana\n" + //
                "7. Sotho\n" + //
                "8. Tsonga\n" + //
                "9. Swati\n" + //
                "10. Venda\n" + //
                "11. Ndebele");
        System.out.println("Enter a language that you'd like to be assisted in: ");
        String userInput = scannerInput.nextLine().toLowerCase();

        if (userInput.equals("zulu")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("xhosa")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("afrikaans")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("english")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("pedi")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("tswana")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("sotho")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("tsonga")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("swati")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("venda")) {
            System.out.println("Chosen language is: " + userInput);
        } else if (userInput.equals("ndebele")) {
            System.out.println("Chosen language is: " + userInput);
        } else {
            System.out.println("Error: language not in the list!");
        }
    }
}