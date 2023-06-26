package com.project;

public class Main {

    public static void main(String[] args) {
        System.out.println("THE REVERSE STRING  : " + MyString.reverseString("Computer Science."));
        System.out.println("IS PALINDROME OR NOT : " + MyString.isPalindrome("madam im "));
        System.out.println("THE SHORT HANDED : " + MyString.shortHanded("Do you for  remember the I u"));

        System.out.println("THE NUMBER OF SENTENCES : " + MyString.numberOfSentences("DataScience. Java Programming? Python !"));
        System.out.println("THE NUMBER OF WORDS MORE THAN 3 CHAR : " + MyString.numberOfWords("one two three four fiver six seven "));
    }
}
