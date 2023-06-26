package com.project;

public class MyString {

    public MyString() {
    }

    public static String reverseString(String st){
        String reverse ="";
        for(int i=st.length()-1; i>=0; i--){
            reverse+=st.charAt(i);
        }

        return reverse;
    }

    public static boolean isPalindrome(String st){
        st = st.toLowerCase();
        st=st.replaceAll(" ", "");


        if(reverseString(st).equalsIgnoreCase(st)){
            return true;

        }
        return false;

    }

    public static String shortHanded(String st){
        String st1= st.replace("and", "&");
        String st2 = st1.replace("for", "4");
        String st3 = st2.replace("to", "2");
        String st4 = st3.replace("you", "U");
        String[] st5= st4.split(" ");
        String st6="";
        for(int i=0; i<st5.length; i++){
            if(st5[i].length()>1){
                st6 = st5[i].replaceAll("[aeiouAEIOU]", " ");

            }

            else {
                st6+=st5[i];
            }
        }

        return st6;
    }

    public static int numberOfSentences(String st){
        String[] stringArray= st.split("[?!.]");
        return stringArray.length;
    }

    public static int numberOfWords(String st){
        String[] stringArray= st.split(" ");
        int counter=0;
        for(int i=0; i<stringArray.length; i++){
            if(stringArray[i].length()>3){
                counter++;
            }
        }

        return counter;
    }
}
