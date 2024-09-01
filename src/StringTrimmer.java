/*
Question 2: Problem Statement:
Write a Java program to trim leading and trailing spaces from the string " Hello, World! ". Print the resulting string to the console.

Expected Output: Hello, World!

Solution to Question 2:

 */
public class StringTrimmer {
    public static void main(String[] args) {
        String text = " Hello, World! ";
        text = text.trim();
        System.out.println(text);

    }

}
