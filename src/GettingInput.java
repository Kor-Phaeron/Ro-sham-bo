import java.util.Scanner;

class GettingInput{
    public static String getInput(Scanner scn1, String prompt) { // Get valid user input
        System.out.println(prompt); // Tell user what to input
        String text = "";
        while (true) { // Keep looping until valid input is found
            text = scn1.nextLine(); // Get input from stdin
            if(isInteger(text)) // Check if they put in integer
                break; // Exit loop
            System.out.print("Try again, " + prompt); // Wasn't valid, prompt again
        }
        return text; // Return valid user input
    }

    private static boolean isInteger(String str) { // Check if string is integer
        try {
            Integer.parseInt(str); // If this doesn't fail then it's integer
            return true;
        } catch(NumberFormatException e) {
            return false; // Wasn't integer
        }
    }
}