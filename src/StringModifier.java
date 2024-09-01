/*
Question 4: Problem Statement:
Create a Java program that trims the string " ERROR ", converts it to lowercase, and then replaces 'error' with 'warning'. Print the final string.

Expected Output: warning

Solution to Question 4:
 */
public class StringModifier {
    public static void main(String[] args) {
        String text = " ERROR ";
        text = text.toLowerCase().replaceAll("error", "warning");
        System.out.println(text);
    }
}

