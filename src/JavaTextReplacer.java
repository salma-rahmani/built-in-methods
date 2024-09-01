/*
Question 1: Problem Statement:
Create a Java program that replaces the word "Java" with "JAVA" in the string "Java is more than just Java, it's a platform!".
Ensure that only the exact word "Java" is replaced and not parts of other words.

Expected Output: JAVA is more than just JAVA, it's a platform!

Solution to Question 1:
 */
public class JavaTextReplacer {
    public static void main(String[] args) {
        String text = "Java is more than just Java, it's a platform!";
        text = text.replaceAll("Java", "JAVA");
        System.out.println(text);

    }
}

