/*
Question 3: Problem Statement:
Given two strings, " Java" and "Java ", write a Java program that trims both strings and then checks if they are equal after trimming. Print "Equal" if they are the same, otherwise print "Not Equal".

Expected Output: Equal

Solution to Question 3:

 */
public class StringEqualityChecker {
    public static void main(String[] args) {
        String text1 = " Java";
        String text2 = "Java ";
        text1 = text1.trim();
        text2 = text2.trim();
        if (text1.equals(text1)) {
            System.out.println("Equal");

        } else {
            System.out.println("Not equal");

        }
    }
}
