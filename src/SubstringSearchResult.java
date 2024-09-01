/*
Question 7: Problem Statement:
Create a Java program to determine the index of the substring "Java" in the string "Hello, world!". If the substring is not found, print "-1".

Expected Output: -1

Solution to Question 7:

 */
public class SubstringSearchResult {
    public static void main(String[] args) {
        String text = "Hello, world!";
        int index = text.indexOf("Java");
        System.out.println(index);
    }
}